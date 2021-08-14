package com.qaprosoft.carina.demo.gui.components.zonliner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
//import com.qaprosoft.carina.demo.gui.pages.CompareModelsPage;
//import com.qaprosoft.carina.demo.gui.pages.HomePage;
//import com.qaprosoft.carina.demo.gui.pages.NewsPage;

public class VideoElement extends AbstractUIObject {
    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//div[@class='footer-inner']//a[contains(text(),'Compare')]")
    private ExtendedWebElement compareLink;
    
    @FindBy(linkText = "News")
    private ExtendedWebElement newsLink;

    public VideoElement(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

//    public HomePage openHomePage() {
//        homeLink.click();
//        return new HomePage(driver);
//    }
//
//    public CompareModelsPage openComparePage() {
//        compareLink.click();
//        return new CompareModelsPage(driver);
//    }
//    
//    public NewsPage openNewsPage() {
//        newsLink.click();
//        return new NewsPage(driver);
//    }
}
