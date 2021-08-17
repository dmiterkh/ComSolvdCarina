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
import com.qaprosoft.carina.demo.gui.pages.zonliner.ItemPageOnliner;

public class LaptopPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    //!!!!!!!!!! List
    @FindBy(xpath = "//input[@type='checkbox' and @value='lenovo']//parent::span//parent::label")
    private ExtendedWebElement producerCheckboxLink;
        
    //@FindBy(xpath = "//input[@type='text' and @placeholder='до']")
    @FindBy(xpath = "//input[contains(@class,'schema-filter-control__item') and @placeholder='до']")    
    private ExtendedWebElement upperBoundPriceFieldLink;
    
    //!!!!!!!!!! List
    @FindBy(xpath = "//a[@data-bind='attr: {href: product.html_url}']")
    private ExtendedWebElement itemLink;
    
    //a[@class="button-style button-style_base-alter product-aside__item-button button-style_expletive" and contains(text(),'В корзину')]

    
    
    public LaptopPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://catalog.onliner.by/notebook");
    }
           
    
    //!!!!!!!!!! List
    public void clickOnProducerCheckboxLink() {
    	producerCheckboxLink.scrollTo();
    	producerCheckboxLink.click();
    }
    
    public void typeInUpperBoundPriceField(String upperBoundPriceArg) {
    	upperBoundPriceFieldLink.scrollTo();
    	upperBoundPriceFieldLink.click();
    	upperBoundPriceFieldLink.type(upperBoundPriceArg);
    }
    
    public ItemPageOnliner openItemPageOnliner() {
    	itemLink.click();
        return new ItemPageOnliner(driver);
    }
    
    public ItemPageOnliner getItemPageOnliner(String upperBoundPriceArg) {
    	producerCheckboxLink.scrollTo();
    	producerCheckboxLink.click();
    	producerCheckboxLink.scrollTo();
       	upperBoundPriceFieldLink.scrollTo();
    	upperBoundPriceFieldLink.click();
    	upperBoundPriceFieldLink.type(upperBoundPriceArg);
    	itemLink.click();
        return new ItemPageOnliner(driver);
    }
}
