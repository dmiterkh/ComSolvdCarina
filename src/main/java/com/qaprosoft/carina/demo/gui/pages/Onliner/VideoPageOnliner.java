package com.qaprosoft.carina.demo.gui.pages.Onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
//import com.qaprosoft.carina.demo.gui.pages.Onliner.FramePageOnliner;

public class VideoPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(VideoPageOnliner.class);
    
    @FindBy(xpath = "//iframe[@title='YouTube video player']")
    private ExtendedWebElement youtubeVideoLink;
    
    @FindBy(xpath = "//iframe[@title='YouTube video player']")
    private WebElement youtubeVideoLink2;
        
    
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//button[@aria-label='Пауза (k)']")
    private WebElement pauseButtonLink;
    
    @FindBy(xpath = "//body//div//div//div//div//div[@class='ytp-left-controls']//button[@aria-label='Смотреть (k)']")
    private WebElement startButtonLink;
    
    
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
     
    public VideoPageOnliner(WebDriver driver) {
        super(driver);
    } 
    
    public void showVideoPageOperations() {
    	youtubeVideoLink.scrollTo();
    	youtubeVideoLink.click();
    	youtubeVideoLink.pause(5.0);

    	WebElement element;
    	element = getDriver().switchTo().frame(0).findElement(By.xpath("//div[@class='ytp-left-controls']//button[contains(@aria-label,'(k)')]"));
    	element.click();
    	youtubeVideoLink.pause(5.0);
    	element = getDriver().switchTo().frame(0).findElement(By.xpath("//div[@class='ytp-left-controls']//button[contains(@aria-label,'(k)')]"));
    	element.click();
    	youtubeVideoLink.pause(5.0);
    }
    
    public HomePageOnliner returnToHomePage() {
    	homeLink.click();
    	return new HomePageOnliner(driver);
	}
    
    public ExtendedWebElement getHomePageLink() {
    	return homeLink;
	}
    
    public boolean checkYoutubeVideoLink() {
    	if (youtubeVideoLink.isPresent()) {
    		return true;
    	} else {
    		return false;
    	} 	
    } 
    
    public ExtendedWebElement getYoutubeVideoLink() {
    	return youtubeVideoLink;
	}
    
//    public FramePageOnliner getFramePageLink() {
//    	 return new FramePageOnliner(driver.switchTo().frame(videoLink.getElement()));
//    }   
    
    
    
}