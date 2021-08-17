package com.qaprosoft.carina.demo.gui.components.zonliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;


public class UpperYearSlider extends AbstractUIObject {
	
//    @FindBy(xpath = "//div[@id='search-filter-year-slider']//div//div//div[@class='noUi-handle noUi-handle-upper']")
//    private ExtendedWebElement upperYearSliderLink;
  
    public UpperYearSlider(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    
//    public ExtendedWebElement setUpperYearSliderLink() {
//    	return upperYearSliderLink;
//    }

}
