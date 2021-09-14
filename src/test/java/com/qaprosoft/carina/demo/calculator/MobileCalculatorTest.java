package com.qaprosoft.carina.demo.calculator;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.calculator.MobileCalculatorTestBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Calculator.CalculatorPageBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MobileCalculatorTest extends MobileCalculatorTestBase implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MobileCalculatorTest.class);
	
	@Test()
    public void testCalculatorNumberPanel() {
    	
		
        CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
        calc.getInfoFromEntryField();
        Assert.assertEquals(calc.getInfoFromEntryField(), "", "Display Panel does not work correctly");
        
        calc.clickOnDigitBtn("0");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("9");
        calc.clickOnDigitBtn("8");
        calc.clickOnDigitBtn("7");
        calc.clickOnDigitBtn("6");
        calc.clickOnDigitBtn("5");
        calc.clickOnDigitBtn("4");
        calc.clickOnDigitBtn("3");
        calc.clickOnDigitBtn("2");
        calc.clickOnDigitBtn("1");
        Assert.assertEquals(calc.getInfoFromEntryField(), "0.987654321", "Number Panel does not work correctly");

        
        
        
    }	
 
    @Test()
    public void testCalculatorSymbolPanel() {
    	        
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
        calc.enterDoubleNumber("9","0");
        calc.clickOnAddBtn();
        calc.enterDoubleNumber("7","8");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "16.8", "Addition button does not work correctly");
        
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "16.8", "Equality button does not work correctly");
        
        calc.clickOnSubtractBtn();
        calc.enterDoubleNumber("6","6");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "10.2", "Subtraction button does not work correctly");
                
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "10.2", "Equality button does not work correctly");
        
        calc.clickOnDivideBtn();
        calc.enterDoubleNumber("3","4");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "3", "Division button does not work correctly");
        
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "3", "Equality button does not work correctly");
        
        calc.clickOnMultiplyBtn();
        calc.enterDoubleNumber("2","5");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "7.5", "Multiplication button does not work correctly");
        
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "7.5", "Equality button does not work correctly");
         
        calc.clickOnClearBtn();
        Assert.assertEquals(calc.getInfoFromEntryField(), "", "Clear button does not work correctly");
        
        calc.clickOnDigitBtn("1");
        calc.clickOnDigitBtn("2");
        calc.clickOnDeleteBtn();
        Assert.assertEquals(calc.getInfoFromEntryField(), "1", "Delete button does not work correctly");

    }
	
	@Test()
	public void testCalculatorMathPanelTriginometric() {
		
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
		
    	Double actualNum = calc.returnRoundedActualNumber(calc.checkSinFunction("3"));
    	Double checkNum = calc.returnRoundedCheckNumber(Math.sin(3));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    
		String ModeDegRad = calc.returnModeDegRad(actualNum, checkNum); 
		
		
	    LOGGER.info("Sin 4 radians");
	    calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkSinFunction("4"));
    	checkNum = calc.returnRoundedCheckNumber(Math.sin(4));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
	    
		
	    LOGGER.info("Cos 2 radians");
		calc.clickOnClearBtn();
	   	actualNum = calc.returnRoundedActualNumber(calc.checkCosFunction("2"));
    	checkNum = calc.returnRoundedCheckNumber(Math.cos(2));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
        
	    
	    LOGGER.info("Tan 2 radians");
		calc.clickOnClearBtn();
	   	actualNum = calc.returnRoundedActualNumber(calc.checkTanFunction("2"));
    	checkNum = calc.returnRoundedCheckNumber(Math.tan(2));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");

		
		calc.clickOnRadDegBtn();
		ModeDegRad = "Deg";
		
		calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkSinFunction("3"));
    	checkNum = calc.returnRoundedCheckNumber(Math.sin(Math.toRadians(3)));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
		
		
		calc.clickOnClearBtn();
	   	actualNum = calc.returnRoundedActualNumber(calc.checkCosFunction("1"));
    	checkNum = calc.returnRoundedCheckNumber(Math.cos(Math.toRadians(1)));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
        
	    
		calc.clickOnClearBtn();
	   	actualNum = calc.returnRoundedActualNumber(calc.checkTanFunction("1"));
    	checkNum = calc.returnRoundedCheckNumber(Math.tan(Math.toRadians(1)));			
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");
				
	}		
	
	@Test()
	public void testCalculatorMathPanelTriginometricInverse() {
		
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
		calc.clickOnInvBtn();
		
    	Double actualNum = calc.returnRoundedActualNumber(calc.checkArcSinFunction("0", "5"));
    	Double checkNum = calc.returnRoundedCheckNumber(Math.asin(0.5));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    
		String ModeDegRad = calc.returnModeDegRad(actualNum, checkNum); 

		
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcSinFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.asin(0.5));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum)); 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");
		
		
		calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcCosFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.acos(0.5));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum)); 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arccos in " + ModeDegRad + " Mode does not work correctly");
		
		
		calc.clickOnClearBtn();	
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcTanFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.atan(0.5));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum)); 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arctan in " + ModeDegRad + " Mode does not work correctly");
	
		
		calc.clickOnRadDegBtn();
		ModeDegRad = "Deg";

		calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcSinFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.toDegrees(Math.asin(0.5)));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum)); 
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");

	    
		calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcCosFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.toDegrees(Math.acos(0.5)));			    	
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum)); 
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function arccos in " + ModeDegRad + " Mode does not work correctly");
	    

		calc.clickOnClearBtn();
    	actualNum = calc.returnRoundedActualNumber(calc.checkArcTanFunction("0", "5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.toDegrees(Math.atan(0.5)));	
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arctan in " + ModeDegRad + " Mode does not work correctly");

	}				
	
	@Test()
	public void testCalculatorMathPanelLogarithmic() {
		
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
    	
    	Double actualNum = calc.returnRoundedActualNumber(calc.checkLnFunction("5"));
    	Double checkNum = calc.returnRoundedCheckNumber(Math.log(5.0));			    	
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Ln does not work correctly");

    	
    	actualNum = calc.returnRoundedActualNumber(calc.checkLogFunction("5"));
    	checkNum = calc.returnRoundedCheckNumber(Math.log10(5.0));			    	
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Log does not work correctly");
		
		
    	actualNum = calc.checkSqrtFunction("9");
    	checkNum = 3.0;			    	
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Sqrt does not work correctly");	

	}	
	
	@Test()
	public void testCalculatorMathPanelLogarithmicInverse() {
		
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);
		calc.clickOnInvBtn();
		
    	Double actualNum = calc.returnRoundedActualNumber(calc.checkExpPowFunction("2"));
    	Double checkNum = calc.returnRoundedCheckNumber(Math.exp(2.0));			    	
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function e^x does not work correctly");
		
		
		calc.clickOnClearBtn();
		actualNum = calc.checkTenPowFunction("2");	 
		checkNum = Math.pow(10.0, 2.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function 10^x does not work correctly");
		
		
		calc.clickOnClearBtn();		
		actualNum = calc.checkSqrFunction("9");	 
		checkNum = Math.pow(9.0, 2.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
		
	}
	
	@Test()
	public void testCalculatorMathPanelOthers() {
		
    	CalculatorPageBase calc = initPage(getDriver(), CalculatorPageBase.class);

		Double actualNum = calc.checkPercentFunction("2");	 
		Double checkNum = (double) 2/100;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Percent does not work correctly");
	
		
		calc.clickOnClearBtn();	
		actualNum = calc.checkPowerFunction("7", "3");	 
		checkNum = Math.pow(7.0, 3.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function ^ does not work correctly");

		
		calc.clickOnClearBtn();	
		actualNum = calc.returnRoundedActualNumber(calc.checkPiFunction());	 
		checkNum = calc.returnRoundedCheckNumber(Math.PI);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Pi does not work correctly");
		
		
		calc.clickOnClearBtn();	
		actualNum = calc.returnRoundedActualNumber(calc.checkEFunction());	 
		checkNum = calc.returnRoundedCheckNumber(Math.E);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Pi does not work correctly");
		
		
		calc.clickOnClearBtn();	
		actualNum = calc.checkParenthesisFunction("7","3","4");
		checkNum = (double) (7+3)*4;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Parenthesis does not work correctly");
		
		
		calc.clickOnClearBtn();
		actualNum = calc.checkFactorialFunction("6");	 
		checkNum = calc.checkInnerFactorialFunction("6");
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
	
	}	

}