package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VacanciesPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VideoPageOnliner;


/**
 * @author Dmitry Kharevich
 */

public class OnlinerVideoTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerVideoTest.class);
	
	private  HomePageOnliner homePageOnliner;
	
	@BeforeSuite
    public void beforeSuiteVideoTestChild() {
		LOGGER.info("@VideoTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestVideoTestChild() {
		LOGGER.info("@VideoTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassVideoTestChild() {
		LOGGER.info("@VideoTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodVideoTestChild() {
		LOGGER.info("@VideoTest-BeforeMethod-Child");
		
    	// Open Home page
    	homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");   

	}
	
	
	
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase017 Verify that the user Gets correct work of youtube video in any article with youtube video
    public void testUserGetsCorrectWorkOfYoutubeVideo() {
    	
        // Open Video page 
    	if (homePageOnliner.isVideoPageLinkPresent()) {
    		VideoPageOnliner videoPageOnliner = homePageOnliner.openVideoPageOnlinerUsualFor();
    		videoPageOnliner.showVideoPageOperations();
    		videoPageOnliner.returnToHomePage();
    		pause(3);
    	} else {   		
    		LOGGER.info("Required Elements are not found on the Home Page");
    	}
        
    }
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase017 Verify that the user Gets correct work of youtube video in any article with youtube video
    public void testUserGetsCorrectWorkOfYoutubeVideoWithForEach() {
    	
        // Open Video page 
    	if (homePageOnliner.isVideoPageLinkPresent()) {
    		VideoPageOnliner videoPageOnliner = homePageOnliner.openVideoPageOnlinerForEach();         		
    		videoPageOnliner.showVideoPageOperations();
    		videoPageOnliner.returnToHomePage();
    	} else {   		
    		LOGGER.info("Required Elements are not found on the Home Page");
    	}
        
    }
    
    
	@AfterMethod
	public void afterMethodVideoTestChild() {
		LOGGER.info("@VideoTest-AfterMethod-Child");
	}

	@AfterClass
	public void afterClassVideoTestChild() {
		LOGGER.info("@VideoTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestVideoTestChild() {
		LOGGER.info("@VideoTest-AfterTest-Child");
	}
	
	@AfterSuite
    public void afterSuiteVideoTestChild() {
		LOGGER.info("@VideoTest-AfterSuite-Child");
    }

}