package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.onliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LaptopPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.RealEstatePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerSectionsBarTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerSectionsBarTest.class);
	
	@BeforeSuite
    public void beforeSuiteSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-BeforeMethod-Child");
	}
	
	
	
//
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    
//	//testcase011 Verify that the user Is Being Redirected to the list of all categories page with relevant categories of items of any section of the site after clicking on one of the links at the top of the home page
//    public void testUserRedirectedToListOfCategoriesWithRelevantCategoriesClickingOnLink() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//                
//        // Open Catalog page
//        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getTopHeaderBar().openCatalogPageOnliner();
//    	catalogPageOnliner.pause(10);
//
//        
//    }    
//        
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    
//	//testcase012 Verify that the user Is Being Redirected to the search results page with relevant search results items after setting on certain options in the search filter for extremely detailed search on the certain section
//    public void testExtremelyDetailedSearchWorksCorrectlyForCatalogPage() {
//        
//    	// Open Home page
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//                
//        // Open Catalog page
//        CatalogPageOnliner catalogPageOnliner = homePageOnliner.getTopHeaderBar().openCatalogPageOnliner();
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
//        laptopPageOnliner.pause(10);
//
//        
//    }    

    @Test()
    @MethodOwner(owner = "dkharevich")
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
        
        if(automobilePageOnliner.returnCountryDropdownLink().isElementPresent())
        {
            // Click on Country dropdown
        	// Choose Country
    		
    		LOGGER.info("!!!");		
    		LOGGER.info("Country-section-started");
    		LOGGER.info("!!!");
    		
            automobilePageOnliner.clickOnCountryDropdownLink();
            automobilePageOnliner.clickOnCountryChoiseLink();
            pause(5);
            
    		LOGGER.info("!!!");		
    		LOGGER.info("Country-section-passed");
    		LOGGER.info("!!!");                    
            
        } else {
        	LOGGER.info("!!!");		
    		LOGGER.info("Country-section-has not been found");
    		LOGGER.info("!!!");
        };
        
        
        
        if(automobilePageOnliner.returnProducerDropdownLink().isElementPresent())
        {
            // Click on Producer dropdown
            // Choose Producer
        	
    		LOGGER.info("!!!");		
    		LOGGER.info("Producer-section-started");
    		LOGGER.info("!!!");
        	
        	automobilePageOnliner.clickOnProducerDropdownLink();
        	automobilePageOnliner.clickOnProducerChoiseLink();
        	
    		LOGGER.info("!!!");		
    		LOGGER.info("Producer-section-passed");
    		LOGGER.info("!!!");
            
        } else {
        	LOGGER.info("!!!");		
    		LOGGER.info("Producer-section-has not been found");
    		LOGGER.info("!!!");
        };
        
        
        
        if(automobilePageOnliner.returnModelDropdownLink().isElementPresent())
        {
            // Click on Model dropdown
            // Choose Model
        	
    		LOGGER.info("!!!");		
    		LOGGER.info("Model-section-started");
    		LOGGER.info("!!!");
        	
        	automobilePageOnliner.clickOnModelDropdownLink();
        	automobilePageOnliner.clickOnModelChoiseLink();
        	
    		LOGGER.info("!!!");		
    		LOGGER.info("Model-section-passed");
    		LOGGER.info("!!!");
            
        } else {
        	LOGGER.info("!!!");		
    		LOGGER.info("Model-section-has not been found");
    		LOGGER.info("!!!");
        };
        
        
        
        if(automobilePageOnliner.returnLowerYearDropdownLink().isElementPresent())
        {
        	// Click on Lower Year dropdown
            // Choose lower year
        	
    		LOGGER.info("!!!");		
    		LOGGER.info("LowerYear-section-started");
    		LOGGER.info("!!!");
        	
            automobilePageOnliner.clickOnLowerYearDropdownLink();
            automobilePageOnliner.clickOnLowerYearChoiseLink();
            
    		LOGGER.info("!!!");		
    		LOGGER.info("LowerYear-section");
    		LOGGER.info("!!!");
            
        } else {
        	LOGGER.info("!!!");		
    		LOGGER.info("LowerYear-section-has not been found");
    		LOGGER.info("!!!");
        };
        	       
    }   


//	@Test()
//	@MethodOwner(owner = "dkharevich")
//	@TestPriority(Priority.P3)
//	@TestLabel(name = "feature", value = {"web", "regression"})
//	
//	//testcase014 (Negative) Verify that the user Gets the message "No results found for this term" or is being redirected to the search results page with irrelevant search result items after setting on certain options in the search filter for extremely detailed search on the certain section
//	public void testExtremelyDetailedSearchWorksCorrectlyForRealEstatePage() {
//    
//		// Open Home page
//	    HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//	    homePageOnliner.open();
//	    Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");          
//	    
//	    // Open Real estate page
//	    RealEstatePageOnliner realEstatePageOnliner = homePageOnliner.getTopHeaderBar().openRealEstatePageOnliner();
//	
//	    // Click on number 1 button
//	    realEstatePageOnliner.clickOnNumberOfRoomsButton();
//
////	    // Move Upper Year Slider to 1960 or to -168 px 
////	    realEstatePageOnliner.getUpperYearSliderLinkUI().slide(realEstatePageOnliner.getUpperYearSliderLink(), -168, 0);
////	    realEstatePageOnliner.pause(10.0);	
////	    // Move Upper Price Slider to $19195 or to -181 px 
////	    realEstatePageOnliner.getUpperPriceSliderLinkUI().slide(realEstatePageOnliner.getUpperPriceSliderLink(), -181, 0);
////	    realEstatePageOnliner.pause(20.0);	
//	    
//	    realEstatePageOnliner.moveOnUpperYearSlider();	
//	    realEstatePageOnliner.moveOnUpperPriceSlider();	 
//	    
//        
//	}
	
    
    
	@AfterMethod
	public void afterMethodSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-AfterMethod-Child");
	}

	@AfterClass
	public void afterClassSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-AfterTest-Child");
	}
	
	@AfterSuite
    public void afterSuiteSectionsBarTestChild() {
		LOGGER.info("@SectionsBarTest-AfterSuite-Child");
    }
    
}	