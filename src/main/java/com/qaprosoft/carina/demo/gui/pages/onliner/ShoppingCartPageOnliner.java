package com.qaprosoft.carina.demo.gui.pages.onliner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ShoppingCartPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingCartPageOnliner.class);
    
    
	@FindBy(xpath = "//a[@href='https://www.onliner.by']")
    private ExtendedWebElement autorizedHomePageLink;
	
	@FindBy(xpath = "//input[@type='text' and  @maxlength='2']")
	private ExtendedWebElement numberOfItemWindowLink;
	
	@FindBy(xpath = "//div[@class='cart-form__offers-part cart-form__offers-part_action']//div//div//div//div//a[contains(@class,'cart-form__button_increment')]")
    private ExtendedWebElement incrementButtonLink;
	
	@FindBy(xpath = "//div[@class='cart-form__offers-part cart-form__offers-part_action']//div//div//div//div//a[contains(@class,'cart-form__button_decrement')]")
    private ExtendedWebElement decrementButtonLink;
		
	@FindBy(xpath = "//div[@class='cart-form__offers-part cart-form__offers-part_action']//div//div//div//a[contains(@class,'cart-form__button_remove')]")
    private ExtendedWebElement removeButtonLink;	
	
	
	
    public ShoppingCartPageOnliner(WebDriver driver) {
        super(driver);
    }    
    
    
    
    public AuthorizedPageOnliner openAutorizedPageOnliner() {
    	autorizedHomePageLink.click();
        return new AuthorizedPageOnliner(driver);
    }
      
    public void typeInNumberOfItemWindowLink() {
    	numberOfItemWindowLink.click();
    	numberOfItemWindowLink.getElement().clear();
    	numberOfItemWindowLink.type("23");
    }
    
    public void clickOnIncrementButtonLink() {
    	numberOfItemWindowLink.click();
    	incrementButtonLink.click();
    	pause(3);
    }
    
    public void clickOnDecrementButtonLink() {
    	numberOfItemWindowLink.click();
    	decrementButtonLink.click();
    	pause(3);
    }
    
    public void clickOnRemoveButtonLink() {
    	numberOfItemWindowLink.click();
    	removeButtonLink.click();
    	pause(3);
    }
    
    public void showShoppingCartOperations() {
    	typeInNumberOfItemWindowLink();
    	clickOnIncrementButtonLink();
    	clickOnDecrementButtonLink();
    	clickOnRemoveButtonLink();
    }

}
