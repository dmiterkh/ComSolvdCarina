package com.qaprosoft.carina.demo.gui.components.Onliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.Onliner.ContactsPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.VacanciesPageOnliner;

public class FooterMenu extends AbstractUIObject {
    
//	OnlinerFooterTest (testcase 018) 	
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;

    @FindBy(xpath = "//a[@href='https://people.onliner.by/contacts']")
    private ExtendedWebElement contactsLink;
        
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePageOnliner openHomePageOnliner() {
    	homeLink.scrollTo();
        homeLink.click();
        return new HomePageOnliner(driver);
    }
    
    public VacanciesPageOnliner openVacanciesPageOnliner() {
    	vacanciesLink.scrollTo();
    	vacanciesLink.click();
        return new VacanciesPageOnliner(driver);
    }
    
    public ContactsPageOnliner openContactsPageOnliner() {
    	contactsLink.scrollTo();
    	contactsLink.click();
        return new ContactsPageOnliner(driver);
    }
    
    // Additional method
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    // Additional method
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
}