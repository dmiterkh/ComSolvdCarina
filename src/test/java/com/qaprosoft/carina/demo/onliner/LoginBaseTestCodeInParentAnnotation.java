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

public class LoginBaseTestCodeInParentAnnotation implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginBaseTestCodeInParentAnnotation.class);
	
	public HomePageOnliner homePageOnliner; 
	
	@BeforeSuite
    public void beforeSuiteLoginParent() {
		LOGGER.info("@LoginTest-BeforeSuite-Parent-(Code-In-Parent-Annotation)");
    }

	@BeforeTest
	public void beforeTestLoginParent() {
		LOGGER.info("@LoginTest-BeforeTest-Parent-(Code-In-Parent-Annotation)");
	}
	
	@BeforeClass
	public void beforeClassLoginParent() {
		LOGGER.info("@LoginTest-BeforeClass-Parent-(Code-In-Parent-Annotation)");
		
    	// Open Home page
		homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        pause(3.0);
        
        getDriver().manage().window().setSize(new Dimension(1100, 768));
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());

        getDriver().manage().window().setSize(new Dimension(1000, 700));
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());
        
        getDriver().manage().window().maximize();
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());
        
        getDriver().manage().window().setSize(new Dimension(900, 600));
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());
        
        getDriver().manage().window().fullscreen();
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());
        
        getDriver().manage().window().setSize(new Dimension(1100, 768));
        pause(1);
        Assert.assertTrue(homePageOnliner.isTopHeaderBarPresent());        
	}

	@BeforeMethod
	public void beforeMethoLoginParent() {
		LOGGER.info("@LoginTest-BeforeMethod-Parent-(Code-In-Parent-Annotation)");
		
		//Refresh Home Page
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Authorization Link is present
        homePageOnliner.refreshPageIfAuthLinkIsNotPresent();
        Assert.assertTrue(homePageOnliner.isAuthLinkElementPresent(), "Element has not been found after 20 attempts");

	}

	
	
// Child Class with Child annotations
	
	
	
	@AfterMethod
	public void afterMethodLoginParent() {
		LOGGER.info("@LoginTest-AfterMethod-Parent-(Code-In-Parent-Annotation)");
	}		
	
	@AfterClass
	public void afterClassLoginParent() {
		LOGGER.info("@LoginTest-AfterClass-Parent-(Code-In-Parent-Annotation)");
	}
	
	@AfterTest
	public void afterTestsLoginParent() {
		LOGGER.info("@LoginTest-AfterTest-Parent-(Code-In-Parent-Annotation)");
	}
	
    @AfterSuite()
    public void afterSuiteLoginParent() {
    	LOGGER.info("@LoginTest-AfterSuite-Parent-(Code-In-Parent-Annotation)");
    }
	   
}