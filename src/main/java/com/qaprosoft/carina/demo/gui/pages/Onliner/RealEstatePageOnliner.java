package com.qaprosoft.carina.demo.gui.pages.Onliner;

import java.lang.invoke.MethodHandles;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.Onliner.UpperPriceSlider;
import com.qaprosoft.carina.demo.gui.components.Onliner.UpperYearSlider;

public class RealEstatePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(RealEstatePageOnliner.class);

    @FindBy(xpath = "//span[@class='filter__item-inner' and text()='1']//parent::label")
    private ExtendedWebElement numberOfRoomsButtonLink;
    
    @FindBy(xpath = "//div[@id='search-filter-year-slider']//div//div//div[contains(@class,'noUi-handle-upper')]")
    private UpperYearSlider upperYearSliderLinkUI;
    
    @FindBy(xpath = "//div[@id='search-filter-price-slider']//div//div//div[contains(@class,'noUi-handle-upper')]")
    private UpperPriceSlider upperPriceSliderLinkUI;

    @FindBy(xpath = "//div[@id='search-filter-year-slider']//div//div//div[contains(@class,'noUi-handle-upper')]")
    private ExtendedWebElement upperYearSliderLink;
    
    
    @FindBy(xpath = "//div[@id='search-filter-price-slider']//div//div//div[contains(@class,'noUi-handle-upper')]")
    private ExtendedWebElement upperPriceSliderLink;

    public RealEstatePageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://r.onliner.by/pk");
    }

    public void clickOnNumberOfRoomsButton() {
    	numberOfRoomsButtonLink.scrollTo();
    	numberOfRoomsButtonLink.click();
    	numberOfRoomsButtonLink.pause(5.0);
    }
 
    public void clickOnUpperYearSlider() {
    	upperYearSliderLink.scrollTo();
    	upperYearSliderLink.click();
    	upperYearSliderLink.pause(5.0);
    }
    
    public void clickOnUpperPriceSlider() {
    	upperPriceSliderLink.scrollTo();
    	upperPriceSliderLink.click();
    	upperPriceSliderLink.pause(5.0);
    }
    
    public UpperYearSlider getUpperYearSliderLinkUI() {
        return upperYearSliderLinkUI;
    }
    
    public UpperPriceSlider getUpperPriceSliderLinkUI() {
        return upperPriceSliderLinkUI;
    }
    
    public ExtendedWebElement getUpperYearSliderLink() {
    	return upperYearSliderLink;
    }
    
    public ExtendedWebElement getUpperPriceSliderLink() {
    	return upperPriceSliderLink;
    }    
    
    public void moveOnUpperYearSlider() {
    	upperYearSliderLinkUI.slide(upperYearSliderLink, -168, 0);
    	upperYearSliderLink.pause(10.0);	
    }
     
    public void moveOnUpperPriceSlider() {
    	upperPriceSliderLinkUI.slide(upperPriceSliderLink, -181, 0);
    	upperPriceSliderLink.pause(20.0);	
    }   
    
}