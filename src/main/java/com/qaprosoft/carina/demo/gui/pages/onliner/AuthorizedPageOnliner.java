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
import com.qaprosoft.carina.demo.gui.components.onliner.TopHeaderBar;
import com.qaprosoft.carina.demo.gui.pages.onliner.ShoppingCartPageOnliner;
import com.qaprosoft.carina.demo.gui.components.onliner.PopupProfile;

public class AuthorizedPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizedPageOnliner.class);
    
    // Additional link
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
    
    // Additional link
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;    
    
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 	
    
    @FindBy(xpath = "//header[@class='g-top']")
    private TopHeaderBar topHeaderBarLink;
    
    @FindBy(xpath = "//a[@href='https://profile.onliner.by']")
    private  ExtendedWebElement profileLink;
    
    @FindBy(xpath = "//div[@class='b-top-profile__link b-top-profile__link_secondary']")
    private PopupProfile popupProfileExitLink;
    
    
    public AuthorizedPageOnliner(WebDriver driver) {
        super(driver);
        
        
    }
    
    // Additional method
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    // Additional method
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
    
    public TopHeaderBar getTopHeaderBar() {
        return topHeaderBarLink;
    }
    
    public PopupProfile returnProfilePopupLink() {
        return popupProfileExitLink;
        
    }
    

}