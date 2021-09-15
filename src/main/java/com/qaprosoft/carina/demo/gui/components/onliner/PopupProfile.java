package com.qaprosoft.carina.demo.gui.components.onliner;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.onliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.RealEstatePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.ShoppingCartPageOnliner;


public class PopupProfile extends AbstractUIObject {
	
    @FindBy(xpath = "//div[@class='b-top-profile__link b-top-profile__link_secondary']")
    private ExtendedWebElement popupProfileExitLink;
    
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
    
    public PopupProfile(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickOnPopupProfileExitLink() {
        popupProfileExitLink.click();
    }


    public HomePageOnliner openHomePageOnliner() {
        popupProfileExitLink.click();
        pause(5);
        homeLink.click();
        return new HomePageOnliner(driver);
    }
	
}
