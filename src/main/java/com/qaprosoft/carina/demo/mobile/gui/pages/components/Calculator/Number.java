package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.ModuleElement;

public class Number extends AbstractUIObject {

    @FindBy(xpath = "//android.widget.Button[@content-desc='point']")
    private ExtendedWebElement point;

    public Number(WebDriver driver){
    	super(driver);
   	}
    
    public void chooseDigit(String digit){
        WebElement digitBtn = getDriver().findElement(By.id("com.google.android.calculator:id/digit_" + digit));
        digitBtn.click();
    }
    public void clickPoint(){
        point.click();
    }
}