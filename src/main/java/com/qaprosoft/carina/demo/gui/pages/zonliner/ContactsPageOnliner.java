package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.VacanciesPageOnliner;

public class ContactsPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
        
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;

    public ContactsPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://people.onliner.by/contacts");
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
    
}

