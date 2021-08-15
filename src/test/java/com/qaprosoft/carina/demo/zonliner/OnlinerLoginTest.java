package com.qaprosoft.carina.demo.zonliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.AuthorizedHomePageOnliner;



/**
 * @author Dmitry Kharevich
 */

public class OnlinerLoginTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass1() {
        
    	  // Open Onliner home page and verify page is opened
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
	
		homePageOnliner.scrollToBottom();
		homePageOnliner.scrollToTop();

	
               
    }
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass2() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();

        
    }    
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass3() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("adaxdeaeca");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("adaxdeaeca");
        
        // Password checking  
        loginPageOnliner.clickOnAuthHelperButton();
    }        
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass4() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("SolvD_@#$%^&_2020");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("SolvD_@#$%^&_2020");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        
    }    
        
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass5() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("dmiterkh@mail.ru");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("111111");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        
        // Click on Auth button
        AuthorizedHomePageOnliner authorizedHomePageOnliner = new AuthorizedHomePageOnliner(getDriver());
        authorizedHomePageOnliner = loginPageOnliner.clickOnAuthButton();

        authorizedHomePageOnliner.scrollToBottom();
        authorizedHomePageOnliner.scrollToTop();
      
    }
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLogPass6() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("dmiterkh.mail.ru");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("111111");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        
        // Click on Auth button
        loginPageOnliner.clickOnAuthButton();
        
    }    

}



