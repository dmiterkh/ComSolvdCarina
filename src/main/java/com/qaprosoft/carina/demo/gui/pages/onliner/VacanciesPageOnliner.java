package com.qaprosoft.carina.demo.gui.pages.onliner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class VacanciesPageOnliner extends AbstractPage {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(VacanciesPageOnliner.class);
	
	
    @FindBy(xpath = "//a[@href='https://people.onliner.by/contacts']")
    private ExtendedWebElement contactsLink;
        
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;

    
    
    
    public VacanciesPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://blog.onliner.by/vacancy");
    }

    
    
    public HomePageOnliner openHomePageOnliner() {
    	homeLink.scrollTo();
        homeLink.click();
        return new HomePageOnliner(driver);
    }
    
    public ContactsPageOnliner openContactsPageOnliner() {
    	contactsLink.scrollTo();
    	contactsLink.click();
        return new ContactsPageOnliner(driver);
    }
    
}