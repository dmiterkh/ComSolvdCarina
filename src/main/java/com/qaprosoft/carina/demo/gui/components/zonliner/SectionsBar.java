package com.qaprosoft.carina.demo.gui.components.zonliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.zonliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.RealEstatePageOnliner;

public class SectionsBar extends AbstractUIObject {
	
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/']")
    private ExtendedWebElement catalogLink;

    @FindBy(xpath = "//li[@class='header-style__item']//a[@href='https://ab.onliner.by']")
    private ExtendedWebElement automobileLink;
        
    @FindBy(xpath = "//a[@href='https://r.onliner.by/pk']")
    private ExtendedWebElement realEstateLink;

    public SectionsBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CatalogPageOnliner openCatalogPageOnliner() {
    	catalogLink.scrollTo();
        catalogLink.click();
        return new CatalogPageOnliner(driver);
    }
    
    public AutomobilePageOnliner openAutomobilePageOnliner() {
    	automobileLink.scrollTo();
    	automobileLink.click();
        return new AutomobilePageOnliner(driver);
    }
    
    public RealEstatePageOnliner openRealEstatePageOnliner() {
    	realEstateLink.scrollTo();
    	realEstateLink.click();
        return new RealEstatePageOnliner(driver);
    }
    
}

