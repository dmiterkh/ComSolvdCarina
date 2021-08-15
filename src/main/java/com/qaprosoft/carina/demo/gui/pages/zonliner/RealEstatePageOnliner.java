package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class RealEstatePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//span[@class='filter__item-inner' and text()='1']//parent::label")
    private ExtendedWebElement numberOfRoomsButtonLink;
    
    @FindBy(xpath = "//div[@id='search-filter-year-slider']//div//div//div[@class='noUi-handle noUi-handle-upper']")
    private ExtendedWebElement upperYearSliderLink;
    
    @FindBy(xpath = "//div[@id='search-filter-year-slider']//div//div[@style='left: 10.6667%;']//div[@class='noUi-handle noUi-handle-upper']")
    private ExtendedWebElement upperYearSliderLink2;
    
    @FindBy(xpath = "//div[@id='search-filter-price-slider']//div//div//div[@class='noUi-handle noUi-handle-upper']")
    private ExtendedWebElement upperPriceSliderLink;

    @FindBy(xpath = "//div[@id='search-filter-price-slider']//div//div[@style='left: 3.60231%;']//div[@class='noUi-handle noUi-handle-upper']")
    private ExtendedWebElement upperPriceSliderLink2;

    public RealEstatePageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://r.onliner.by/pk");
    }

    public void clickOnNumberOfRoomsButton() {
    	numberOfRoomsButtonLink.scrollTo();
    	numberOfRoomsButtonLink.click();
    	numberOfRoomsButtonLink.pause(5.0);
    }
   
    public void setOnUpperYearSlider() {
    	upperYearSliderLink.scrollTo();
    	upperYearSliderLink = upperYearSliderLink2;
    	upperYearSliderLink.scrollTo();    	
    }
    
    public void setOnUpperPriceSlider() {
    	upperPriceSliderLink.scrollTo();
    	upperPriceSliderLink = upperPriceSliderLink2;
    	upperPriceSliderLink.scrollTo();
    }
    
    public ExtendedWebElement returnUpperYearSliderLink() {
    	return upperYearSliderLink;
    }
    
    public ExtendedWebElement returnUpperPriceSliderLink() {
    	return upperPriceSliderLink;
    }    
    
    public ExtendedWebElement returnUpperYearSliderLink2() {
    	return upperYearSliderLink2;
    }
    
    public ExtendedWebElement returnUpperPriceSliderLink2() {
    	return upperPriceSliderLink2;
    }
    
//    public void slide(ExtendedWebElement slider, int moveX, int moveY) {
//    	  //TODO: SZ migrate to FluentWaits
//    	  if (slider.isElementPresent()) {
//    	    WebDriver drv = getDriver();
//    	    (new Actions(drv)).moveToElement(slider.getElement()).dragAndDropBy(slider.getElement(), moveX, moveY)
//    	        .build().perform();
//    	    Messager.SLIDER_MOVED.info(slider.getNameWithLocator(), String.valueOf(moveX), String.valueOf(moveY));
//    	  } else {
//    	    Messager.SLIDER_NOT_MOVED.error(slider.getNameWithLocator(), String.valueOf(moveX), String.valueOf(moveY));
//    	  }
//    	}
    
//    public static void slider(){
//    	WebElement slider = realEstatePageOnliner.returnYearSliderLink();
//        int width=slider.getSize().getWidth();
//        Actions move = new Actions(getdriver());
//        org.openqa.selenium.interactions.Action action  = move.dragAndDropBy(slider, ((width*25)/100), 0).build();
//        action.perform();
//        System.out.println("Slider moved");
//    }   
    
}

