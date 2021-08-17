package com.qaprosoft.carina.demo.gui.components.zonliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LoginPageOnliner;


public class AuthBar extends AbstractUIObject {
	
	@FindBy(xpath = "//div[@id='userbar']//div//div//div//div[text()='Вход']")
    private ExtendedWebElement authLink;

    public AuthBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPageOnliner clickOnAuthLink() {
        authLink.click();
        return new LoginPageOnliner(driver);
    }
    
}

