package com.qaprosoft.carina.demo.gui.pages.onliner;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LaptopPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(LaptopPageOnliner.class);
	
    
    @FindBy(xpath = "//input[@type='checkbox' and @value='lenovo']//parent::span//parent::label")
    private List<ExtendedWebElement> producerCheckboxListLink;
        
    //@FindBy(xpath = "//input[@type='text' and @placeholder='до']")
    @FindBy(xpath = "//input[contains(@class,'schema-filter-control__item') and @placeholder='до']")    
    private ExtendedWebElement upperBoundPriceFieldLink;
   
    @FindBy(xpath = "//a[@data-bind='attr: {href: product.html_url}']")
    private List<ExtendedWebElement> itemListLink;
   
    
    
    public LaptopPageOnliner(WebDriver driver) {
        super(driver);
    }
         
    
   
    public void clickOnProducerCheckboxLink() {
    	producerCheckboxListLink.get(0).click();
    }
    
    public void typeInUpperBoundPriceField(String upperBoundPriceArg) {
    	upperBoundPriceFieldLink.click();
    	upperBoundPriceFieldLink.type(upperBoundPriceArg);
    }
    
    public ItemPageOnliner openFirstItemPageOnliner() {
    	itemListLink.get(0).click();
        return new ItemPageOnliner(driver);
    }
    
    public ItemPageOnliner openFirstItemPageOnliner(String upperBoundPriceArg) {
    	producerCheckboxListLink.get(0).click();
    	upperBoundPriceFieldLink.click();
    	upperBoundPriceFieldLink.type(upperBoundPriceArg);
    	itemListLink.get(0).click();
        return new ItemPageOnliner(driver);
    }
}