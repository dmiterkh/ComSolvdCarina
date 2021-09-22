package com.qaprosoft.carina.demo.gui.pages.onliner;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class DemoSawbladesPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoSawbladesPageOnliner.class);

    
    public DemoSawbladesPageOnliner(WebDriver driver) {
        super(driver);
    }
        
}