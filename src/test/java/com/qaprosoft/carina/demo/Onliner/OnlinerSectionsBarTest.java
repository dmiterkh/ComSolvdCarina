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
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.Onliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.LaptopPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.RealEstatePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerSectionsBarTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase011 Verify that the user Is Being Redirected to the list of all categories page with relevant categories of items of any section of the site after clicking on one of the links at the top of the home page
    public void testUserRedirectedToListOfCategoriesWithRelevantCategoriesClickingOnLink() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getTopHeaderBar().openCatalogPageOnliner();
    	catalogPageOnliner.pause(10);
    	
        getDriver().close();
        
    }    
        
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase012 Verify that the user Is Being Redirected to the search results page with relevant search results items after setting on certain options in the search filter for extremely detailed search on the certain section
    public void testExtremelyDetailedSearchWorksCorrectlyForCatalogPage() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getTopHeaderBar().openCatalogPageOnliner();
        
        // Open Computer techics subsection
        catalogPageOnliner.clickOnComputerTechnicsLink();
        
        // Open Computers subsection
        catalogPageOnliner.clickOnComputersLink();
               
        // Open Laptop subsection
        LaptopPageOnliner laptopPageOnliner = catalogPageOnliner.openLaptopPageOnliner();
        
        // Choose producer
        laptopPageOnliner.clickOnProducerCheckboxLink();
        
        // Set value of upper bound price field
        laptopPageOnliner.typeInUpperBoundPriceField("1000");            
        laptopPageOnliner.pause(10);
        
        getDriver().close();
        
    }    

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase013 Verify that the user Is Being Redirected to the search results page with relevant search results items after setting on certain options in the search filter for extremely detailed search on the certain section
    public void testExtremelyDetailedSearchWorksCorrectlyForAutomobilePage() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Automobile catalog page
        AutomobilePageOnliner automobilePageOnliner = homePageOnliner.getTopHeaderBar().openAutomobilePageOnliner();
        
        // Click on Country dropdown
        automobilePageOnliner.clickOnCountryDropdownLink();
        
        // Choose country
        automobilePageOnliner.clickOnCountryChoiseLink();
        
        // Click on Producer dropdown
        automobilePageOnliner.clickOnProducerDropdownLink();
        
        // Choose producer
        automobilePageOnliner.clickOnProducerChoiseLink();
        
        // Click on Model dropdown
        automobilePageOnliner.clickOnModelDropdownLink();
        
        // Choose model
        automobilePageOnliner.clickOnModelChoiseLink();
        
        // Click on Lower Year dropdown
        automobilePageOnliner.clickOnLowerYearDropdownLink();
        
        // Choose lower year
        automobilePageOnliner.clickOnLowerYearChoiseLink();
        automobilePageOnliner.pause(10);
        
        getDriver().close();
        
    }   


	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestPriority(Priority.P3)
	@TestLabel(name = "feature", value = {"web", "regression"})
	
	//testcase014 (Negative) Verify that the user Gets the message "No results found for this term" or is being redirected to the search results page with irrelevant search result items after setting on certain options in the search filter for extremely detailed search on the certain section
	public void testExtremelyDetailedSearchWorksCorrectlyForRealEstatePage() {
    
		// Open Home page
	    HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
	    homePageOnliner.open();
	    Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");          
	    
	    // Open Real estate page
	    RealEstatePageOnliner realEstatePageOnliner = homePageOnliner.getTopHeaderBar().openRealEstatePageOnliner();
	
	    // Click on number 1 button
	    realEstatePageOnliner.clickOnNumberOfRoomsButton();

//	    // Move Upper Year Slider to 1960 or to -168 px 
//	    realEstatePageOnliner.getUpperYearSliderLinkUI().slide(realEstatePageOnliner.getUpperYearSliderLink(), -168, 0);
//	    realEstatePageOnliner.pause(10.0);	
//	    // Move Upper Price Slider to $19195 or to -181 px 
//	    realEstatePageOnliner.getUpperPriceSliderLinkUI().slide(realEstatePageOnliner.getUpperPriceSliderLink(), -181, 0);
//	    realEstatePageOnliner.pause(20.0);	
	    
	    realEstatePageOnliner.moveOnUpperYearSlider();	
	    realEstatePageOnliner.moveOnUpperPriceSlider();	 
	    
        getDriver().close();
        
	}
	
}	