package com.qaprosoft.carina.demo.mobile.gui.pages.common.Calculator;

import com.qaprosoft.carina.core.gui.AbstractPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class CalculatorPageBase extends AbstractPage {
	
    public CalculatorPageBase(WebDriver driver) {
        super(driver);
    }
    
//  DISPLAY PANEL  
    public abstract String getInfoFromResultField();
    
    public abstract String getInfoFromEntryField();
    
    public abstract String getInfoFromPreviewField();
    
    
//  NUMBER PANEL  
    public abstract void clickOnDigitBtn(String digit);
    
//    public abstract void clickOnDigitBtn(String digit);

    public abstract void clickOnPointBtn();
    
    
//  SYMBOL PANEL      
    public abstract void clickOnAddBtn();
    
    public abstract void clickOnEqualBtn();
    
    public abstract void clickOnSubtractBtn();

    public abstract void clickOnDivideBtn();

    public abstract void clickOnMultiplyBtn();

    public abstract void clickOnDeleteBtn();

    public abstract void clickOnClearBtn();
    
    
//  MATH PANEL    
    public abstract void clickOnInvBtn();

    public abstract void clickOnRadDegBtn();

    public abstract void clickOnSinBtn(); 
    
    public abstract void clickOnCosBtn();
    
    public abstract void clickOnTanBtn();
    
    public abstract void clickOnArcSinBtn(); 

    public abstract void clickOnArcCosBtn();
    
    public abstract void clickOnArcTanBtn(); 

    public abstract void clickOnPerBtn(); 

    public abstract void clickOnLnBtn(); 

    public abstract void clickOnLogBtn(); 

    public abstract void clickOnSqrtBtn(); 
    
    public abstract void clickOnExpPowBtn(); 

    public abstract void clickOnTenPowBtn();

    public abstract void clickOnNumberSqrBtn();

    public abstract void clickOnPowBtn();

    public abstract void clickOnPiBtn(); 

    public abstract void clickOnEBtn();

    public abstract void clickOnLeftParBtn();

    public abstract void clickOnRightParBtn();

    public abstract void clickOnFactBtn();
    
}