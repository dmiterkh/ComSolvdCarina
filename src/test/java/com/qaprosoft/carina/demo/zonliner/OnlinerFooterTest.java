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
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.ContactsPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.VacanciesPageOnliner;

/**
 * This sample shows how create Web test.
 *
 * @author qpsdemo
 */
public class OnlinerFooterTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testFooter1() {
        
    	// Open Onliner home page and verify page is opened
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
               
    }
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testFooter2() {
        
    	// Open Vacancies page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Vacancies page
        VacanciesPageOnliner vacanciesPageOnliner = homePageOnliner.getFooterMenu().openVacanciesPageOnliner();
        vacanciesPageOnliner.open();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
        // Return to home page
        vacanciesPageOnliner.openHomePageOnliner();
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page from Vacancies page is not opened");
               
        // Open Contacts page
        ContactsPageOnliner contactsPageOnliner = homePageOnliner.getFooterMenu().openContactsPageOnliner();
        contactsPageOnliner.open();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page is not opened");
        
        // Return to home page
        contactsPageOnliner.openHomePageOnliner();
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page from Contacts page is not opened");
        
        // Open Vacancies page from Contacts page
        contactsPageOnliner.openVacanciesPageOnliner();
        vacanciesPageOnliner.open();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page from Contacts page is not opened");
        
        //Open Contacts page from Vacancies page
        vacanciesPageOnliner.openContactsPageOnliner();
        contactsPageOnliner.open();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page from Vacancies page is not opened");

    }    

}
