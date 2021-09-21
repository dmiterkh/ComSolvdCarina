package com.qaprosoft.carina.demo.gui.pages.onliner;

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
import com.qaprosoft.carina.demo.gui.pages.onliner.ItemPageOnliner;

public class ItemPageOnliner extends AbstractPage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemPageOnliner.class);
 	  
	
    @FindBy(xpath = "//a[contains(@class,'product-aside__item-button') and contains(text(),'В корзину')]")
    private List<ExtendedWebElement> addToShoppingCartListLink;
    
    @FindBy(xpath = "//a[contains(@class,'product-aside__item-button') and contains(text(),'В корзине')]")
    private ExtendedWebElement addedToShoppingCartLink;
    	    
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 
    
    
    
    public ItemPageOnliner(WebDriver driver) {
        super(driver);
    }
    
    
    public void addToShoppingCart(){
    	if (addedToShoppingCartLink.isElementPresent()) {

    	} else {	    	
	    	addToShoppingCartListLink.get(0).click();
    	}
    }
    
    public ShoppingCartPageOnliner openShoppingCartPageOnliner() {
    	shoppingCartLink.click();
        return new ShoppingCartPageOnliner(driver);
    }
	    
	    
}