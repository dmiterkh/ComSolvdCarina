package com.qaprosoft.carina.demo.gui.pages.onliner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.onliner.TopHeaderBar;

public class AuthorizedPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizedPageOnliner.class);
    

    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
    
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;    
    
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 	
    
    @FindBy(xpath = "//header[@class='g-top']")
    private TopHeaderBar topHeaderBarLink;
    
    @FindBy(xpath = "//a[contains(@href,'https://profile.onliner.by') and contains(@class,'b-top-profile__preview')]")
    private  ExtendedWebElement profileLink;
    
    @FindBy(xpath = "//a[@class='b-top-profile__link b-top-profile__link_secondary']")
    private ExtendedWebElement popupProfileExitLink;
    
    
    
    public AuthorizedPageOnliner(WebDriver driver) {
        super(driver);
    }
    
    
    
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
    
    public TopHeaderBar getTopHeaderBar() {
        return topHeaderBarLink;
    }
    
    public ItemPageOnliner openFirstItemPageOnliner(String stringArg) {
    	return getTopHeaderBar().openCatalogPageOnliner().getLaptopPageOnliner().openFirstItemPageOnliner(stringArg);
    }
    
    public HomePageOnliner openHomePageOnliner() {
    	profileLink.click();
        pause(3);
        popupProfileExitLink.click();
        pause(3);
        homeLink.click();
        return new HomePageOnliner(driver);
    }

}