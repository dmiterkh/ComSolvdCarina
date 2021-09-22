package com.qaprosoft.carina.demo.mobile.gui.pages.android.calculator;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.calculator.CalculatorPageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CalculatorPageBase.class)
public class CalculatorPage extends CalculatorPageBase {
	
//  DISPLAY PANEL	
    @FindBy(id = "com.google.android.calculator:id/formula")
    private ExtendedWebElement entryField;
	
    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement resultField;
    
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    private ExtendedWebElement previewField;
    
    
//  NUMBER PANEL    
	@FindBy(id = "com.google.android.calculator:id/dec_point")
    private ExtendedWebElement point;

    @FindBy(id = "com.google.android.calculator:id/digit_%s")
    private ExtendedWebElement digit;
    
	
//  SYMBAL PANEL	
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

    
//  MATH PANEL    
    @FindBy(id = "com.google.android.calculator:id/toggle_inv")
    private ExtendedWebElement invBtn;

    @FindBy(id = "com.google.android.calculator:id/toggle_mode")
    private ExtendedWebElement radDegBtn;

	
    @FindBy(id = "com.google.android.calculator:id/fun_sin")
    private ExtendedWebElement sinBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_cos")
    private ExtendedWebElement cosBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_tan")
    private ExtendedWebElement tanBtn;
    
    @FindBy(id = "com.google.android.calculator:id/fun_arcsin")
    private ExtendedWebElement arcsinBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_arccos")
    private ExtendedWebElement arccosBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_arctan")
    private ExtendedWebElement arctanBtn;
    

    @FindBy(id = "com.google.android.calculator:id/op_pct")
    private ExtendedWebElement perBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_ln")
    private ExtendedWebElement lnBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_log")
    private ExtendedWebElement logBtn;

    @FindBy(id = "com.google.android.calculator:id/op_sqrt")
    private ExtendedWebElement sqrtBtn;
    
    @FindBy(id = "com.google.android.calculator:id/fun_exp")
    private ExtendedWebElement expPowBtn;

    @FindBy(id = "com.google.android.calculator:id/fun_10pow")
    private ExtendedWebElement tenPowBtn;

    @FindBy(id = "com.google.android.calculator:id/op_sqr")
    private ExtendedWebElement numberSqrBtn;
    

    @FindBy(id = "com.google.android.calculator:id/op_pow")
    private ExtendedWebElement powBtn;
    
    @FindBy(id = "com.google.android.calculator:id/const_pi")
    private ExtendedWebElement piBtn;

    @FindBy(id = "com.google.android.calculator:id/const_e")
    private ExtendedWebElement eBtn;

    @FindBy(id = "com.google.android.calculator:id/lparen")
    private ExtendedWebElement leftParBtn;

    @FindBy(id = "com.google.android.calculator:id/rparen")
    private ExtendedWebElement rightParBtn;

    @FindBy(id = "com.google.android.calculator:id/op_fact")
    private ExtendedWebElement factBtn;
    
    
	
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    
    

    
//  DISPLAY PANEL  
    public String getInfoFromResultField(){
        return resultField.getText();
    }
    
    public String getInfoFromEntryField(){
        return entryField.getText();
    }
    
    public String getInfoFromPreviewField(){
        return previewField.getText();
    }
    
    
//  NUMBER PANEL  
    public void clickOnDigitBtn(String digit){
        WebElement digitBtn = getDriver().findElement(By.id("com.google.android.calculator:id/digit_" + digit));    	
        digitBtn.click();
    }
    
    public void clickOnDigitBtnUsingFormat(String digitArg){
        ExtendedWebElement digitBtn = digit.format(digitArg);    	
        digitBtn.click();
    }
    
    public void clickOnAllButtonsOnNumberPanel(){
    	clickOnDigitBtnUsingFormat("0");
    	clickOnPointBtn();
    	for (int i = 9; i>0; i--) {
    		clickOnDigitBtnUsingFormat(String.valueOf(i));		
    	}
    }
    
    public void clickOnPointBtn(){
        point.click();
    }
    
    public void enterDoubleNumber(String aDigitArg, String bDigitArg) {
    	clickOnDigitBtn(aDigitArg);
    	clickOnPointBtn();
    	clickOnDigitBtn(bDigitArg);    	
    };
    
    
//  SYMBOL PANEL      
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
    
    
//  MATH PANEL    
    public void clickOnInvBtn() {
        invBtn.click();
    }

    public void clickOnRadDegBtn() {
        radDegBtn.click();
    }

    public void clickOnSinBtn() {
        sinBtn.click();
    }

    public void clickOnCosBtn() {
        cosBtn.click();
    }

    public void clickOnTanBtn() {
        tanBtn.click();
    }
    
    public void clickOnArcSinBtn() {
        arcsinBtn.click();
    }

    public void clickOnArcCosBtn() {
        arccosBtn.click();
    }

    public void clickOnArcTanBtn() {
        arctanBtn.click();
    }
    

    public void clickOnPerBtn() {
        perBtn.click();
    }

    public void clickOnLnBtn() {
        lnBtn.click();
    }

    public void clickOnLogBtn() {
        logBtn.click();
    }

    public void clickOnSqrtBtn() {
        sqrtBtn.click();
    }
    
    public void clickOnExpPowBtn() {
        expPowBtn.click();
    }

    public void clickOnTenPowBtn() {
        tenPowBtn.click();
    }

