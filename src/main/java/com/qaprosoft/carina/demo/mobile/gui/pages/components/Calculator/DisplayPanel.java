package com.qaprosoft.carina.demo.mobile.gui.pages.components.Calculator;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DisplayPanel extends AbstractUIObject {
	
	
    @FindBy(id = "com.google.android.calculator:id/formula")
    private ExtendedWebElement entryField;
	
    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement resultField;
    
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    private ExtendedWebElement previewField;
    
    public DisplayPanel(WebDriver driver){
    	super(driver);
    }
    
    public String getInfoFromResultField(){
        return resultField.getText();
    }
    
    public String getInfoFromEntryField(){
        return entryField.getText();
    }
    
    public String getInfoFromPreviewField(){
        return previewField.getText();
    }
}
