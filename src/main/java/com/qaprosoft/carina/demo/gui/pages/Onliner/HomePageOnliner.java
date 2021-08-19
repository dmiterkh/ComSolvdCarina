package com.qaprosoft.carina.demo.gui.pages.Onliner;

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

import com.qaprosoft.carina.demo.gui.components.Onliner.TopHeaderBar;
import com.qaprosoft.carina.demo.gui.components.Onliner.FooterMenu;

public class HomePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageOnliner.class);

//	OnlinerLoginTest (testcases 001, 002, 003, 007)  
//	OnlinerFastSearchTest (testcases 009, 010)
//	OnlinerSectionsBarTest (testcases 011, 012, 013, 014)
//	OnlinerShoppingCartTest (testcase 019)
    
    @FindBy(xpath = "//header[@class='g-top']")
    private TopHeaderBar topHeaderBar;    		
    
    
//	OnlinerVideoTest (testcase 017)  
//	Subsections test (testcase 015) ???   
    
    @FindBy(xpath = "//i[@class='b-icon-3']//parent::span[@class='complementary-item video']//parent::span[@class='complementary-group']//parent::div//parent::figure//a")
    private List<ExtendedWebElement> videoPageListLink;
    
    @FindBy(xpath = "//i[@class='b-icon-3']//parent::span[@class='complementary-item video']//parent::span[@class='complementary-group']//parent::div//parent::figure//a")
    private ExtendedWebElement videoPageLink;
      
    
//	OnlinerFooterTest (testcase 018)   
    @FindBy(xpath = "//footer[@class='g-bottom']")
    private FooterMenu footerLink;
    
    
    // Additional link
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
    
    // Additional link
    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
    
    
    
    public HomePageOnliner(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    
    
//	Tests (testcases 001, 002, 003, 007, 009, 010, 011, 012, 013, 014, 019)  
    
    public TopHeaderBar getTopHeaderBar() {
        return topHeaderBar;
    }
    
//	OnlinerFooterTest (testcase 018)    
    
    public FooterMenu getFooterMenu() {
        return footerLink;
    }
    
//	OnlinerVideoTest (testcase 017)  

    public List<ExtendedWebElement> getVideoPageListLink() {
        return videoPageListLink;
    }
    
    public ExtendedWebElement getVideoPageLink() {
        return videoPageLink;
    }
    
    public VideoPageOnliner openVideoPageOnliner(ExtendedWebElement videoPageLinkArg) {
        videoPageLinkArg.click();
        return new VideoPageOnliner(driver);
    }
    
    public VideoPageOnliner openVideoPageOnliner() {
    	videoPageLink.click();
    	return new VideoPageOnliner(driver);
    }
    
    // Additional method
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    // Additional method
    public void scrollToTop() {
    	homeLink.scrollTo();
    }
    
    
}