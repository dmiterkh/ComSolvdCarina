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
import com.qaprosoft.carina.demo.gui.components.zonliner.SectionsBar;
import com.qaprosoft.carina.demo.gui.pages.zonliner.ShoppingCartPageOnliner;

public class AuthorizedHomePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    // Additional link
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
    
    // Additional link
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;    
    
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 	
    
    @FindBy(xpath = "//ul[@class='b-main-navigation']")
    private SectionsBar sectionsBarLink;
    
    public AuthorizedHomePageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://www.onliner.by/");
    }
    
    // Additional method
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    // Additional method
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
    
    public ShoppingCartPageOnliner clickOnShoppingCartLink() {
    	shoppingCartLink.scrollTo();
    	shoppingCartLink.click();
        return new ShoppingCartPageOnliner(driver);
    }
    
    public SectionsBar getSectionsBar() {
        return sectionsBarLink;
    }
}





