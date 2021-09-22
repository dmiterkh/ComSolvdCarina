package com.qaprosoft.carina.demo.gui.pages.onliner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CatalogPageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogPageOnliner.class);
	
    
    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры и')]//parent::span//parent::li")
    private ExtendedWebElement computerTechnicsLink;
        
    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]//parent::div")
    private ExtendedWebElement computersLink;
      
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/notebook']")
    private ExtendedWebElement laptopLink;
    
    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]//parent::span//parent::li")
    private ExtendedWebElement categoryFormatLink;
        
    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'%s')]//parent::div")
    private ExtendedWebElement subCategoryFormatLink;
      
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/microvawe']")
    private ExtendedWebElement microvaweLink;

    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/saw_blades']")
    private ExtendedWebElement sawbladesLink;
    
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/linendryer']")
    private ExtendedWebElement linendryerLink;
    
    

    public CatalogPageOnliner(WebDriver driver) {
        super(driver);
    }
    
    
    public void clickOnComputerTechnicsLink() {
    	computerTechnicsLink.click();
    }
           
    public void clickOnComputersLink() {
    	computersLink.click();
    }
    
    public LaptopPageOnliner openLaptopPageOnliner() {
    	laptopLink.click();
        return new LaptopPageOnliner(driver);
    } 

    public LaptopPageOnliner getLaptopPageOnliner() {
    	computerTechnicsLink.click();
    	computersLink.click();
    	laptopLink.click();
        return new LaptopPageOnliner(driver);
    } 
    
    public DemoMicrovawePageOnliner openMicrovawePageOnliner() {
    	microvaweLink.click();
        return new DemoMicrovawePageOnliner(driver);
    } 
    
    public DemoSawbladesPageOnliner openSawbladesPageOnliner() {
    	sawbladesLink.click();
        return new DemoSawbladesPageOnliner(driver);
    } 
    
    public DemoLinendryerPageOnliner openLinendryerPageOnliner() {
    	linendryerLink.click();
        return new DemoLinendryerPageOnliner(driver);
    } 

    public void getCategoryAndSubCategoryPageOnliner(String categoryArg, String subCategoryArg, String subSubCategoryArg) {
    	categoryFormatLink.format(categoryArg).click();
    	pause(1);
    	subCategoryFormatLink.format(subCategoryArg).click();
    	pause(1);
    	if ("notebook".equals(subSubCategoryArg)) {
    		openLaptopPageOnliner();
    	} if ("microvawe".equals(subSubCategoryArg)) {
    		openMicrovawePageOnliner();
    	} if ("saw_blades".equals(subSubCategoryArg)) {
    		openSawbladesPageOnliner();
    	} if ("linendryer".equals(subSubCategoryArg)) {
    		openLinendryerPageOnliner();
    	} 
    	pause(1);


    } 


}