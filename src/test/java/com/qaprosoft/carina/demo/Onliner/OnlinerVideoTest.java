package com.qaprosoft.carina.demo.Onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.VacanciesPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.VideoPageOnliner;


/**
 * @author Dmitry Kharevich
 */

public class OnlinerVideoTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase017 Verify that the user Gets correct work of youtube video in any article with youtube video
    public void testUserGetsCorrectWorkOfYoutubeVideo() {
    	
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Open Video page 
        VideoPageOnliner videoPageOnliner = homePageOnliner.openVideoPageOnliner(homePageOnliner.getVideoPageLink());
//        Assert.assertTrue(videoPageOnliner.isPageOpened(), "Video page is not opened");
        
        videoPageOnliner.showVideoPageOperations();          
        
        
//        while (!(videoPageOnliner.getHomePageLink().isElementPresent())){
//        	videoPageOnliner.refresh(); 
//        	videoPageOnliner.pause(5.0);
//        };
//    	videoPageOnliner.returnToHomePage();

        
//        int k = 0;
//        VideoPageOnliner videoPageOnliner2 = new VideoPageOnliner(getDriver());
//        if ((homePageOnliner.getVideoPageListLink() != null)&&(!homePageOnliner.getVideoPageListLink().isEmpty())) {
//        	int j = homePageOnliner.getVideoPageListLink().size();
//        	for (int i=0; i < j; i++) {
//        		while(k < 1) {
//        			videoPageOnliner2 = homePageOnliner.openVideoPageOnliner(homePageOnliner.getVideoPageListLink().get(i));
//       		
//        			if(videoPageOnliner2.checkYoutubeVideoLink()) {
//        				System.out.println("Ok");
//        				k++;
//        				System.out.println("k = " + k);
//        			} else {
//        			}
//        			videoPageOnliner2.returnToHomePage();
//        		}
//        	}	
//      	System.out.println(k);
//        } else {
//			System.out.println("The required List of Extended Web Elements is Null or Empty");	
//        }
        

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
//        			} else {
//        			}
//        			videoPageOnliner3.returnToHomePage();
//        		}	
//        	}	
//        	System.out.println(k);
//    	} else {
//    		System.out.println("The required List of Extended Web Elements is Null or Empty");	
//    	}
          
        getDriver().close();
        
    }
}