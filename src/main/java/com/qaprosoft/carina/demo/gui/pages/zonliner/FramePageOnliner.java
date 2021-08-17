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

public class FramePageOnliner extends AbstractPage {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
//    @FindBy(xpath = "//iframe[@title='YouTube video player']")
//    private ExtendedWebElement videoLink;
//    
//    @FindBy(xpath = "//iframe[@title='YouTube video player']")
//    private WebElement videoLinkWeb;
//    
//    @FindBy(xpath = "//iframe[@title='YouTube video player']")
//    private VideoElement videoLinkUI;
    
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//button[@aria-label='Пауза (k)']")
    private WebElement pauseButtonLink;
    
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//button[@aria-label='Смотреть (k)']")
    private WebElement startButtonLink;
  
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//span[@class='ytp-volume-area']//button[@aria-label='Отключение звука (m)']")
    private ExtendedWebElement disableSoundButtonLink;
    
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//span[@class='ytp-volume-area']//button[@aria-label='Включить звук (m)']")
    private ExtendedWebElement enableSoundButtonLink;

    //!!!!!!  slider  !!!!!!
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//span[@class='ytp-volume-area']//div//div//div[@class='ytp-volume-slider-handle']")
    private ExtendedWebElement sliderLink;

    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-right-controls']//button[@title='Субтитры (c)' and contains(@class,'ytp-button')]")
    private ExtendedWebElement subtitlesButtonLink;

    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-right-controls']//button[@title='Во весь экран (f)' and contains(@class,'ytp-button')]")
    private ExtendedWebElement extendScreenButtonLink;

    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-right-controls']//button[@title='Выход из полноэкранного режима (f)' and contains(@class,'ytp-button')]")
    private ExtendedWebElement reduceScreenButtonLink;

    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-right-controls']//button[@title='Настройки' and contains(@class,'ytp-button')]")
    private ExtendedWebElement settingsButtonLink;

    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-right-controls']//a[contains(@title,'Смотреть это видео на') and contains(@class,'ytp-button')]")
    private ExtendedWebElement youtubeButtonLink;
    
	    
    public FramePageOnliner(WebDriver driver) {
        super(driver);
    }    
    
       
//    public VideoElement getVideoLinkUI() {
//        return videoLinkUI;
//    }
    
    public void showFramePageOperations() {
		pauseButtonLink.click();
    	startButtonLink.click();
		startButtonLink.click();
		pauseButtonLink.click();
    }
    	
	public void showFramePageOperations2() {   	
        if(disableSoundButtonLink.isPresent()) {
    		disableSoundButtonLink.click();
    		enableSoundButtonLink.pause(5.0);
    		enableSoundButtonLink.click();
        	disableSoundButtonLink.pause(5.0);
        }  
        if(enableSoundButtonLink.isPresent()) {
    		enableSoundButtonLink.click();
    		disableSoundButtonLink.pause(5.0);
    		disableSoundButtonLink.click();
    		enableSoundButtonLink.pause(5.0);
        } 
        subtitlesButtonLink.click();
        subtitlesButtonLink.pause(5.0);
    	subtitlesButtonLink.click();
    	if(extendScreenButtonLink.isPresent()) {
    		extendScreenButtonLink.click();
    		reduceScreenButtonLink.pause(5.0);
    		reduceScreenButtonLink.click();
        	extendScreenButtonLink.pause(5.0);
    	}    	
    	if(reduceScreenButtonLink.isPresent()) {
    		reduceScreenButtonLink.click();
    		extendScreenButtonLink.pause(5.0);
    		extendScreenButtonLink.click();
    		reduceScreenButtonLink.pause(5.0);
        }
    	settingsButtonLink.click();
    	youtubeButtonLink.click();
    	youtubeButtonLink.pause(5.0);
    }

}


