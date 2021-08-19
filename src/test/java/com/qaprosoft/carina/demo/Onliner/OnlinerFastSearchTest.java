package com.qaprosoft.carina.demo.Onliner;

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
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerFastSearchTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @Test()
    @MethodOwner(owner = "qpsdemo")
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
        
        getDriver().close();

    }    
    
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
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