package com.qaprosoft.carina.demo.gui.pages.onliner;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;


public class AutomobilePageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(AutomobilePageOnliner.class);

    private By countryDropdownListLinkBy = By.xpath("//div[@class='input-style__faux' and text()='Все страны']//parent::div//parent::div");
    
    private By producerDropdownListLinkBy = By.xpath("//div[@class='input-style__faux' and text()='Марка']//parent::div//parent::div");
    
    private By modelDropdownListLinkBy = By.xpath("//div[@class='input-style__faux' and text()='Модель']//parent::div//parent::div");
    
    private By lowerYearDropdownLinkBy = By.xpath("//div[@class='input-style__faux' and text()='с']//following-sibling::select");
    
    
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
    private ExtendedWebElement lowerYearDropdownLink;
       
    @FindBy(xpath = "//div[@class='input-style__faux' and text()='с']//following-sibling::select//option[@value=2011] ")
    private ExtendedWebElement lowerYearChoiseLink;
    
    @FindBy(xpath = "//span[contains(@class,'vehicle-interaction__sub vehicle-interaction__sub_main')]")   
    private List<ExtendedWebElement> extraElementsListLink;
    
    
  	public AutomobilePageOnliner(WebDriver driver) {
        super(driver);
    }
  	
  	
  	
    public void clickOnCountryDropdownLink() {
    	countryDropdownListLink.get(0).click();
    }
  	
    public void clickOnCountryDropdownLinkUsingWait() {
       	WebDriverWait wait = new WebDriverWait(getDriver(), 5);
    	wait.until(ExpectedConditions.presenceOfElementLocated(countryDropdownListLinkBy));
    	Assert.assertTrue(countryDropdownListLink.get(0).isPresent(), "The link is not present!");
        LOGGER.info("The link is present!");
        
       	wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdownListLinkBy));
       	Assert.assertTrue(countryDropdownListLink.get(0).isVisible(), "The link is not visible!");
        LOGGER.info("The link is visible!");

       	countryDropdownListLink.get(0).click();
    }
    
    public void clickOnCountryChoiseLink() {
    	countryChoiseLink.click();
    }
    
    
    
    
    public void clickOnProducerDropdownLink() {
		producerDropdownListLink.get(0).click();		
    }
    
    public void clickOnProducerDropdownLinkUsingJS() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");	
		producerDropdownListLink.get(0).click();
    }

    public void clickOnProducerDropdownLinkUsingWait() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");	
		
    	WebDriverWait wait = new WebDriverWait(getDriver(), 5);
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(producerDropdownListLinkBy));
       	Assert.assertTrue(producerDropdownListLink.get(0).isPresent(), "The link is not present!");
       	LOGGER.info("The link is present!");
       	
       	wait.until(ExpectedConditions.visibilityOfElementLocated(producerDropdownListLinkBy));
       	Assert.assertTrue(producerDropdownListLink.get(0).isVisible(), "The link is not visible!");
        LOGGER.info("The link is visible!");
        
   		producerDropdownListLink.get(0).click();
    }
    
    public void clickOnProducerChoiseLink() {
    	producerChoiseLink.click();
    }

    
    
    public void clickOnModelDropdownLink() {
    	modelDropdownListLink.get(0).click();
    }
    
    public void clickOnModelDropdownLinkUsingJS() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
    	modelDropdownListLink.get(0).click();
    }	
    
    public void clickOnModelDropdownLinkUsingWait() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		
    	WebDriverWait wait = new WebDriverWait(getDriver(), 5);
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(modelDropdownListLinkBy));
       	Assert.assertTrue(modelDropdownListLink.get(0).isPresent(), "The link is not present!");
       	LOGGER.info("The link is present!");
       	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(modelDropdownListLinkBy));
       	Assert.assertTrue(modelDropdownListLink.get(0).isVisible(), "The link is not visible!");
        LOGGER.info("The link is visible!");
    	
    	modelDropdownListLink.get(0).click();
    }
    
    public void clickOnModelChoiseLink() {
    	modelChoiseLink.click();
    }
    
    
    
    public void clickOnLowerYearDropdownLink() {
    	lowerYearDropdownLink.click();
    }
    
    public void clickOnLowerYearDropdownLinkUsingJS() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
    	lowerYearDropdownLink.click();
    }
    
    public void clickOnLowerYearDropdownLinkUsingWait() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		
//    	WebDriverWait wait = new WebDriverWait(getDriver(), 5);
//    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(lowerYearDropdownLinkBy));
//       	Assert.assertTrue(lowerYearDropdownLink.isPresent(), "The link is not present!");
//      	LOGGER.info("The link is present!");
//       	
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(lowerYearDropdownLinkBy));
//       	Assert.assertTrue(lowerYearDropdownLink.isVisible(), "The link is not visible!");

		LOGGER.info("The link is present!");
       	LOGGER.info("The link is visible!");
       	
    	lowerYearDropdownLink.click();
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
    	return lowerYearDropdownLink;
    }
    
    public ExtendedWebElement returnLowerYearChoiseLink() {
    	return lowerYearChoiseLink;
    }
    
    
    
}