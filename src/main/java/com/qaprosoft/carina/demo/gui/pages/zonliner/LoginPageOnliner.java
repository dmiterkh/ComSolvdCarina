package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.components.NewsItem;
import com.qaprosoft.carina.demo.gui.components.zonliner.AuthBar;
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;

public class LoginPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @FindBy(xpath = "//input[@placeholder='Ник или e-mail']")
    private ExtendedWebElement loginFieldLink;
        
    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private ExtendedWebElement passwordFieldLink;
//  //input[@type='password']
    
    @FindBy(xpath = "//button[contains(@class,'auth-button')]")
    private ExtendedWebElement authButtonLink;
    
    @FindBy(xpath = "//div[contains(@class,'auth-input__helper')]")
    private ExtendedWebElement authHelperLink;
    
    public LoginPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://www.onliner.by/");
    }

    public void typeInLoginField(String loginArg) {
    	loginFieldLink.click();
    	loginFieldLink.type(loginArg);
    }
    
    public void typeInPasswordField(String passwordArg) {
    	passwordFieldLink.click();
    	passwordFieldLink.type(passwordArg);
    }
    
    public void clickOnAuthHelperButton() {
        authHelperLink.click();
        authHelperLink.click();
        authHelperLink.click();
        authHelperLink.click();
    }
    
    public HomePageOnliner clickOnAuthButton() {
        authButtonLink.click();
        return new HomePageOnliner(driver);
    }
    

    
}




