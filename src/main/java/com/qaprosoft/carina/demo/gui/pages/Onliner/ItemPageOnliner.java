package com.qaprosoft.carina.demo.gui.pages.Onliner;

import java.lang.invoke.MethodHandles;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.Onliner.ItemPageOnliner;

public class ItemPageOnliner extends AbstractPage {
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemPageOnliner.class);
 	  
	//!!!!!!!!!! List
    @FindBy(xpath = "//a[@class='button-style button-style_base-alter product-aside__item-button button-style_expletive' and contains(text(),'В корзину')]")
    private ExtendedWebElement addToShoppingCartLink;
    
    @FindBy(xpath = "//a[@class='button-style button-style_base-alter product-aside__item-button button-style_primary' and contains(text(),'В корзине')]")
    private ExtendedWebElement addedToShoppingCartLink;
    	    
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 
    
    public ItemPageOnliner(WebDriver driver) {
        super(driver);
    }
    
    public void addToShoppingCart(){
    	if (addedToShoppingCartLink.isElementPresent()) {
    		
    	} else {	    	
    		addToShoppingCartLink.scrollTo();
	    	addToShoppingCartLink.click();
    	}
    }
    
    public ShoppingCartPageOnliner clickOnShoppingCartLink() {
    	shoppingCartLink.scrollTo();
    	shoppingCartLink.click();
        return new ShoppingCartPageOnliner(driver);
    }
	    
	    
}