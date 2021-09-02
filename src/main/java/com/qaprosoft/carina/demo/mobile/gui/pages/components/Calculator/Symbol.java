package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Symbol extends AbstractUIObject {
    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement plus;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement equal;

    public Symbol(WebDriver driver){
    	super(driver);
    }

    public void clickPlus() {
        plus.click();
    }
    public void clickEqual() {
        equal.click();
    }
}