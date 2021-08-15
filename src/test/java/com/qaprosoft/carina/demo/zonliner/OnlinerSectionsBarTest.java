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
	
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void testSectionsBar1() {
//        
//    	// Open Onliner home page and verify page is opened
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//               
//    }
//    
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void testSectionsBar2() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//                
//        // Open Catalog page
//        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getSectionsBar().openCatalogPageOnliner();
//    
//    }    
//        
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void testSectionsBar3() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//                
//        // Open Catalog page
//        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getSectionsBar().openCatalogPageOnliner();
//        
//        // Open Computer techics subsection
//        catalogPageOnliner.clickOnComputerTechnicsLink();
//        
//        // Open Computers subsection
//        catalogPageOnliner.clickOnComputersLink();
//               
//        // Open Laptop subsection
//        LaptopPageOnliner laptopPageOnliner = catalogPageOnliner.openLaptopPageOnliner();
//        
//        // Choose producer
//        laptopPageOnliner.clickOnProducerCheckboxLink();
//        
//        // Set value of upper bound price field
//        laptopPageOnliner.typeInUpperBoundPriceField("1000");            
//        
//    }    

//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void testSectionsBar4() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//                
//        // Open Automobile catalog page
//        AutomobilePageOnliner automobilePageOnliner = homePageOnliner.getSectionsBar().openAutomobilePageOnliner();
//        
//        // Click on Country dropdown
//        automobilePageOnliner.clickOnCountryDropdownLink();
//        
//        // Choose country
//        automobilePageOnliner.clickOnCountryChoiseLink();
//        
//        // Click on Producer dropdown
//        automobilePageOnliner.clickOnProducerDropdownLink();
//        
//        // Choose producer
//        automobilePageOnliner.clickOnProducerChoiseLink();
//        
//        // Click on Model dropdown
//        automobilePageOnliner.clickOnModelDropdownLink();
//        
//        // Choose model
//        automobilePageOnliner.clickOnModelChoiseLink();
//        
//        // Click on Lower Year dropdown
//        automobilePageOnliner.clickOnLowerYearDropdownLink();
//        
//        // Choose lower year
//        automobilePageOnliner.clickOnLowerYearChoiseLink();
//        
//    }   


	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestPriority(Priority.P3)
	@TestLabel(name = "feature", value = {"web", "regression"})
	public void testSectionsBar5() {
    
		// Open Home page
	    HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
	    homePageOnliner.open();
	    Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");          
	    
	    // Open Real estate page
	    RealEstatePageOnliner realEstatePageOnliner = homePageOnliner.getSectionsBar().openRealEstatePageOnliner();
	    
	    // Click on number 1 button
	    realEstatePageOnliner.clickOnNumberOfRoomsButton();
    
	    // Move Upper Year Slider to 10.6667% 
	    realEstatePageOnliner.slide(realEstatePageOnliner.returnUpperYearSliderLink(), 50, 0);
	    realEstatePageOnliner.pause(5.0);
	    
	    // Move Upper Price Slider to 3.60231%% 
	    realEstatePageOnliner.slide(realEstatePageOnliner.returnUpperPriceSliderLink(), 30, 0);
	    realEstatePageOnliner.pause(5.0);
	    
	    
	    
	    // Move Upper Year Slider to 10.6667% 
	    realEstatePageOnliner.setOnUpperYearSlider();
	    realEstatePageOnliner.pause(5.0);
	    
	    // Move Upper Price Slider to 3.60231%% 
	    realEstatePageOnliner.setOnUpperPriceSlider();
	    realEstatePageOnliner.pause(5.0);
	    
	}
	
}	
