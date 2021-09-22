package com.qaprosoft.carina.demo.gui.pages.onliner;

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
    
    public VacanciesPageOnliner openVacanciesPageOnliner() {
    	return getFooterMenu().openVacanciesPageOnliner();
    }
    
    public ContactsPageOnliner openContactsPageOnliner() {
    	return getFooterMenu().openContactsPageOnliner();
    }
    
    public TopHeaderBar getTopHeaderBar() {
        return topHeaderBarLink;
    }
    
    public LoginPageOnliner openLoginPageOnliner() {
        getTopHeaderBar().getAuthLink().click();
        return new LoginPageOnliner(driver);
    }
    
    public RealEstatePageOnliner openRealEstatePageOnliner() {
        getTopHeaderBar().getRealEstatePageLink().click();
        return new RealEstatePageOnliner(driver);
    }
    
    public CatalogPageOnliner openCatalogPageOnliner() {
    	getTopHeaderBar().getCatalogPageLink().click();
        return new CatalogPageOnliner(driver);
    }
    
    public AutomobilePageOnliner openAutomobilePageOnliner() {
    	getTopHeaderBar().getAutomobilePageLink().click();
        return new AutomobilePageOnliner(driver);
    }
    
    public boolean isAuthLinkElementPresent() {
        return getTopHeaderBar().getAuthLink().isElementPresent();
    }

    public void refreshPageIfAuthLinkIsNotPresent() {
    	int k=20;
    	LOGGER.info(String.valueOf(k));
        while(!(isAuthLinkElementPresent()) && k>0){
        	LOGGER.info(Integer.toString(k));
        	getDriver().manage().deleteAllCookies();
        	refresh();
        	//getDriver().get(getDriver().getCurrentUrl());
        	k--;
        }
    }

    
    public AuthorizedPageOnliner openAuthorizedPageOnliner(String loginArg, String passwordArg) {
    	getTopHeaderBar().getAuthLink().click();
        return new AuthorizedPageOnliner(driver);
    }
    
    public LoginPageOnliner openNotAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
    	return getTopHeaderBar().clickOnAuthLink().getNotAuthorizedLoginPageOnliner(loginArg, passwordArg);
    }
    
    public AuthorizedPageOnliner openAuthorizedLoginPageOnliner(String loginArg, String passwordArg) {
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
    	if (videoPageLink.isPresent()) {
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
		    	return new VideoPageOnliner(driver);
	    	}
    	} else {
    		LOGGER.info("Required Element is not found on the Home Page");
    	}	
    	return new VideoPageOnliner(driver);	    	
    }
    	
    public VideoPageOnliner openVideoPageOnlinerForEach() {
    	if (videoPageLink.isPresent()) {
    		int k=0;
	    	if ((getVideoPageListLink() != null)&&(!getVideoPageListLink().isEmpty())) {
				for (ExtendedWebElement videoPageLinkFromList : getVideoPageListLink()) {
			  		while(k < 1) {
			  			if(openVideoPageOnliner(videoPageLinkFromList).checkYoutubeVideoLink()) {
			  				k++;
			  			} 
			  		}
				}
	    	}
    	} else {
    		LOGGER.info("Required Element is not found on the Home Page");
    	}	
		return new VideoPageOnliner(driver);    	    	
    }
    
    public void scrollToBottom() {
    	vacanciesLink.scrollTo();
    }
    
    public void scrollToTop() {
    	homeLink.scrollTo();
    }  
    
    public boolean isTopHeaderBarPresent() {
    	return getTopHeaderBar().isUIObjectPresent();  			
    }  
    
    public boolean isVideoPageLinkPresent() {
    	return videoPageLink.isElementPresent();  			
    }  

}