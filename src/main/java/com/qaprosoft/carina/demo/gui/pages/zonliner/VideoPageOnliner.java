package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.zonliner.FramePageOnliner;

public class VideoPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    @FindBy(xpath = "//iframe[@title='YouTube video player']")
    private ExtendedWebElement videoLink;
     
    public VideoPageOnliner(WebDriver driver) {
        super(driver);
    }    
      
    public void showVideoPageOperations() {
    	videoLink.scrollTo();
    	videoLink.click();
    	videoLink.pause(20.0);
    }
    
    public FramePageOnliner getFramePageLink() {
    	 return new FramePageOnliner(driver.switchTo().frame(videoLink.getElement()));
    }   
    
}
