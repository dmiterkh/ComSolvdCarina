package com.qaprosoft.carina.demo.Onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.components.Onliner.TopHeaderBar;
import com.qaprosoft.carina.demo.gui.pages.Onliner.AuthorizedPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.LoginPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerLoginTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@BeforeSuite
    public void initTestSuite() {
		System.out.println("@@BeforeSuite");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownTestSuite() {
		System.out.println("@@AfterSuite");
    }

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTests() {
		System.out.println("@AfterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}	
	
  
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase000 Verify that Login page is opened.
    public void testAuthBarIsOpened() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh(); 
        	homePageOnliner.pause(5.0);
        };
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink();
        loginPageOnliner.pause(5.0);
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
        getDriver().close();
        
    }    
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase001 Verify that the user can Activate the login and password fields and can Type in it.
    public void testUserCanActivateFieldsAndCanTypeInIt() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh(); 
        	homePageOnliner.pause(5.0);
        };
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink();
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("adaxdeaeca");
        Assert.assertTrue(loginPageOnliner.getLoginFieldLink().isClickable(), "Login field is not clickable");  
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("adaxdeaeca");
        Assert.assertTrue(loginPageOnliner.getPasswordFieldLink().isClickable(), "Password field is not clickable");
        
        // Password checking  
        loginPageOnliner.clickOnAuthHelperButton();
        loginPageOnliner.pause(5.0);
        
        getDriver().close();

    }        
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase002 Verify that the user can Enter letters in different cases, numbers and special symbols that are different from letters and numbers such as \, |, /,  <, >, *, ?, !, ', ", ~, `, :, ;, &, %, $, #, @, etc. into the login and password fields.
    public void testUserCanEnterLettersNumbersAndSpecialSymbols() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh(); 
        	homePageOnliner.pause(5.0);
        };
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink();
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("SolvD_@#$%^&_2020");
        Assert.assertTrue(loginPageOnliner.getLoginFieldLink().isClickable(), "Login field is not clickable");  
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("SolvD_@#$%^&_2020");
        Assert.assertTrue(loginPageOnliner.getPasswordFieldLink().isClickable(), "Password field is not clickable");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        loginPageOnliner.pause(5.0);
        
        getDriver().close();
        
    }    
        
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase003 Verify that the user can Access his registered personal account through the registration form entering correct login (email) and correct password.
    public void testUserCanAccessAccountThroughEnteringValidLogAndPas() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh(); 
        	homePageOnliner.pause(5.0);
        };
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        AuthorizedPageOnliner authorizedPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink().getAuthorizedPageOnliner("dmiterkh@mail.ru", "111111");
        authorizedPageOnliner.pause(5.0);
        Assert.assertTrue(authorizedPageOnliner.isPageOpened(), "Authorized page is not opened");
//        Assert.assertTrue(homePageOnliner.getTopHeaderBar().clickOnAuthLink().getLoginFieldLink().isClickable(), "Login field is not clickable"); 
//        Assert.assertTrue(homePageOnliner.getTopHeaderBar().clickOnAuthLink().getPasswordFieldLink().isClickable(), "Password field is not clickable");
        
        getDriver().close();
        
    }
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase007 (Negative) Verify that the user Cannot Access his registered personal account through the registration form entering incorrect login (email) and correct password.
    public void testUserCanNotAccessAccountThroughEnteringInvalidLogValidPas() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh();    
        	homePageOnliner.pause(5.0);
        };
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        LoginPageOnliner loginPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink().getNotAuthorizedLoginPageOnliner("dmiterkh.mail.ru", "111111");
        loginPageOnliner.pause(5);  
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Not Authorized Login page is not opened");
//        Assert.assertTrue(loginPageOnliner.getLoginFieldLink().isClickable(), "Login field is not clickable"); 
//        Assert.assertTrue(loginPageOnliner.getPasswordFieldLink().isClickable(), "Password field is not clickable");

        
        getDriver().close();
        
    }    
}