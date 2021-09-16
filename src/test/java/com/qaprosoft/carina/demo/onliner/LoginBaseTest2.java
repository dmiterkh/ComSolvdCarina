package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
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
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class LoginBaseTest2 implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginBaseTest2.class);
	
	public HomePageOnliner homePageOnliner; 
	
	@BeforeSuite
    public void beforeSuite() {
		LOGGER.info("@LoginTest-BeforeSuite-Parent");
    }

	@BeforeTest
	public void beforeTest() {
		LOGGER.info("@LoginTest-BeforeTest-Parent");
	}
	
	@BeforeClass
	public void beforeClass() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeClass-Parent");
		LOGGER.info("!!!");
		
    	// Open Home page
		homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        pause(3.0);
        
        getDriver().manage().window().setSize(new Dimension(1100, 768));
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());

        getDriver().manage().window().setSize(new Dimension(1000, 700));
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());
        
        getDriver().manage().window().maximize();
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());
        
        getDriver().manage().window().setSize(new Dimension(900, 600));
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());
        
        getDriver().manage().window().fullscreen();
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());
        
        getDriver().manage().window().setSize(new Dimension(1100, 768));
        pause(1);
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().isUIObjectPresent());        
	}

	@BeforeMethod
	public void beforeMethod() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeMethod-Parent");
		LOGGER.info("!!!");
		
		//Refresh Home Page
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        pause(3.0);
        
        while (!(homePageOnliner.getTopHeaderBar().getAuthLink().isElementPresent())){
        	homePageOnliner.refresh(); 
        	pause(0.5);
        };
	}

	
	
// Child Class with Child annotations
	
	
	
	@AfterMethod
	public void afterMethod() {
		LOGGER.info("@LoginTest-AfterMethod-Parent");
	}		
	
	@AfterClass
	public void afterClass() {
		LOGGER.info("@LoginTest-AfterClass-Parent");
	}
	
	@AfterTest
	public void afterTests() {
		LOGGER.info("@LoginTest-AfterTest-Parent");
	}
	
    @AfterSuite()
    public void afterSuite() {
    	LOGGER.info("@LoginTest-AfterSuite-Parent");
    }
	   
}