package com.qaprosoft.carina.demo.gui.components.Onliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;


public class UpperPriceSlider extends AbstractUIObject {
  
    public UpperPriceSlider(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}

