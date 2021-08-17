package com.qaprosoft.carina.demo.gui.components.zonliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
//import com.qaprosoft.carina.demo.gui.pages.CompareModelsPage;
//import com.qaprosoft.carina.demo.gui.pages.HomePage;
//import com.qaprosoft.carina.demo.gui.pages.NewsPage;

public class FastSearch extends AbstractUIObject {

	@FindBy(xpath = "//input[@class='fast-search__input']")
	private ExtendedWebElement fastSearchFieldLink;

    @FindBy(xpath = "//html//body//div//div//div//div//div//div[text()='на барахолке']")
    private ExtendedWebElement usedGoodsButtonLink;
    
    @FindBy(xpath = "//html//body//div//div//div//div//div//div[text()='на барахолке']")
    private WebElement usedGoodsButtonLink2;
    
    //!!!!!! List
    @FindBy(xpath = "//li[@class='search__result']")
    private ExtendedWebElement firstFoundItemLink;
  
    public FastSearch(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeInFastSearchField(String queryArg) {
        fastSearchFieldLink.click();
        fastSearchFieldLink.type(queryArg);
    }
    
    public void clickOnUsedGoodsButton() {
    	usedGoodsButtonLink.click();
    }
    
    public void getFirstFoundUsedItem(String queryArg) {
        fastSearchFieldLink.click();
        fastSearchFieldLink.type(queryArg);
        driver.switchTo().frame(usedGoodsButtonLink2);
        usedGoodsButtonLink2.click();
        firstFoundItemLink.click();
    }

}

