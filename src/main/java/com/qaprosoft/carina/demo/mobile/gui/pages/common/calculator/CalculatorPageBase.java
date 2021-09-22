package com.qaprosoft.carina.demo.mobile.gui.pages.common.calculator;

import com.qaprosoft.carina.core.gui.AbstractPage;

import org.openqa.selenium.WebDriver;

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
    
    public abstract void clickOnDigitBtnUsingFormat(String digit);

    public abstract void clickOnPointBtn();
    
    public abstract void clickOnAllButtonsOnNumberPanel();
    
    public abstract void enterDoubleNumber(String aDigitArg, String bDigitArg);
    
    
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
    
    public abstract String checkSinFunction(String digitArg);
    
    public abstract String checkCosFunction(String digitArg);
    
    public abstract String checkTanFunction(String digitArg);
    
    public abstract String checkArcSinFunction(String aDigitArg, String bDigitArg);
    
    public abstract String checkArcCosFunction(String aDigitArg, String bDigitArg);
    
    public abstract String checkArcTanFunction(String aDigitArg, String bDigitArg);

    public abstract Double returnRoundedActualNumber(String stringArg);
    
    public abstract Double returnRoundedCheckNumber(Double doubleArg);
    
    public abstract String returnModeDegRad(Double actualNumArg, Double checkNumArg);
    
    public abstract String checkLnFunction(String digitArg);
    
    public abstract String checkLogFunction(String digitArg);
    
    public abstract Double checkSqrtFunction(String digitArg);
    
    public abstract String checkExpPowFunction(String digitArg);
    
    public abstract Double checkTenPowFunction(String digitArg);
    
    public abstract Double checkSqrFunction(String digitArg);
    
    public abstract Double checkPercentFunction(String digitArg);
    
    public abstract Double checkPowerFunction(String aDigitArg, String bDigitArg);  
    
    public abstract String checkPiFunction();  
    
    public abstract String checkEFunction(); 
    
    public abstract Double checkParenthesisFunction(String aDigitArg, String bDigitArg, String cDigitArg);     
    
    public abstract Double checkFactorialFunction(String digitArg);   
    
    public abstract Double checkInnerFactorialFunction(String digitArg);   
    
}