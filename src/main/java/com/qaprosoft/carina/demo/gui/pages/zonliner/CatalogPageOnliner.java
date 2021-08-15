package com.qaprosoft.carina.demo.gui.pages.zonliner;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LaptopPageOnliner;

public class CatalogPageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры и')]//parent::span//parent::li")
    private ExtendedWebElement computerTechnicsLink;
        
    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]//parent::div")
    private ExtendedWebElement computersLink;
      
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/notebook']")
    private ExtendedWebElement laptopLink;
    

    public CatalogPageOnliner(WebDriver driver) {
        super(driver);
        setPageURL("https://catalog.onliner.by/");
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
    
}
