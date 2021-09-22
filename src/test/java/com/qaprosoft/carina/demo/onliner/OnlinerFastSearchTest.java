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
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerFastSearchTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerFastSearchTest.class);
	
	@BeforeSuite
    public void beforeSuiteFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-BeforeMethod-Child");
	}
	
	
	
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase009 Verify that the user Is Being Redirected to the search results page with relevant search result items after searching for a valid value in the Fast Search field
    public void testUserRedirectedToRelevantItemsSearchingValidValueInFastSearch() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        homePageOnliner.getTopHeaderBar().typeInFastSearchField("chairman 969"); 
        Assert.assertTrue(homePageOnliner.getTopHeaderBar().getFastSearchFieldLink().isClickable(), "Fast Search field is not clickable");
        
//        homePageOnliner.getTopHeaderBar().clickOnUsedGoodsButton();
        


    }    
    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
    
//    //testcase010 (Negative) Verify that the user Gets the message "No results found for this term" or should be redirected to the search results page with irrelevant search result items after searching for an invalid value in the Fast Search field. 
//    public void testUserRedirectedToIrrelevantItemsSearchingInvalidValueInFastSearchOrGetsNoResultsFoundMsg() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//        
//        homePageOnliner.getTopHeaderBar().typeInFastSearchField("@#$%^&");
//        homePageOnliner.getTopHeaderBar().clickOnUsedGoodsButton();
//
//    } 
    
    
    
	@AfterMethod
	public void afterMethodFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-AfterMethod-Child");
	}

	@AfterClass
	public void afterClassFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-AfterTest-Child");
	}
	
	@AfterSuite
    public void afterSuiteFastSearchTestChild() {
		LOGGER.info("@FastSearchTest-AfterSuite-Child");
    }
    
    

}