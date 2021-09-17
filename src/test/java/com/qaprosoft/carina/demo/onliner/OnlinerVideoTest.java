package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VacanciesPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.VideoPageOnliner;


/**
 * @author Dmitry Kharevich
 */

public class OnlinerVideoTest extends ParentBaseTestNotLoginTests implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerVideoTest.class);
	
	@BeforeSuite
    public void beforeSuiteLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeSuite-Child");
		LOGGER.info("!!!");
    }

	@BeforeTest
	public void beforeTestLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeTest-Child");
		LOGGER.info("!!!");
	}

	@BeforeClass
	public void beforeClassLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeClass-Child");
		LOGGER.info("!!!");        
	}

	@BeforeMethod
	public void beforeMethodLoginChild() {
		LOGGER.info("!!!");
		LOGGER.info("@@@_LoginTest-BeforeMethod-Child");
		LOGGER.info("!!!");
	}
	
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase017 Verify that the user Gets correct work of youtube video in any article with youtube video
    public void testUserGetsCorrectWorkOfYoutubeVideo() {
    	
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Open Video page 

         
		
        
		int k = 0;
		VideoPageOnliner videoPageOnliner2;
		if ((homePageOnliner.getVideoPageListLink() != null)&&(!homePageOnliner.getVideoPageListLink().isEmpty())) {
			int j = homePageOnliner.getVideoPageListLink().size();
			for (int i=0; i < j; i++) {
		  		while(k < 1) {
		  			videoPageOnliner2 = homePageOnliner.openVideoPageOnliner(homePageOnliner.getVideoPageListLink().get(i));
		  			if(videoPageOnliner2.checkYoutubeVideoLink()) {
		  				videoPageOnliner2.showVideoPageOperations(); 
		  				k++;
		  			} 
		  		    while (!(videoPageOnliner2.getHomePageLink().isElementPresent())){
		  		    	videoPageOnliner2.refresh(); 
		  		    	videoPageOnliner2.pause(5.0);
		  		    };
		  			videoPageOnliner2.returnToHomePage();
		  		}
		  	}	
			System.out.println(k);
		} else {
			System.out.println("The required List of Extended Web Elements is Null or Empty");	
		}

        


        

        

//        int k = 0;
//        VideoPageOnliner videoPageOnliner3 = new VideoPageOnliner(getDriver());
//        if ((homePageOnliner.getVideoPageListLink() != null)&&(!homePageOnliner.getVideoPageListLink().isEmpty())) {
//        	for (ExtendedWebElement videoPageLink : homePageOnliner.getVideoPageListLink()) {
//        		while(k < 1) {
//        			videoPageOnliner3 = homePageOnliner.openVideoPageOnliner(videoPageLink);
//        			if(videoPageOnliner3.checkYoutubeVideoLink()) {
//        				System.out.println("Ok");
//        				k++;
//        				System.out.println("k = " + k);
//        			} 
//        			videoPageOnliner3.returnToHomePage();
//        		}	
//        	}	
//        	System.out.println(k);
//    	} else {
//    		System.out.println("The required List of Extended Web Elements is Null or Empty");	
//    	}
          
        
    }
}