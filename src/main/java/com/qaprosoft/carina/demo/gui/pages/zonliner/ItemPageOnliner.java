package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.zonliner.ItemPageOnliner;

public class ItemPageOnliner extends AbstractPage {
	    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	    
	  
	    //!!!!!!!!!! List
	    @FindBy(xpath = "//a[@class='button-style button-style_base-alter product-aside__item-button button-style_expletive' and contains(text(),'В корзину')]")
	    private ExtendedWebElement addToShoppingCartLink;
	    	    
	    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
	    private ExtendedWebElement shoppingCartLink; 
	    
	    public ItemPageOnliner(WebDriver driver) {
	        super(driver);
	        setPageURL("https://catalog.onliner.by/notebook/lenovo/81ut00mlre");
	    }
	    
	    public void addToShoppingCart(){
	    	addToShoppingCartLink.scrollTo();
	    	addToShoppingCartLink.click();
	    }
	    
	    public ShoppingCartPageOnliner clickOnShoppingCartLink() {
	    	shoppingCartLink.scrollTo();
	    	shoppingCartLink.click();
	        return new ShoppingCartPageOnliner(driver);
	    }
	    
	    
}
