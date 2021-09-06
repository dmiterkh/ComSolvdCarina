package com.qaprosoft.carina.demo.Calculator;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.DisplayPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.MathPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.NumberPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.SymbolPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MobileCalculatorTest extends MobileCalculatorTestBase implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MobileCalculatorTest.class);
	
//	@Test()
//    public void testCalculatorNumberPanel() {
//    	
//    	DisplayPanel display = new DisplayPanel(getDriver());
//        display.getInfoFromEntryField();
//        Assert.assertEquals(display.getInfoFromEntryField(), "", "Display Panel does not work correctly");
//        
//        NumberPanel number = new NumberPanel(getDriver());
//        number.clickOnDigitBtn("0");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("9");
//        number.clickOnDigitBtn("8");
//        number.clickOnDigitBtn("7");
//        number.clickOnDigitBtn("6");
//        number.clickOnDigitBtn("5");
//        number.clickOnDigitBtn("4");
//        number.clickOnDigitBtn("3");
//        number.clickOnDigitBtn("2");
//        number.clickOnDigitBtn("1");
// 
//        display.getInfoFromEntryField();
//        Assert.assertEquals(display.getInfoFromEntryField(), "0.987654321", "Number Panel does not work correctly");
//        
//    }	
 
//    @Test()
//    public void testCalculatorSymbolPanel() {
//    	        
//        NumberPanel number = new NumberPanel(getDriver());
//        number.clickOnDigitBtn("9");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("0");
//
//        SymbolPanel symbol = new SymbolPanel(getDriver());
//        symbol.clickOnAddBtn();
//
//        number.clickOnDigitBtn("7");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("8");
//        
//        DisplayPanel display = new DisplayPanel(getDriver());
//        display.getInfoFromPreviewField();
//        Assert.assertEquals(display.getInfoFromPreviewField(), "16.8", "Addition button does not work correctly");
//        
//        symbol.clickOnEqualBtn();
//        display.getInfoFromResultField();
//        Assert.assertEquals(display.getInfoFromResultField(), "16.8", "Equality button does not work correctly");
//        
//        symbol.clickOnSubtractBtn();
//        
//        number.clickOnDigitBtn("6");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("6");
//        
//        display.getInfoFromPreviewField();
//        Assert.assertEquals(display.getInfoFromPreviewField(), "10.2", "Subtraction button does not work correctly");
//                
//        symbol.clickOnEqualBtn();
//        display.getInfoFromResultField();
//        Assert.assertEquals(display.getInfoFromResultField(), "10.2", "Equality button does not work correctly");
//        
//        symbol.clickOnDivideBtn();
//        
//        number.clickOnDigitBtn("3");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("4");
//
//        display.getInfoFromPreviewField();
//        Assert.assertEquals(display.getInfoFromPreviewField(), "3", "Division button does not work correctly");
//        
//        symbol.clickOnEqualBtn();
//        display.getInfoFromResultField();
//        Assert.assertEquals(display.getInfoFromResultField(), "3", "Equality button does not work correctly");
//        
//        symbol.clickOnMultiplyBtn();
//        
//        number.clickOnDigitBtn("2");
//        number.clickOnPointBtn();
//        number.clickOnDigitBtn("5");
//
//        display.getInfoFromPreviewField();
//        Assert.assertEquals(display.getInfoFromPreviewField(), "7.5", "Multiplication button does not work correctly");
//        
//        symbol.clickOnEqualBtn();
//        display.getInfoFromResultField();
//        Assert.assertEquals(display.getInfoFromResultField(), "7.5", "Equality button does not work correctly");
//         
//        symbol.clickOnClearBtn();
//        display.getInfoFromEntryField();
//        Assert.assertEquals(display.getInfoFromEntryField(), "", "Clear button does not work correctly");
//        
//        number.clickOnDigitBtn("1");
//        number.clickOnDigitBtn("2");
//        symbol.clickOnDeleteBtn();
//        display.getInfoFromEntryField();
//        Assert.assertEquals(display.getInfoFromEntryField(), "1", "Delete button does not work correctly");
//
//    }
//	
//	@Test()
//	public void testCalculatorMathPanelTriginometric() {
//		
//		MathPanel function = new MathPanel(getDriver());
//		function.clickOnSinBtn();
//		
//	    NumberPanel number = new NumberPanel(getDriver());
//		number.clickOnDigitBtn("3");
//		
//		SymbolPanel symbol = new SymbolPanel(getDriver());
//      	symbol.clickOnEqualBtn();
//		
//		DisplayPanel display = new DisplayPanel(getDriver());		
//	    Double actualNum = Double.parseDouble(display.getInfoFromResultField());
//		Double checkNum = Math.sin(3);				
//		
//		actualNum=actualNum*10000000;
//	    int result = (int)Math.round(actualNum);
//	    actualNum = (double) result/10000000;
//		
//		checkNum=checkNum*10000000;
//	    result = (int)Math.round(checkNum);
//	    checkNum = (double) result/10000000;
//	    
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));
//		
//		String ModeDegRad = ""; 
//		
//		if(actualNum == checkNum) {
//			ModeDegRad = "Deg";			
//		} else {
//			ModeDegRad = "Rad";
//			function.clickOnRadDegBtn();
//		}	
//		
//	    LOGGER.info("Sin 4 radians");
//        symbol.clickOnClearBtn();
//		function.clickOnSinBtn();
//		number.clickOnDigitBtn("4");
//		symbol.clickOnEqualBtn();
//		
//		String firstString = display.getInfoFromResultField();
//		String resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.sin(4);				
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.floor(actualNum);
//	    actualNum = (double) result/1000000;
//		
//		checkNum=checkNum*1000000;
//	    result = (int)Math.floor(checkNum);
//	    checkNum = (double) result/1000000;
//	    
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));
//	    LOGGER.info(ModeDegRad);
//		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
//	    
//	    LOGGER.info("Cos 2 radians");
//		symbol.clickOnClearBtn();
//		function.clickOnCosBtn();
//		number.clickOnDigitBtn("2");
//		symbol.clickOnEqualBtn();
//		
//		firstString = display.getInfoFromResultField();
//		resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.cos(2);	
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.round(actualNum);
//	    actualNum = (double) result/1000000;		
//		
//		checkNum=checkNum*1000000;
//		result = (int)Math.round(checkNum);
//	    checkNum = (double) result/1000000;
//				
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));	 
//	    LOGGER.info(ModeDegRad);
//	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
//        
//	    LOGGER.info("Tan 2 radians");
//	    symbol.clickOnClearBtn();
//		function.clickOnTanBtn();
//		number.clickOnDigitBtn("2");
//		symbol.clickOnEqualBtn();
//		
//		firstString = display.getInfoFromResultField();
//		resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.tan(2);	
//		
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.round(actualNum);
//	    actualNum = (double) result/1000000;		
//		
//		checkNum=checkNum*1000000;
//		result = (int)Math.round(checkNum);
//	    checkNum = (double) result/1000000;
//				
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));	 
//	    LOGGER.info(ModeDegRad);
//		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");
//		
//
//		
//		function.clickOnRadDegBtn();
//		ModeDegRad = "Deg";
//		
//        symbol.clickOnClearBtn();
//		function.clickOnSinBtn();
//		number.clickOnDigitBtn("3");
//		symbol.clickOnEqualBtn();
//		
//		firstString = display.getInfoFromResultField();
//		resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.sin(Math.toRadians(3));	
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.floor(actualNum);
//	    actualNum = (double) result/1000000;
//		
//		checkNum=actualNum*1000000;
//	    result = (int)Math.floor(checkNum);
//	    checkNum = (double) result/1000000;
//		
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));	 
//	    LOGGER.info(ModeDegRad);
//		Assert.assertEquals(actualNum, checkNum, "Function sin in " + ModeDegRad + " Mode does not work correctly");
//		
//        symbol.clickOnClearBtn();
//		function.clickOnCosBtn();
//		number.clickOnDigitBtn("1");
//		symbol.clickOnEqualBtn();
//		
//		firstString = display.getInfoFromResultField();
//		resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.cos(Math.toRadians(1));	
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.round(actualNum);
//	    actualNum = (double) result/1000000;		
//		
//		checkNum=checkNum*1000000;
//		result = (int)Math.round(checkNum);
//	    checkNum = (double) result/1000000;
//				
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));	 
//	    LOGGER.info(ModeDegRad);
//	    Assert.assertEquals(actualNum, checkNum, "Function cos in " + ModeDegRad + " Mode does not work correctly");
//	    
//        symbol.clickOnClearBtn();
//		function.clickOnTanBtn();
//		number.clickOnDigitBtn("1");
//		symbol.clickOnEqualBtn();
//		
//		firstString = display.getInfoFromResultField();
//		resultString = ""; 
//		if(firstString.contains("−")) {
//			resultString = "-" + firstString.substring(1);
//		} else {
//			resultString = firstString; 
//		}
//		actualNum = Double.parseDouble(resultString);
//		checkNum = Math.tan(Math.toRadians(1));
//		
//		actualNum=actualNum*1000000;
//	    result = (int)Math.round(actualNum);
//	    actualNum = (double) result/1000000;		
//		
//		checkNum=checkNum*1000000;
//		result = (int)Math.round(checkNum);
//	    checkNum = (double) result/1000000;
//				
//	    LOGGER.info(String.valueOf(actualNum));
//	    LOGGER.info(String.valueOf(checkNum));	 
//	    LOGGER.info(ModeDegRad);
//		Assert.assertEquals(actualNum, checkNum, "Function tan in " + ModeDegRad + " Mode does not work correctly");	
//				
//	}		
//	
	@Test()
	public void testCalculatorMathPanelTriginometricInverse() {
		
		MathPanel function = new MathPanel(getDriver());
		function.clickOnInvBtn();
		function.clickOnArcSinBtn();
		
	    NumberPanel number = new NumberPanel(getDriver());
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
				
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
		
		function.clickOnArcCosBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
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
		
		function.clickOnArcTanBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
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
		
		function.clickOnArcSinBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
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

		function.clickOnArcCosBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
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

		function.clickOnArcTanBtn();
		number.clickOnDigitBtn("0");
		number.clickOnPointBtn();
		number.clickOnDigitBtn("5");
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

}