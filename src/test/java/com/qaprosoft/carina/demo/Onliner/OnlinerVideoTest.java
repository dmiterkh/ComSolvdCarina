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
    //testcase017 
    public void testVideo017() {
    	
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
//        // Open Video page 
//        VideoPageOnliner videoPageOnliner = homePageOnliner.openVideoPageOnliner();
//        Assert.assertTrue(videoPageOnliner.isPageOpened(), "Home page is not opened");
//        videoPageOnliner.showVideoPageOperations();              

//        int i = 0;
//        VideoPageOnliner videoPageOnliner = new VideoPageOnliner(getDriver());
//        while (i < 1) {
//        	for (ExtendedWebElement videoPageLink : homePageOnliner.getVideoPageListLink()) {
//        		videoPageOnliner = homePageOnliner.openVideoPageOnliner(videoPageLink);
//        		if(videoPageOnliner.checkYoutubeVideoLink()) {
//        			Assert.assertTrue(videoPageOnliner.getYoutubeVideoLink().isElementPresent(), "Youtube Frame on the page is not present");
//            		videoPageOnliner.showVideoPageOperations();
//            		Assert.assertTrue(videoPageOnliner.getYoutubeVideoLink().isChecked(), "Youtube Frame is not checked");
//        			i++;
//        		} else {
//        			Assert.assertFalse(videoPageOnliner.getYoutubeVideoLink().isElementPresent(), "Youtube Frame on the page is present");
//            		Assert.assertFalse(videoPageOnliner.getYoutubeVideoLink().isChecked(), "Youtube Frame is checked");
//            		homePageOnliner.open();
//        		}
//        	}
//        }	
//        System.out.println(i);
        	
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
//        } else {
//			System.out.println("The required Storage is Null or Empty");	
//        }
        

        int i = 0;
        VideoPageOnliner videoPageOnliner3 = new VideoPageOnliner(getDriver());
     	for (ExtendedWebElement videoPageLink : homePageOnliner.getVideoPageListLink()) {
     		while(i < 1) {
     			videoPageOnliner3 = homePageOnliner.openVideoPageOnliner(videoPageLink);
     			if(videoPageOnliner3.checkYoutubeVideoLink()) {
     				System.out.println("Ok");
     				i++;
     				System.out.println("i = " + i);
     			} else {
     			}
     			videoPageOnliner3.returnToHomePage();
     		}	
      	}
      	System.out.println(i);
    }
}