package com.qaprosoft.carina.demo.gui.components.onliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.onliner.ContactsPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VacanciesPageOnliner;

public class FooterMenu extends AbstractUIObject {
    
	
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
    
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
}