package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
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

public class OnlinerFastSearchTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerFastSearchTest.class);
	
	@BeforeSuite
    public void beforeSuiteLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeSuite-Child");
		LOGGER.info("!!!");
    }

	@BeforeTest
	public void beforeTestLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeTest-Child");
		LOGGER.info("!!!");
	}

	@BeforeClass
	public void beforeClassLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeClass-Child");
		LOGGER.info("!!!");        
	}

	@BeforeMethod
	public void beforeMethodLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeMethod-Child");
		LOGGER.info("!!!");
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
    
    

}