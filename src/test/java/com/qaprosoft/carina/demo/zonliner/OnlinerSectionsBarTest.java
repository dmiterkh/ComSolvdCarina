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
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.RealEstatePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LaptopPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerSectionsBarTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
	//testcase011
    public void testSectionsBar011() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getSectionsBar().openCatalogPageOnliner();
    	catalogPageOnliner.pause(10);
    }    
        
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
	//testcase012
    public void testSectionsBar012() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getSectionsBar().openCatalogPageOnliner();
        
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
    }    

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
	//testcase013
    public void testSectionsBar013() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Automobile catalog page
        AutomobilePageOnliner automobilePageOnliner = homePageOnliner.getSectionsBar().openAutomobilePageOnliner();
        
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
    }   


	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestPriority(Priority.P3)
	@TestLabel(name = "feature", value = {"web", "regression"})
	//testcase014
	public void testSectionsBar014() {
    
		// Open Home page
	    HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
	    homePageOnliner.open();
	    Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");          
	    
	    // Open Real estate page
	    RealEstatePageOnliner realEstatePageOnliner = homePageOnliner.getSectionsBar().openRealEstatePageOnliner();
	
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
	    
	}
	
}	
