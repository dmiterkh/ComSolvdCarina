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
import com.qaprosoft.carina.demo.gui.pages.onliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LaptopPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.RealEstatePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerSectionsBarTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerSectionsBarTest.class);
	
	private HomePageOnliner homePageOnliner;
	
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
		
		// Open Home page
        homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
	}
	
	
	

    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase011 Verify that the user Is Being Redirected to the list of all categories page with relevant categories of items of any section of the site after clicking on one of the links at the top of the home page
    public void testUserRedirectedToListOfCategoriesWithRelevantCategoriesClickingOnLink() {

        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.openCatalogPageOnliner();
    	pause(1);
   
    }    
        
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase012 Verify that the user Is Being Redirected to the search results page with relevant search results items after setting on certain options in the search filter for extremely detailed search on the certain section
    public void testExtremelyDetailedSearchWorksCorrectlyForCatalogPage() {
                        
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = homePageOnliner.openCatalogPageOnliner();
        catalogPageOnliner.clickOnComputerTechnicsLink();
        catalogPageOnliner.clickOnComputersLink();
        
        LaptopPageOnliner laptopPageOnliner = catalogPageOnliner.openLaptopPageOnliner();
        laptopPageOnliner.clickOnProducerCheckboxLink();
        laptopPageOnliner.typeInUpperBoundPriceField("1000");            
        pause(1);

    }    

    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
	//testcase013 Verify that the user Is Being Redirected to the search results page with relevant search results items after setting on certain options in the search filter for extremely detailed search on the certain section
    public void testExtremelyDetailedSearchWorksCorrectlyForAutomobilePage() {
                        
        // Open Automobile catalog page
        AutomobilePageOnliner automobilePageOnliner = homePageOnliner.openAutomobilePageOnliner();
        automobilePageOnliner.clickOnCountryDropdownLink();
        automobilePageOnliner.clickOnCountryChoiseLink();
        
        automobilePageOnliner.clickOnProducerDropdownLink();
        automobilePageOnliner.clickOnProducerChoiseLink();
        
    	automobilePageOnliner.clickOnModelDropdownLink();
        automobilePageOnliner.clickOnModelChoiseLink();

    	automobilePageOnliner.clickOnLowerYearDropdownLink();
        automobilePageOnliner.clickOnLowerYearChoiseLink();
        pause(1);
    }   

	@Test()
	@MethodOwner(owner = "dkharevich")
	@TestPriority(Priority.P3)
	@TestLabel(name = "feature", value = {"web", "regression"})
	
	//testcase014 (Negative) Verify that the user Gets the message "No results found for this term" or is being redirected to the search results page with irrelevant search result items after setting on certain options in the search filter for extremely detailed search on the certain section
	public void testExtremelyDetailedSearchWorksCorrectlyForRealEstatePage() {

	    // Open Real estate page
	    RealEstatePageOnliner realEstatePageOnliner = homePageOnliner.openRealEstatePageOnliner();
	    realEstatePageOnliner.clickOnNumberOfRoomsButton();
	    realEstatePageOnliner.moveOnUpperYearSlider();	
	    realEstatePageOnliner.moveOnUpperPriceSlider();	   
    	pause(1);
	}
	
    
    
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