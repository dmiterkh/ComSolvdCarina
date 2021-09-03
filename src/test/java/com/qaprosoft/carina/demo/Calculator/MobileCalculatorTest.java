package com.qaprosoft.carina.demo.Calculator;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.DisplayPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.NumberPanel;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.SymbolPanel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileCalculatorTest extends MobileCalculatorTestBase implements IAbstractTest {
	
	@Test()
    public void testCalculatorNumberPanel() {
    	
    	DisplayPanel display = new DisplayPanel(getDriver());
        display.getInfoFromEntryField();
        Assert.assertEquals(display.getInfoFromEntryField(), "", "Display Panel does not work correctly");
        
        NumberPanel number = new NumberPanel(getDriver());
        number.clickOnDigitBtn("0");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("9");
        number.clickOnDigitBtn("8");
        number.clickOnDigitBtn("7");
        number.clickOnDigitBtn("6");
        number.clickOnDigitBtn("5");
        number.clickOnDigitBtn("4");
        number.clickOnDigitBtn("3");
        number.clickOnDigitBtn("2");
        number.clickOnDigitBtn("1");
 
        display.getInfoFromEntryField();
        Assert.assertEquals(display.getInfoFromEntryField(), "0.987654321", "Number Panel does not work correctly");
        
    }	
 
    @Test()
    public void testCalculatorSymbolPanel() {
    	        
        NumberPanel number = new NumberPanel(getDriver());
        number.clickOnDigitBtn("9");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("0");

        SymbolPanel symbol = new SymbolPanel(getDriver());
        symbol.clickOnAddBtn();

        number.clickOnDigitBtn("7");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("8");
        
        DisplayPanel display = new DisplayPanel(getDriver());
        display.getInfoFromPreviewField();
        Assert.assertEquals(display.getInfoFromResultField(), "16.8", "Addition button does not work correctly");
        
        symbol.clickOnEqualBtn();
        display.getInfoFromResultField();
        Assert.assertEquals(display.getInfoFromResultField(), "16.8", "Equality button does not work correctly");
        
        symbol.clickOnSubtractBtn();
        
        number.clickOnDigitBtn("6");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("6");
        
        display.getInfoFromPreviewField();
        Assert.assertEquals(display.getInfoFromResultField(), "10.2", "Subtraction button does not work correctly");
                
        symbol.clickOnEqualBtn();
        display.getInfoFromResultField();
        Assert.assertEquals(display.getInfoFromResultField(), "10.2", "Equality button does not work correctly");
        
        symbol.clickOnDivideBtn();
        
        number.clickOnDigitBtn("3");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("4");

        display.getInfoFromPreviewField();
        Assert.assertEquals(display.getInfoFromResultField(), "3", "Division button does not work correctly");
        
        symbol.clickOnEqualBtn();
        display.getInfoFromResultField();
        Assert.assertEquals(display.getInfoFromResultField(), "3", "Equality button does not work correctly");
        
        symbol.clickOnMultiplyBtn();
        
        number.clickOnDigitBtn("2");
        number.clickOnPointBtn();
        number.clickOnDigitBtn("5");

        display.getInfoFromPreviewField();
        Assert.assertEquals(display.getInfoFromResultField(), "7.5", "Multiplication button does not work correctly");
        
        symbol.clickOnEqualBtn();
        display.getInfoFromResultField();
        Assert.assertEquals(display.getInfoFromResultField(), "7.5", "Equality button does not work correctly");
         
        symbol.clickOnClearBtn();
        display.getInfoFromResultField();
        Assert.assertEquals(display.getInfoFromResultField(), "", "Clear button does not work correctly");
        
        number.clickOnDigitBtn("1");
        number.clickOnDigitBtn("2");
        symbol.clickOnDeleteBtn();
        display.getInfoFromEntryField();
        Assert.assertEquals(display.getInfoFromEntryField(), "1", "Delete button does not work correctly");

    }

   

}