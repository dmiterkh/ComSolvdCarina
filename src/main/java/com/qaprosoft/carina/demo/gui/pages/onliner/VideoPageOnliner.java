package com.qaprosoft.carina.demo.gui.pages.onliner;

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
   
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
    
    
    
    public VideoPageOnliner(WebDriver driver) {
        super(driver);
    } 
    
    
    
    public void showVideoPageOperations() {
    	youtubeVideoLink.click();
    	youtubeVideoLink.pause(1);
    	
    	getDriver().switchTo().frame(0);
    	WebElement element;
    	
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-play-button') and contains(@aria-label,'(k)')]"));
    	element.click();

    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-play-button') and contains(@aria-label,'(k)')]"));
    	element.click();
 
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-mute-button') and contains(@aria-label,'(m)')]"));
    	element.click();
    	
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-mute-button') and contains(@aria-label,'(m)')]"));
    	element.click();

    	
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-fullscreen-button') and contains(@title,'(f)')]"));
    	element.click();
    	
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-fullscreen-button') and contains(@title,'(f)')]"));
    	element.click();
    	
    	element = getDriver().findElement(By.xpath("//button[contains(@class,'ytp-settings-button')]"));
    	element.click();
    	
    	String videoPageWindow = driver.getWindowHandle();
    	element = getDriver().findElement(By.xpath("//a[contains(@class,'ytp-youtube-button')]"));
    	element.click();
    	pause(3);	
    	driver.switchTo().window(videoPageWindow);
    	pause(3);
    	
    }

    public ExtendedWebElement getHomePageLink() {
    	return homeLink;
	}
    
    public HomePageOnliner returnToHomePage() {
    	while (!(getHomePageLink().isElementPresent())){
  		    refresh(); 
  		    pause(5.0);
  		};
    	getHomePageLink().click();
    	return new HomePageOnliner(driver);
	}
    
    public ExtendedWebElement getYoutubeVideoLink() {
    	return youtubeVideoLink;
	}
    
    public boolean checkYoutubeVideoLink() {
    	return youtubeVideoLink.isPresent();	
    } 
    
}