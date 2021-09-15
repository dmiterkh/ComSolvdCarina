package com.qaprosoft.carina.demo.gui.pages.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class AutomobilePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutomobilePageOnliner.class);

    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Все страны']//parent::div//parent::div")
    private List<ExtendedWebElement> countryDropdownListLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Беларусь']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement countryChoiseLink;
    
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Марка']//parent::div//parent::div")
    private List<ExtendedWebElement> producerDropdownListLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Renault']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement producerChoiseLink;

    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Модель']//parent::div//parent::div")
    private List<ExtendedWebElement> modelDropdownListLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Scenic']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement modelChoiseLink;

    @FindBy(xpath = "//div[@class='input-style__faux' and text()='с']//following-sibling::select")
    private List<ExtendedWebElement> lowerYearDropdownListLink;
    
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='с']//following-sibling::select//option[@value=2011] ")
    private ExtendedWebElement lowerYearChoiseLink;
    
       
  	public AutomobilePageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://ab.onliner.by");
    }
  	
    public void clickOnCountryDropdownLink() {
    	countryDropdownListLink.get(0).scrollTo();
    	countryDropdownListLink.get(0).click();

    }
    
    public void clickOnCountryChoiseLink() {
    	countryChoiseLink.scrollTo();
    	countryChoiseLink.click();
    	countryDropdownListLink.get(0).scrollTo();
    }
    
    public void clickOnProducerDropdownLink() {
    	producerDropdownListLink.get(0).scrollTo();
    	producerDropdownListLink.get(0).click();
    }
    
    public void clickOnProducerChoiseLink() {
    	producerChoiseLink.scrollTo();
    	producerChoiseLink.click();
    	producerDropdownListLink.get(0).scrollTo();
    }
    
    public void clickOnModelDropdownLink() {
    	modelDropdownListLink.get(0).scrollTo();
    	modelDropdownListLink.get(0).click();
    }
    
    public void clickOnModelChoiseLink() {
    	modelChoiseLink.scrollTo();
    	modelChoiseLink.click();
    	modelDropdownListLink.get(0).scrollTo();
    }
    
    public void clickOnLowerYearDropdownLink() {
    	lowerYearDropdownListLink.get(0).scrollTo();
    	lowerYearDropdownListLink.get(0).click();
    }
    
    public void clickOnLowerYearChoiseLink() {
    	lowerYearChoiseLink.scrollTo();
    	lowerYearChoiseLink.click();
    	lowerYearDropdownListLink.get(0).scrollTo();
    }
    
    
           
    
}