    public void clickOnNumberSqrBtn() {
        numberSqrBtn.click();
    }

    
    public void clickOnPowBtn() {
        powBtn.click();
    }

    public void clickOnPiBtn() {
        piBtn.click();
    }

    public void clickOnEBtn() {
        eBtn.click();
    }

    public void clickOnLeftParBtn() {
    	leftParBtn.click();
    }

    public void clickOnRightParBtn() {
    	rightParBtn.click();
    }

    public void clickOnFactBtn() {
    	factBtn.click();
    }
    
    public String checkSinFunction (String digitArg) {
		clickOnSinBtn();
	    clickOnDigitBtn(digitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
    
    public String checkCosFunction(String digitArg) {
		clickOnCosBtn();
	    clickOnDigitBtn(digitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
   
    public String checkTanFunction(String digitArg) {
		clickOnTanBtn();
	    clickOnDigitBtn(digitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
    
    public String checkArcSinFunction (String aDigitArg, String bDigitArg) {
		clickOnArcSinBtn();
		enterDoubleNumber(aDigitArg, bDigitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
    
    public String checkArcCosFunction(String aDigitArg, String bDigitArg) {
		clickOnArcCosBtn();
		enterDoubleNumber(aDigitArg, bDigitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
   
    public String checkArcTanFunction(String aDigitArg, String bDigitArg) {
		clickOnArcTanBtn();
		enterDoubleNumber(aDigitArg, bDigitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
   
    
    public Double returnRoundedActualNumber(String stringArg) {
		
    	String firstString = stringArg;
		String resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		
		double actualNum = Double.parseDouble(resultString);
		actualNum=actualNum*1000000;
	    int result = (int) Math.floor(actualNum);
	    actualNum = (double) result/1000000;
    	return actualNum;
    	
    }
    
    public Double returnRoundedCheckNumber(Double doubleArg) {
		
		doubleArg=doubleArg*1000000;
	    int result = (int)Math.floor(doubleArg);
	    doubleArg = (double) result/1000000;
    	return doubleArg;
    	
    }
    
    public String returnModeDegRad(Double actualNumArg, Double checkNumArg) {
    	
    	String ModeDegRad = "";
    	if(actualNumArg == checkNumArg) {
			ModeDegRad = "Deg";			
		} else {
			ModeDegRad = "Rad";
			clickOnRadDegBtn();
		}
    	return ModeDegRad;
	
    }
    
    public String checkLnFunction (String digitArg) {
		clickOnLnBtn();
	    clickOnDigitBtn(digitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
    
    public String checkLogFunction(String digitArg) {
		clickOnLogBtn();
	    clickOnDigitBtn(digitArg);
		clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();
    }
   
    public Double checkSqrtFunction(String digitArg) {
		clickOnSqrtBtn();
	    clickOnDigitBtn(digitArg);
		clickOnEqualBtn();
		return Double.parseDouble(getInfoFromResultField());
    }
    
    public String checkExpPowFunction(String digitArg) {    
    	clickOnExpPowBtn();
    	clickOnDigitBtn(digitArg);
    	clickOnRightParBtn();
		clickOnEqualBtn();
		return getInfoFromResultField();    
    }
    
    public Double checkTenPowFunction(String digitArg) {    
    	clickOnTenPowBtn();
    	clickOnDigitBtn(digitArg);
		clickOnEqualBtn();
		return Double.parseDouble(getInfoFromResultField());    
    }

    public Double checkSqrFunction(String digitArg) {
	    clickOnDigitBtn(digitArg);
		clickOnNumberSqrBtn();
		clickOnEqualBtn();	
		return Double.parseDouble(getInfoFromResultField());
    }
    
    public Double checkPercentFunction(String digitArg) {
		clickOnDigitBtn(digitArg);
	    clickOnPerBtn();
	    clickOnEqualBtn();	
		return Double.parseDouble(getInfoFromResultField());
    }
    
    public Double checkPowerFunction(String aDigitArg, String bDigitArg) {
		clickOnDigitBtn(aDigitArg);
		clickOnPowBtn();
		clickOnDigitBtn(bDigitArg);
	    clickOnEqualBtn();	
		return Double.parseDouble(getInfoFromResultField());
    }
    
    public String checkPiFunction() {
	    clickOnPiBtn();
	    clickOnEqualBtn();	
		return getInfoFromResultField();
    }
    
    public String checkEFunction() {
	    clickOnEBtn();
	    clickOnEqualBtn();	
		return getInfoFromResultField();
    }

    public Double checkParenthesisFunction(String aDigitArg, String bDigitArg, String cDigitArg) {    
		clickOnLeftParBtn();
		clickOnDigitBtn(aDigitArg);
		clickOnAddBtn();
		clickOnDigitBtn(bDigitArg);
		clickOnRightParBtn();
		clickOnMultiplyBtn();
		clickOnDigitBtn(cDigitArg);
		clickOnEqualBtn();
		return Double.parseDouble(getInfoFromResultField());
	}
	
    public Double checkFactorialFunction(String digitArg) {
		clickOnDigitBtn(digitArg);
	    clickOnFactBtn();
	    clickOnEqualBtn();	
		return Double.parseDouble(getInfoFromResultField());
    }
    
    public Double checkInnerFactorialFunction(String digitArg) {
    	int k = Integer.parseInt(digitArg);
    	int i = 1;
    	while(k>0) {
    		i = i * k;
    		k--;   		
    	}
		return (double) i;
    }    
    
}