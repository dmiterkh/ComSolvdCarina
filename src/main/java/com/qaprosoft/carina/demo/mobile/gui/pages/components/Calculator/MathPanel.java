package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class MathPanel extends AbstractUIObject {
	
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
   
    
    public MathPanel(WebDriver driver){
    	super(driver);
    }
    
    
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
