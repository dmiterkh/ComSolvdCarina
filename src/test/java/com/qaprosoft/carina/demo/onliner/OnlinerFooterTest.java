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
import com.qaprosoft.carina.demo.gui.pages.onliner.ContactsPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VacanciesPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerFooterTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerFooterTest.class);
	
	@BeforeSuite
    public void beforeSuiteFooterTestChild() {
		LOGGER.info("@FooterTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestFooterTestChild() {
		LOGGER.info("@FooterTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassFooterTestChild() {
		LOGGER.info("@FooterTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodFooterTestChild() {
		LOGGER.info("@FooterTest-BeforeMethod-Child");
	}
	
	
	
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase018 Verify that the user Is Being Redirected to the relevant page after clicking on any link in footer 
    public void testUserRedirectedToRelevantPageClickingOnLinkInFooter() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Open Vacancies page
        VacanciesPageOnliner vacanciesPageOnliner = homePageOnliner.openVacanciesPageOnliner();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
        homePageOnliner = vacanciesPageOnliner.openHomePageOnliner();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
               
        // Open Contacts page
        ContactsPageOnliner contactsPageOnliner = homePageOnliner.openContactsPageOnliner();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page is not opened");
        
        homePageOnliner = contactsPageOnliner.openHomePageOnliner();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        vacanciesPageOnliner = homePageOnliner.openVacanciesPageOnliner();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
        //Open Contacts page from Vacancies page
        contactsPageOnliner = vacanciesPageOnliner.openContactsPageOnliner();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page is not opened");
        
        //Open Vacancies page from Contacts page
        vacanciesPageOnliner = contactsPageOnliner.openVacanciesPageOnliner();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        pause(1);
    }    
    
    
    
	@AfterMethod
	public void afterMethodFooterTestChild() {
		LOGGER.info("@FooterTest-AfterMethod-Child");
	}

	@AfterClass
	public void afterClassFooterTestChild() {
		LOGGER.info("@FooterTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestFooterTestChild() {
		LOGGER.info("@FooterTest-AfterTest-Child");
	}
	
	@AfterSuite
    public void afterSuiteFooterTestChild() {
		LOGGER.info("@FooterTest-AfterSuite-Child");
    }

}