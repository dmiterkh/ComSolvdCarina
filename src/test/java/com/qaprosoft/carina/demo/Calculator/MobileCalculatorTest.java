package com.qaprosoft.carina.demo.Calculator;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.Display;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.Number;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator.Symbol;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileCalculatorTest implements IAbstractTest {

    @Test()
    public void testCalc() {
    	
        Number number = new Number(getDriver());
        pause(3);
        number.chooseDigit("1");
        number.clickPoint();
        number.chooseDigit("5");

        Symbol symbol = new Symbol(getDriver());
        symbol.clickPlus();

        number.chooseDigit("6");
        number.clickPoint();
        number.chooseDigit("9");

        symbol.clickEqual();
        pause(4);

        Display display = new Display(getDriver());
        display.getResultField();
        
        Assert.assertEquals(display.getResultField(), "8.4", "Error");

    }

}