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

public class LoginBaseTestParentAnnotation implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginBaseTestParentAnnotation.class);
	
	public HomePageOnliner homePageOnliner; 
	
	@BeforeSuite
    public void beforeSuiteLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@LoginTest-BeforeSuite-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");
    }

	@BeforeTest
	public void beforeTestLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@LoginTest-BeforeTest-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");	
	}
	
	@BeforeClass
	public void beforeClassLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeClass-Parent-(Parent-Annotation)");
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
	public void beforeMethoLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeMethod-Parent-(Parent-Annotation)");
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
	public void afterMethodLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@LoginTest-AfterMethod-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");
	}		
	
	@AfterClass
	public void afterClassLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@LoginTest-AfterClass-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");
	}
	
	@AfterTest
	public void afterTestsLoginParent() {
		LOGGER.info("!!!");
		LOGGER.info("@LoginTest-AfterTest-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");
	}
	
    @AfterSuite()
    public void afterSuiteLoginParent() {
		LOGGER.info("!!!");
    	LOGGER.info("@LoginTest-AfterSuite-Parent-(Parent-Annotation)");
		LOGGER.info("!!!");
    }
	   
}