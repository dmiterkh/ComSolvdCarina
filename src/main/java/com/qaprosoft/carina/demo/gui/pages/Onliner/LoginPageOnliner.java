package com.qaprosoft.carina.demo.gui.pages.Onliner;

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
import com.qaprosoft.carina.demo.gui.components.Onliner.TopHeaderBar;
import com.qaprosoft.carina.demo.gui.pages.Onliner.AuthorizedPageOnliner;

public class LoginPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPageOnliner.class);
	
    @FindBy(xpath = "//input[@placeholder='Ник или e-mail']")
    private ExtendedWebElement loginFieldLink;
        
    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private ExtendedWebElement passwordFieldLink;
    //input[@type='password']
 
    // Additional link
    @FindBy(xpath = "//div[contains(@class,'auth-input__helper')]")
    private ExtendedWebElement authHelperLink;
    
    @FindBy(xpath = "//button[contains(@class,'auth-button')]")
    private ExtendedWebElement authButtonLink;
        
    public LoginPageOnliner(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getLoginFieldLink() {
    	return loginFieldLink;
    }
    
    public ExtendedWebElement getPasswordFieldLink() {
    	return passwordFieldLink;
    }
    
    public void typeInLoginField(String loginArg) {
    	loginFieldLink.click();
    	loginFieldLink.type(loginArg);
    }
    
    public void typeInPasswordField(String passwordArg) {
    	passwordFieldLink.click();
    	passwordFieldLink.type(passwordArg);
    }
    
    // Additional method
    public void clickOnAuthHelperButton() {
        authHelperLink.click();
        authHelperLink.click();
        authHelperLink.click();
        authHelperLink.click();
    }
    
    public AuthorizedPageOnliner clickOnAuthButton() {
        authButtonLink.click();
        return new AuthorizedPageOnliner(driver);
    }
    
    public AuthorizedPageOnliner getAuthorizedPageOnliner(String loginArg, String passwordArg) {
    	loginFieldLink.click();
    	loginFieldLink.type(loginArg);
    	passwordFieldLink.click();
    	passwordFieldLink.type(passwordArg);
        authButtonLink.click();
        return new AuthorizedPageOnliner(driver);
    }
    
    public LoginPageOnliner getNotAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
    	loginFieldLink.click();
    	loginFieldLink.type(loginArg);
    	passwordFieldLink.click();
    	passwordFieldLink.type(passwordArg);
        authButtonLink.click();
        return new LoginPageOnliner(driver);
    }
    
    
}