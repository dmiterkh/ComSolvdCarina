package com.qaprosoft.carina.demo.gui.components.onliner;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.onliner.AutomobilePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.RealEstatePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.ShoppingCartPageOnliner;


public class TopHeaderBar extends AbstractUIObject {
	
//	OnlinerLoginTest (testcases 001, 002, 003, 007)
	@FindBy(xpath ="//body[@class='no-touch']//div//div//div//div//header[@class='g-top']//div[@class='b-top-actions']//div[@class='g-top-i']//div//div//div//div//div//div[contains(@class,'auth-bar__item--text')]")
	private ExtendedWebElement authLink;
	
	
//	OnlinerFastSearchTest (testcases 009, 010)
	@FindBy(xpath = "//input[@class='fast-search__input']")
	private ExtendedWebElement fastSearchFieldLink;

    @FindBy(xpath = "//html//body//div//div//div//div//div//div[text()='на барахолке']")
    private ExtendedWebElement usedGoodsButtonLink;
    
    @FindBy(xpath = "//html//body//div//div//div//div//div//div[text()='на барахолке']")
    private WebElement usedGoodsButtonLink2;
    
    @FindBy(xpath = "//li[@class='search__result']")
    private List<ExtendedWebElement> foundItemListLink;
    
     
//	OnlinerSectionsBarTest (testcases 011, 012, 013, 014)
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/']")
    private ExtendedWebElement catalogLink;

    @FindBy(xpath = "//li[contains(@class,'b-main-navigation__item')]//a[contains(@href,'https://ab.onliner.by') and contains(@class, 'b-main-navigation__link')]")
    private ExtendedWebElement automobileLink;
        
    @FindBy(xpath = "//a[@href='https://r.onliner.by/pk']")
    private ExtendedWebElement realEstateLink;
    
    
//	OnlinerShoppingCartTest (testcase 019)
    @FindBy(xpath = "//div[@id='cart-desktop']//a[@href='https://cart.onliner.by']")
    private ExtendedWebElement shoppingCartLink; 

    
    public TopHeaderBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    
    
//	OnlinerLoginTest (testcases 001, 002, 003, 007)
    public ExtendedWebElement getAuthLink() {
        return authLink;
    }

    public LoginPageOnliner clickOnAuthLink() {
        authLink.click();
        return new LoginPageOnliner(driver);
    }
    
    
//	OnlinerFastSearchTest (testcases 009, 010)
    public void typeInFastSearchField(String queryArg) {
        fastSearchFieldLink.click();
        fastSearchFieldLink.type(queryArg);
    }
    
    
//  OnlinerAllTestsWithLogin
    
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
    
    @FindBy(xpath = "//div//div//a[contains(@class,'b-top-profile__link') and contains(text(),'Выйти')]")
    private ExtendedWebElement popupProfileExitLink;
    
    
    public ExtendedWebElement getFastSearchFieldLink() {
        return fastSearchFieldLink;
    }
    
    public void clickOnUsedGoodsButton() {
    	usedGoodsButtonLink.click();
    }
    
    public void getFirstFoundUsedItem(String queryArg) {
        fastSearchFieldLink.click();
        fastSearchFieldLink.type(queryArg);

        WebElement element;
    	element = getDriver().switchTo().frame(0).findElement(By.xpath("//html//body//div//div//div//div//div//div[text()='на барахолке']"));
    	element.click();
    	fastSearchFieldLink.pause(5.0);
    }
    
    
//	OnlinerSectionsBarTest (testcases 011, 012, 013, 014)
    public CatalogPageOnliner openCatalogPageOnliner() {
    	catalogLink.scrollTo();
        catalogLink.click();
        return new CatalogPageOnliner(driver);
    }
    
    public AutomobilePageOnliner openAutomobilePageOnliner() {
    	automobileLink.scrollTo();
    	automobileLink.click();
        return new AutomobilePageOnliner(driver);
    }
    
    public RealEstatePageOnliner openRealEstatePageOnliner() {
    	realEstateLink.scrollTo();
    	realEstateLink.click();
        return new RealEstatePageOnliner(driver);
    }

    
//	OnlinerShoppingCartTest (testcase 019)
    public ShoppingCartPageOnliner clickOnShoppingCartLink() {
    	shoppingCartLink.scrollTo();
    	shoppingCartLink.click();
        return new ShoppingCartPageOnliner(driver);
    }
    

//  OnlinerAllTestsWithLogin
    public HomePageOnliner openHomePageOnliner() {
        popupProfileExitLink.click();
        pause(5);
        homeLink.click();
        return new HomePageOnliner(driver);
    }
    
}