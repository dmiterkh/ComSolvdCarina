package com.qaprosoft.carina.demo.mobile.gui.pages.android.Calculator;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Calculator.CalculatorPageBase;
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
//  @FindBy(xpath = "//android.widget.Button[@content-desc='point']")
	@FindBy(id = "com.google.android.calculator:id/dec_point")
    private ExtendedWebElement point;

//    @FindBy(id = "com.google.android.calculator:id/digit_")
//    private List<ExtendedWebElement> digitBtnList;
	
	
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
    
//    public void clickOnDigitBtn(String digit){
//    	if ("0".equals(digit)) {
//    		digitBtnList.get(9).click();
//    	} else {
//    		int i = Integer.parseInt(digit);
//    		digitBtnList.get(i-1).click();
//    	}	  
//    }

    public void clickOnPointBtn(){
        point.click();
    }
    
    
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
    
}