package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.zonliner.AuthorizedHomePageOnliner;


public class ShoppingCartPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
	@FindBy(xpath = "//a[@href='https://www.onliner.by']")
    private ExtendedWebElement autorizedHomePageLink;
	
	@FindBy(xpath = "//a[@href='https://www.onliner.by']")
    private ExtendedWebElement incrementButtonLink;
	
	@FindBy(xpath = "//a[@href='https://www.onliner.by']")
    private ExtendedWebElement decrementButtonLink;
	
	@FindBy(xpath = "//a[@href='https://www.onliner.by']")
    private ExtendedWebElement removeButtonLink;
	
	
    public ShoppingCartPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://cart.onliner.by/");
    }
    
    
    public AuthorizedHomePageOnliner clickOnAutorizedHomePageLink() {
    	autorizedHomePageLink.click();
        return new AuthorizedHomePageOnliner(driver);
    }
    
    public void clickOnIncrementButtonLink() {
    	incrementButtonLink.click();
    }
    
    public void clickOnDecrementButtonLink() {
    	decrementButtonLink.click();
    }
    
    public void clickOnRemoveButtonLink() {
    	removeButtonLink.click();
    }

}
