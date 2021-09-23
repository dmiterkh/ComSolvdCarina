package com.qaprosoft.carina.demo.gui.pages.onliner;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
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
    }
  	
  	
  	
    public void clickOnCountryDropdownLink() {
    	countryDropdownListLink.get(0).click();
    }
    
    public void clickOnCountryChoiseLink() {
    	countryChoiseLink.click();
    }
    
    public void clickOnProducerDropdownLink() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");	
		producerDropdownListLink.get(0).click();	
    }
    
    public void clickOnProducerChoiseLink() {
    	producerChoiseLink.click();
    }
    
    public void clickOnModelDropdownLink() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
    	modelDropdownListLink.get(0).click();
    }
    
    public void clickOnModelChoiseLink() {
    	modelChoiseLink.click();
    }
    
    public void clickOnLowerYearDropdownLink() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
    	lowerYearDropdownListLink.get(0).click();
    }
    
    public void clickOnLowerYearChoiseLink() {
    	lowerYearChoiseLink.click();
    }
    
    public ExtendedWebElement returnCountryDropdownLink() {
    	return countryDropdownListLink.get(0);
    }
    
    public ExtendedWebElement returnCountryChoiseLink() {
    	return countryChoiseLink;
    }
           
    public ExtendedWebElement  returnProducerDropdownLink() {
    	return producerDropdownListLink.get(0); 	
    }
    
    public ExtendedWebElement returnProducerChoiseLink() {
    	return producerChoiseLink;
    }
    
    public ExtendedWebElement  returnModelDropdownLink() {
    	return modelDropdownListLink.get(0);
    }
    
    public ExtendedWebElement returnModelChoiseLink() {
    	return modelChoiseLink;
    }
    
    public ExtendedWebElement returnLowerYearDropdownLink() {
    	return lowerYearDropdownListLink.get(0);
    }
    
    public ExtendedWebElement returnLowerYearChoiseLink() {
    	return lowerYearChoiseLink;
    }
    
    
    
}