package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SymbolPanel extends AbstractUIObject {
	
    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement equalBtn;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement addBtn;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    private ExtendedWebElement subtractBtn;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    private ExtendedWebElement divideBtn;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    private ExtendedWebElement multiplyBtn;

    @FindBy(id = "com.google.android.calculator:id/del")
    private ExtendedWebElement deleteBtn;
    
    @FindBy(id = "com.google.android.calculator:id/clr")
    private ExtendedWebElement clearBtn;
    
    public SymbolPanel(WebDriver driver){
    	super(driver);
    }

    public void clickOnAddBtn() {
        addBtn.click();
    }
    
    public void clickOnEqualBtn() {
        equalBtn.click();
    }
    
    public void clickOnSubtractBtn() {
        subtractBtn.click();
    }

    public void clickOnDivideBtn() {
        divideBtn.click();
    }

    public void clickOnMultiplyBtn() {
        multiplyBtn.click();
    }

    public void clickOnDeleteBtn() {
        deleteBtn.click();
    }

    public void clickOnClearBtn() {
        clearBtn.click();
    }
}