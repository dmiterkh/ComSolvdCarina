package com.qaprosoft.carina.demo.gui.pages.onliner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPageOnliner.class);
	
    
    @FindBy(xpath = "//input[@placeholder='Ник или e-mail']")
    private ExtendedWebElement loginFieldLink;
        
    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private ExtendedWebElement passwordFieldLink;
    //input[@type='password']
    
    @FindBy(xpath = "//button[contains(@class,'auth-button')]")
    private ExtendedWebElement authButtonLink;
    
    // Additional link
    @FindBy(xpath = "//div[contains(@class,'auth-input__helper')]")
    private ExtendedWebElement passwordViewLink;
    
    
        
    public LoginPageOnliner(WebDriver driver) {
        super(driver);
    }

    
    
    public AuthorizedPageOnliner clickOnAuthButton() {
    	authButtonLink.click();
        return new AuthorizedPageOnliner(driver);
    }
    
    public ExtendedWebElement getLoginFieldLink() {
    	return loginFieldLink;
    }
    
    public ExtendedWebElement getPasswordFieldLink() {
    	return passwordFieldLink;
    }
    
    public boolean isLoginFieldClickable() {
    	return loginFieldLink.isClickable();
    }
    
    public boolean isPasswordFieldClickable() {
    	return passwordFieldLink.isClickable();
    }
    
    public void typeInLoginField(String loginArg) {
    	loginFieldLink.click();
    	loginFieldLink.type(loginArg);
    	pause(2.0);
    }
    
    public void typeInPasswordField(String passwordArg) {
    	passwordFieldLink.click();
    	passwordFieldLink.type(passwordArg);
    }
    
    // Additional method
    public void showPasswordInPasswordField() {
        passwordViewLink.click();
        passwordViewLink.click();
   }
    
    public AuthorizedPageOnliner getAuthorizedPageOnliner(String loginArg, String passwordArg) {
    	typeInLoginField(loginArg);
    	typeInPasswordField(passwordArg);
    	showPasswordInPasswordField();
        authButtonLink.click();
        return new AuthorizedPageOnliner(driver);
    }
    
    public LoginPageOnliner getNotAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
    	typeInLoginField(loginArg);
    	typeInPasswordField(passwordArg);
    	showPasswordInPasswordField();
        authButtonLink.click();
        return new LoginPageOnliner(driver);
    }
    
    
}