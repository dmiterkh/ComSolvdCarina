package com.qaprosoft.carina.demo.gui.pages.onliner;

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
import com.qaprosoft.carina.demo.gui.components.onliner.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.onliner.TopHeaderBar;

public class HomePageOnliner extends AbstractPage {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageOnliner.class);

    @FindBy(xpath = "//img[@class='onliner_logo']")
    private ExtendedWebElement homeLink;
    
    @FindBy(xpath = "//footer[@class='g-bottom']")
    private FooterMenu footerLink; 
    
    @FindBy(xpath = "//a[@href='https://blog.onliner.by/vacancy']")
    private ExtendedWebElement vacanciesLink;
    
    @FindBy(xpath = "//header[@class='g-top']")
    private TopHeaderBar topHeaderBarLink;
    
    private boolean authLinkPresent = false;   		
    
    @FindBy(xpath = "//i[@class='b-icon-3']//parent::span[@class='complementary-item video']//parent::span[@class='complementary-group']//parent::div//parent::figure//a")
    private List<ExtendedWebElement> videoPageListLink;
    
    @FindBy(xpath = "//i[@class='b-icon-3']//parent::span[@class='complementary-item video']//parent::span[@class='complementary-group']//parent::div//parent::figure//a")
    private ExtendedWebElement videoPageLink;
    
    
    
    public HomePageOnliner(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    
    
    public FooterMenu getFooterMenu() {
        return footerLink;
    }
    
    public VacanciesPageOnliner openVacanciesPageOnlinerThroughFooter() {
    	return getFooterMenu().openVacanciesPageOnliner();
    }
    
    public ContactsPageOnliner openContactsPageOnlinerThroughFooter() {
    	return getFooterMenu().openContactsPageOnliner();
    }
    
    public TopHeaderBar getTopHeaderBar() {
        return topHeaderBarLink;
    }
    
    public LoginPageOnliner clickOnAuthLinkThroughTopHeader() {
        getTopHeaderBar().getAuthLink().click();
        return new LoginPageOnliner(driver);
    }
    
    public boolean isAuthLinkElementPresent() {
        return getTopHeaderBar().getAuthLink().isElementPresent();
    }

    public void refreshPageIfAuthLinkIsNotPresent() {
    	int k=20;
    	LOGGER.trace(String.valueOf(k));
        while(!(isAuthLinkElementPresent()) && k>0){
        	LOGGER.trace(String.valueOf(k));
        	refresh(); 
        	k--;
        };
        if (getTopHeaderBar().getAuthLink().isElementPresent()) {
        	authLinkPresent = true; 
        }
    }

    public boolean returnAuthLinkPresent() {
    	return authLinkPresent;	
    }
    
    public AuthorizedPageOnliner getAuthorizedPageOnliner(String loginArg, String passwordArg) {
    	getTopHeaderBar().getAuthLink().click();
    	
        return new AuthorizedPageOnliner(driver);
    }
    
    public LoginPageOnliner getNotAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
    	return getTopHeaderBar().clickOnAuthLink().getNotAuthorizedLoginPageOnliner(loginArg, passwordArg);
    }
    
    public AuthorizedPageOnliner getAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
    	return getTopHeaderBar().clickOnAuthLink().getAuthorizedPageOnliner(loginArg, passwordArg);
    }
    
    public List<ExtendedWebElement> getVideoPageListLink() {
        return videoPageListLink;
    }
    
    public VideoPageOnliner openVideoPageOnliner(ExtendedWebElement videoPageLinkArg) {
        videoPageLinkArg.click();
        return new VideoPageOnliner(driver);
    }
    

    
    public VideoPageOnliner openVideoPageOnlinerUsualFor() {
    	int k=0;
    	if ((getVideoPageListLink() != null)&&(!getVideoPageListLink().isEmpty())) {
			int j = getVideoPageListLink().size();
			for (int i=0; i < j; i++) {
		  		while(k < 1) {
		  			if(openVideoPageOnliner(getVideoPageListLink().get(i)).checkYoutubeVideoLink()) {
		  			k++;
		  			} 
		  		}
			}
    	}	
		return new VideoPageOnliner(driver);    	    	
    }
    

//  int k = 0;
//  VideoPageOnliner videoPageOnliner3 = new VideoPageOnliner(getDriver());
//  if ((homePageOnliner.getVideoPageListLink() != null)&&(!homePageOnliner.getVideoPageListLink().isEmpty())) {
//  	for (ExtendedWebElement videoPageLink : homePageOnliner.getVideoPageListLink()) {
//  		while(k < 1) {
//  			videoPageOnliner3 = homePageOnliner.openVideoPageOnliner(videoPageLink);
//  			if(videoPageOnliner3.checkYoutubeVideoLink()) {
//  				System.out.println("Ok");
//  				k++;
//  				System.out.println("k = " + k);
//  			} 
//  			videoPageOnliner3.returnToHomePage();
//  		}	
//  	}	
//  	System.out.println(k);
//	} else {
//		System.out.println("The required List of Extended Web Elements is Null or Empty");	
//	}
    
    
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    public void scrollToTop() {
    	homeLink.scrollTo();
    }  
    
}