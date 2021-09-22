package com.qaprosoft.carina.demo.onliner;

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

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.pages.onliner.AuthorizedPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LoginPageOnliner;
import com.zebrunner.agent.core.annotation.TestLabel;



public class OnlinerAllTestsWithLoginCodeInParentAnnotation extends LoginBaseTestCodeInParentAnnotation implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerAllTestsWithLoginCodeInParentAnnotation.class);

	@BeforeSuite
    public void beforeSuiteLoginChild() {
		LOGGER.info("@LoginTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestLoginChild() {
		LOGGER.info("@LoginTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassLoginChild() {
		LOGGER.info("@LoginTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodLoginChild() {
		LOGGER.info("@LoginTest-BeforeMethod-Child");
	}

	
	@Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase000 Verify that Login page is opened.
    public void testAuthBarIsOpened() {
               
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.openLoginPageOnliner();
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
    }    
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase001 Verify that the user can Activate the login and password fields and can Type in it.
    public void testUserCanActivateFieldsAndCanTypeInIt() {
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.openLoginPageOnliner();
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("adaxdeaeca");
        Assert.assertTrue(loginPageOnliner.isLoginFieldClickable(), "Login field is not clickable");  
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("adaxdeaeca");
        Assert.assertTrue(loginPageOnliner.isPasswordFieldClickable(), "Password field is not clickable");
        
        // Password checking  
        loginPageOnliner.showPasswordInPasswordField();;
        pause(1);

    }        
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase002 Verify that the user can Enter letters in different cases, numbers and special symbols that are different from letters and numbers such as \, |, /,  <, >, *, ?, !, ', ", ~, `, :, ;, &, %, $, #, @, etc. into the login and password fields.
    public void testUserCanEnterLettersNumbersAndSpecialSymbols() {
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.openLoginPageOnliner();
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Login page is not opened");
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("SolvD_@#$%^&_2020");
        Assert.assertTrue(loginPageOnliner.isLoginFieldClickable(), "Login field is not clickable");  
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("SolvD_@#$%^&_2020");
        Assert.assertTrue(loginPageOnliner.isPasswordFieldClickable(), "Password field is not clickable");
        
        // Password checking
        loginPageOnliner.showPasswordInPasswordField();;
        pause(1);
        
    }    
        
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase003 Verify that the user can Access his registered personal account through the registration form entering correct login (email) and correct password.
    public void testUserCanAccessAccountThroughEnteringValidLogAndPas() {
        
        // Open Authorized page
        AuthorizedPageOnliner authorizedPageOnliner = homePageOnliner.openAuthorizedLoginPageOnliner("dmiterkh@mail.ru", "3909091");
        Assert.assertTrue(authorizedPageOnliner.isPageOpened(), "Authorized page is not opened");
        
        // Return to Home page
        homePageOnliner = authorizedPageOnliner.openHomePageOnliner();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Authorized page is not opened");
        
    }
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase007 (Negative) Verify that the user Cannot Access his registered personal account through the registration form entering incorrect login (email) and correct password.
    public void testUserCanNotAccessAccountThroughEnteringInvalidLogValidPas() {
        
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.openNotAuthorizedLoginPageOnliner("dmiterkh.mail.ru", "3909091"); 
        Assert.assertTrue(loginPageOnliner.isPageOpened(), "Not Authorized Login page is not opened");
        
    }    
    
	@AfterMethod
	public void afterMethodLoginChild() {
		LOGGER.info("@LoginTest-AfterMethod-Child");
	}	
	
	@AfterClass
	public void afterClassLoginChild() {
		LOGGER.info("@LoginTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestLoginChild() {
		LOGGER.info("@LoginTest-AfterTest-Child");
	}
	
    @AfterSuite
    public void afterSuiteLoginChild() {
    	LOGGER.info("@LoginTest-AfterSuite-Child");
    }
}
