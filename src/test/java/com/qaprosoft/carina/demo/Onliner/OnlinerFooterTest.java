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
import com.qaprosoft.carina.demo.gui.pages.Onliner.ContactsPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.VacanciesPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerFooterTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    //testcase018 Verify that the user Is Being Redirected to the relevant page after clicking on any link in footer 
    public void testUserRedirectedToRelevantPageClickingOnLinkInFooter () {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Vacancies page
        VacanciesPageOnliner vacanciesPageOnliner = homePageOnliner.getFooterMenu().openVacanciesPageOnliner();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
        // Return to Home page
        homePageOnliner = vacanciesPageOnliner.openHomePageOnliner();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
               
        // Open Contacts page
        ContactsPageOnliner contactsPageOnliner = homePageOnliner.getFooterMenu().openContactsPageOnliner();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page is not opened");
        
        // Return to Home page
        homePageOnliner = contactsPageOnliner.openHomePageOnliner();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Open Vacancies page from Home page
        vacanciesPageOnliner = homePageOnliner.getFooterMenu().openVacanciesPageOnliner();
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
        //Open Contacts page from Vacancies page
        contactsPageOnliner = vacanciesPageOnliner.openContactsPageOnliner();
        Assert.assertTrue(contactsPageOnliner.isPageOpened(), "Contacts page is not opened");
        
        //Open Vacancies page from Contacts page
        vacanciesPageOnliner = contactsPageOnliner.openVacanciesPageOnliner();
        vacanciesPageOnliner.pause(10.0);
        Assert.assertTrue(vacanciesPageOnliner.isPageOpened(), "Vacancies page is not opened");
        
    }    

}