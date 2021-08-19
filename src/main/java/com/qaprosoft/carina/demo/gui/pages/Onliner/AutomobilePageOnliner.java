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

public class AutomobilePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutomobilePageOnliner.class);

    //!!!!!!!! List
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Все страны']//parent::div//parent::div")
    private ExtendedWebElement countryDropdownLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Беларусь']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement countryChoiseLink;
    
    //!!!!!!!! List
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Марка']//parent::div//parent::div")
    private ExtendedWebElement producerDropdownLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Renault']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement producerChoiseLink;

    //!!!!!!!! List
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='Модель']//parent::div//parent::div")
    private ExtendedWebElement modelDropdownLink;
  
  	@FindBy(xpath = "//div[@class='dropdown-style__checkbox-sign' and text()='Scenic']//parent::div//parent::div//parent::label//parent::li")
  	private ExtendedWebElement modelChoiseLink;

    //!!!!!!!! List
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='с']//following-sibling::select")
    private ExtendedWebElement lowerYearDropdownLink;
    
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='с']//following-sibling::select//option[@value=2011] ")
    private ExtendedWebElement lowerYearChoiseLink;
    
       
  	public AutomobilePageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://ab.onliner.by");
    }
  	
    //!!!!!!!!!! List
    public void clickOnCountryDropdownLink() {
    	countryDropdownLink.scrollTo();
    	countryDropdownLink.click();

    }
    
    public void clickOnCountryChoiseLink() {
    	countryChoiseLink.scrollTo();
    	countryChoiseLink.click();
    	countryDropdownLink.scrollTo();
    }
    
    //!!!!!!!!!! List
    public void clickOnProducerDropdownLink() {
    	producerDropdownLink.scrollTo();
    	producerDropdownLink.click();
    }
    
    public void clickOnProducerChoiseLink() {
    	producerChoiseLink.scrollTo();
    	producerChoiseLink.click();
    	producerDropdownLink.scrollTo();
    }
    
    //!!!!!!!!!! List
    public void clickOnModelDropdownLink() {
    	modelDropdownLink.scrollTo();
    	modelDropdownLink.click();
    }
    
    public void clickOnModelChoiseLink() {
    	modelChoiseLink.scrollTo();
    	modelChoiseLink.click();
    	modelDropdownLink.scrollTo();
    }
    
    //!!!!!!!!!! List
    public void clickOnLowerYearDropdownLink() {
    	lowerYearDropdownLink.scrollTo();
    	lowerYearDropdownLink.click();
    }
    
    public void clickOnLowerYearChoiseLink() {
    	lowerYearChoiseLink.scrollTo();
    	lowerYearChoiseLink.click();
    	lowerYearDropdownLink.scrollTo();
    }
    
    
           
    
}