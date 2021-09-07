package com.qaprosoft.carina.demo.Calculator;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.DisplayPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.MathPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.NumberPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.SymbolPanel;


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
        calc.clickOnDigitBtn("9");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("0");
        calc.clickOnAddBtn();
        calc.clickOnDigitBtn("7");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("8");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "16.8", "Addition button does not work correctly");
        
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "16.8", "Equality button does not work correctly");
        
        calc.clickOnSubtractBtn();
        calc.clickOnDigitBtn("6");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("6");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "10.2", "Subtraction button does not work correctly");
                
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "10.2", "Equality button does not work correctly");
        
        calc.clickOnDivideBtn();
        calc.clickOnDigitBtn("3");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("4");
        Assert.assertEquals(calc.getInfoFromPreviewField(), "3", "Division button does not work correctly");
        
        calc.clickOnEqualBtn();
        Assert.assertEquals(calc.getInfoFromResultField(), "3", "Equality button does not work correctly");
        
        calc.clickOnMultiplyBtn();
        calc.clickOnDigitBtn("2");
        calc.clickOnPointBtn();
        calc.clickOnDigitBtn("5");
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
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnSinBtn();
		
	    NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("3");
		function.clickOnRightParBtn();
		
		SymbolPanel symbol = new SymbolPanel(getDriver());
      	symbol.clickOnEqualBtn();
		
		DisplayPanel display = new DisplayPanel(getDriver());		
	    Double actualNum = Double.parseDouble(display.getInfoFromResultField());
		Double checkNum = Math.sin(3);				
		
		actualNum=actualNum*10000000;
	    int result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		
		String ModeDegRad = ""; 
		
		if(actualNum == checkNum) {
			ModeDegRad = "Deg";			
		} else {
			ModeDegRad = "Rad";
			function.clickOnRadDegBtn();
		}	
		
	    LOGGER.info("Sin 4 radians");
        symbol.clickOnClearBtn();
		function.clickOnSinBtn();
		number.clickOnDigitBtn("4");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		String firstString = display.getInfoFromResultField();
		String resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.sin(4);				
		
		actualNum=actualNum*1000000;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/1000000;
		
		checkNum=checkNum*1000000;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/1000000;
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
	    
	    LOGGER.info("Cos 2 radians");
		symbol.clickOnClearBtn();
		function.clickOnCosBtn();
		number.clickOnDigitBtn("2");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		firstString = display.getInfoFromResultField();
		resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.cos(2);	
		
		actualNum=actualNum*1000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/1000000;		
		
		checkNum=checkNum*1000000;
		result = (int)Math.round(checkNum);
	    checkNum = (double) result/1000000;
				
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
        
	    LOGGER.info("Tan 2 radians");
	    symbol.clickOnClearBtn();
		function.clickOnTanBtn();
		number.clickOnDigitBtn("2");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		firstString = display.getInfoFromResultField();
		resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.tan(2);	
		
		
		actualNum=actualNum*1000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/1000000;		
		
		checkNum=checkNum*1000000;
		result = (int)Math.round(checkNum);
	    checkNum = (double) result/1000000;
				
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");
		

		
		function.clickOnRadDegBtn();
		ModeDegRad = "Deg";
		
        symbol.clickOnClearBtn();
		function.clickOnSinBtn();
		number.clickOnDigitBtn("3");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		firstString = display.getInfoFromResultField();
		resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.sin(Math.toRadians(3));	
		
		actualNum=actualNum*1000000;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/1000000;
		
		checkNum=actualNum*1000000;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/1000000;
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
		
        symbol.clickOnClearBtn();
		function.clickOnCosBtn();
		number.clickOnDigitBtn("1");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		firstString = display.getInfoFromResultField();
		resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.cos(Math.toRadians(1));	
		
		actualNum=actualNum*1000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/1000000;		
		
		checkNum=checkNum*1000000;
		result = (int)Math.round(checkNum);
	    checkNum = (double) result/1000000;
				
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
	    
        symbol.clickOnClearBtn();
		function.clickOnTanBtn();
		number.clickOnDigitBtn("1");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		firstString = display.getInfoFromResultField();
		resultString = ""; 
		if(firstString.contains("−")) {
			resultString = "-" + firstString.substring(1);
		} else {
			resultString = firstString; 
		}
		actualNum = Double.parseDouble(resultString);
		checkNum = Math.tan(Math.toRadians(1));
		
		actualNum=actualNum*1000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/1000000;		
		
		checkNum=checkNum*1000000;
		result = (int)Math.round(checkNum);
	    checkNum = (double) result/1000000;
				
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");	
				
	}		
	
	@Test()
	public void testCalculatorMathPanelTriginometricInverse() {
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnInvBtn();
		function.clickOnArcSinBtn();
		
	    NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
				
		SymbolPanel symbol = new SymbolPanel(getDriver());
      	symbol.clickOnEqualBtn();     	
      	
		DisplayPanel display = new DisplayPanel(getDriver());		
	    Double actualNum = Double.parseDouble(display.getInfoFromResultField());
		Double checkNum = Math.asin(0.5);				
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	    
		
		String ModeDegRad = ""; 
		
		if(actualNum == checkNum) {
			ModeDegRad = "Rad";			
		} else {
			ModeDegRad = "Rad";
			function.clickOnRadDegBtn();
		}
		
		function.clickOnArcSinBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
	    
		actualNum=actualNum*1000000;
	    int result = (int)Math.floor(actualNum);
	    actualNum = (double) result/1000000;
		
		checkNum=checkNum*1000000;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/1000000;
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");
		
		symbol.clickOnClearBtn();
		function.clickOnArcCosBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.acos(0.5);	
		
		actualNum=actualNum*1000000;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/1000000;
		
		checkNum=checkNum*1000000;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/1000000;
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arccos in " + ModeDegRad + " Mode does not work correctly");
		
		symbol.clickOnClearBtn();	
		function.clickOnArcTanBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.atan(0.5);	
		
		actualNum=actualNum*1000000;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/1000000;
		
		checkNum=checkNum*1000000;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/1000000;
	    
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arctan in " + ModeDegRad + " Mode does not work correctly");
	
		
		
		function.clickOnRadDegBtn();
		ModeDegRad = "Deg";

		symbol.clickOnClearBtn();	
		function.clickOnArcSinBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.toDegrees(Math.asin(0.5));	
		
		actualNum=actualNum*10;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/10;
		
		checkNum=checkNum*10;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/10;
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");

		symbol.clickOnClearBtn();	
		function.clickOnArcCosBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.toDegrees(Math.acos(0.5));	
		
		actualNum=actualNum*10;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/10;
		
		checkNum=checkNum*10;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/10;
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");

		symbol.clickOnClearBtn();	
		function.clickOnArcTanBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.toDegrees(Math.atan(0.5));	
		
		actualNum=actualNum*10;
	    result = (int)Math.floor(actualNum);
	    actualNum = (double) result/10;
		
		checkNum=checkNum*10;
	    result = (int)Math.floor(checkNum);
	    checkNum = (double) result/10;
		
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	 
	    LOGGER.info(ModeDegRad);
		Assert.assertEquals(actualNum, checkNum, "Function arcsin in " + ModeDegRad + " Mode does not work correctly");

	}				
	
	@Test()
	public void testCalculatorMathPanelLogarithmic() {
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnLnBtn();

		NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		
		SymbolPanel symbol = new SymbolPanel(getDriver());
		symbol.clickOnEqualBtn();
		
		DisplayPanel display = new DisplayPanel(getDriver());
		Double actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		Double checkNum = Math.log(5.0);
	    
		actualNum=actualNum*10000000;
	    int result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Ln does not work correctly");

		symbol.clickOnClearBtn();
		function.clickOnLogBtn();
		number.clickOnDigitBtn("5");
		function.clickOnRightParBtn();
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.log10(5.0);
	    
		actualNum=actualNum*10000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Log does not work correctly");
		
		symbol.clickOnClearBtn();
		function.clickOnSqrtBtn();
		number.clickOnDigitBtn("9");
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = 3.0;
	   
	    LOGGER.info(String.valueOf(actualNum));
		Assert.assertEquals(actualNum, checkNum, "Function Log does not work correctly");
		

	}	
	
	@Test()
	public void testCalculatorMathPanelLogarithmicInverse() {
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnInvBtn();
		function.clickOnExpPowBtn();

		NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("2");
		function.clickOnRightParBtn();
		
		SymbolPanel symbol = new SymbolPanel(getDriver());
		symbol.clickOnEqualBtn();
		
		DisplayPanel display = new DisplayPanel(getDriver());
		Double actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		Double checkNum = Math.exp(2.0);
	    
		actualNum=actualNum*10000000;
	    int result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function e^x does not work correctly");
		
		symbol.clickOnClearBtn();
		function.clickOnTenPowBtn();
		number.clickOnDigitBtn("2");
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.pow(10.0, 2.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function 10^x does not work correctly");
		
		symbol.clickOnClearBtn();		
		number.clickOnDigitBtn("9");
		function.clickOnNumberSqrBtn();
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.pow(9.0, 2.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
		

	}
	
	@Test()
	public void testCalculatorMathPanelOthers() {
		
		NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("2");
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnPerBtn();
		
		SymbolPanel symbol = new SymbolPanel(getDriver());
		symbol.clickOnEqualBtn();
		
		DisplayPanel display = new DisplayPanel(getDriver());
		Double actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		Double checkNum = (double) 2/100;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function Percent does not work correctly");
		
		symbol.clickOnClearBtn();
		number.clickOnDigitBtn("7");
		function.clickOnPowBtn();
		number.clickOnDigitBtn("3");
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.pow(7.0, 3.0);
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));	
		Assert.assertEquals(actualNum, checkNum, "Function ^ does not work correctly");
		
		symbol.clickOnClearBtn();		
		function.clickOnPiBtn();
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.PI;
		
		actualNum=actualNum*10000000;
	    int result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
	    
		symbol.clickOnClearBtn();		
		function.clickOnEBtn();
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = Math.E;
		
		actualNum=actualNum*10000000;
	    result = (int)Math.round(actualNum);
	    actualNum = (double) result/10000000;
		
		checkNum=checkNum*10000000;
	    result = (int)Math.round(checkNum);
	    checkNum = (double) result/10000000;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
	    
		symbol.clickOnClearBtn();		
		function.clickOnLeftParBtn();
		number.clickOnDigitBtn("7");
		symbol.clickOnAddBtn();
		number.clickOnDigitBtn("3");
		function.clickOnRightParBtn();
		symbol.clickOnMultiplyBtn();
		number.clickOnDigitBtn("4");
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = 40.0;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
		
		symbol.clickOnClearBtn();
		number.clickOnDigitBtn("6");
		function.clickOnFactBtn();
		symbol.clickOnEqualBtn();
		
		actualNum = Double.parseDouble(display.getInfoFromResultField());	 
		checkNum = (double) 6*5*4*3*2*1;
	   
	    LOGGER.info(String.valueOf(actualNum));
	    LOGGER.info(String.valueOf(checkNum));
		Assert.assertEquals(actualNum, checkNum, "Function Sqr does not work correctly");
		

	}
	

}