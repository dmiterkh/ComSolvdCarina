package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.ModuleElement;
import java.util.List;


public class NumberPanel extends AbstractUIObject {

//  @FindBy(xpath = "//android.widget.Button[@content-desc='point']")
	@FindBy(id = "com.google.android.calculator:id/dec_point")
    private ExtendedWebElement point;

//    @FindBy(id = "com.google.android.calculator:id/digit_")
//    private List<ExtendedWebElement> digitBtnList;

    public NumberPanel(WebDriver driver){
    	super(driver);
   	}
    
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
}