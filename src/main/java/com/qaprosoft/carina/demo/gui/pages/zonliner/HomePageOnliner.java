package com.qaprosoft.carina.demo.gui.pages.zonliner;

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
import com.qaprosoft.carina.demo.gui.components.zonliner.AuthBar;
import com.qaprosoft.carina.demo.gui.components.zonliner.FastSearch;
import com.qaprosoft.carina.demo.gui.components.zonliner.SectionsBar;
import com.qaprosoft.carina.demo.gui.components.zonliner.MiddleMenu;
import com.qaprosoft.carina.demo.gui.components.zonliner.VideoElement;
import com.qaprosoft.carina.demo.gui.components.zonliner.FooterMenu;

public class HomePageOnliner extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
//	Login/Password tests 001, 002, 003, 007   
    @FindBy(xpath = "//div[@class='auth-bar auth-bar--top']//div//child::div[@class='auth-bar auth-bar--top']")
    private AuthBar authBarLink;
    
//	Fast Search tests 009, 010 
    @FindBy(xpath = "//input[@class='fast-search__input']")
    private FastSearch fastSearchLink;
    
//	Sections Bar, Search Filters, Shopping Cart tests 011, 012, 013, 014, 019   
    @FindBy(xpath = "//ul[@class='b-main-navigation']")
    private SectionsBar sectionsBarLink; 
     
//	Subsections tests 015   
    @FindBy(xpath = "//div[@class='g-middle-i']")
    private MiddleMenu middleMenuLink;  
    
//	Video tests 017    
    @FindBy(xpath = "//i[@class='b-icon-3']//parent::span[@class='complementary-item video']//parent::span[@class='complementary-group']//parent::div//parent::figure//a")
    private List<VideoElement> videoList;
      
//	Footer links tests 018   
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

    public AuthBar getAuthBar() {
        return authBarLink;
    }
    
    public FastSearch getFastSearch() {
        return fastSearchLink;
    }
    
    public SectionsBar getSectionsBar() {
        return sectionsBarLink;
    }
    
    public MiddleMenu getMiddleMenu() {
        return middleMenuLink;
    }
    
    public List<VideoElement> getVideoElement() {
        return videoList;
    }
    
    public FooterMenu getFooterMenu() {
        return footerLink;
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
