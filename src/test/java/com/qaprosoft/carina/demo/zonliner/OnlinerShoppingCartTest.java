package com.qaprosoft.carina.demo.zonliner;

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
import com.qaprosoft.carina.demo.gui.pages.zonliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.ItemPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.AuthorizedHomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.ShoppingCartPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.zonliner.LaptopPageOnliner;



/**
 * @author Dmitry Kharevich
 */

public class OnlinerShoppingCartTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestPriority(Priority.P3)
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void testShopCart1() {
//        
//    	  // Open Onliner home page and verify page is opened
//        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
//        homePageOnliner.open();
//        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
//	
//		homePageOnliner.scrollToBottom();
//		homePageOnliner.pause(5);
//		
//		homePageOnliner.scrollToTop();
//		homePageOnliner.pause(5);	
//               
//    }    
 
        
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testShopCart2() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getAuthBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("dmiterkh@mail.ru");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("111111");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        
        // Click on Auth button
        AuthorizedHomePageOnliner authorizedHomePageOnliner = loginPageOnliner.clickOnAuthButton();
        
        // Additional methods
        authorizedHomePageOnliner.scrollToBottom();
        authorizedHomePageOnliner.pause(5);		
        authorizedHomePageOnliner.scrollToTop();
        authorizedHomePageOnliner.pause(5);

        // Click on (Enter to) Shopping Cart
        ShoppingCartPageOnliner shoppingCartPageOnliner = authorizedHomePageOnliner.clickOnShoppingCartLink();        
        
        // Return to Home page
        authorizedHomePageOnliner = shoppingCartPageOnliner.clickOnAutorizedHomePageLink();
        
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = authorizedHomePageOnliner.getSectionsBar().openCatalogPageOnliner();
      
        // Open Computer techics subsection
        catalogPageOnliner.clickOnComputerTechnicsLink();
      
        // Open Computers subsection
        catalogPageOnliner.clickOnComputersLink();
             
        // Open Laptop subsection
        LaptopPageOnliner laptopPageOnliner = catalogPageOnliner.openLaptopPageOnliner();
      
        // Choose producer
        laptopPageOnliner.clickOnProducerCheckboxLink();
      
        // Set value of upper bound price field
        laptopPageOnliner.typeInUpperBoundPriceField("1000"); 
        
        // Choose item
        ItemPageOnliner itemPageOnliner = laptopPageOnliner.openItemPageOnliner();
        
        // Add to Shopping cart
        itemPageOnliner.addToShoppingCart();
        
        // Go to Shopping cart
        shoppingCartPageOnliner = itemPageOnliner.clickOnShoppingCartLink();
        shoppingCartPageOnliner.open();      
        
        // Add one item
        shoppingCartPageOnliner.clickOnIncrementButtonLink();
      
        // Subtract one item
        shoppingCartPageOnliner.clickOnDecrementButtonLink();
      
        // Remove item
        shoppingCartPageOnliner.clickOnRemoveButtonLink();
        
        // Return to Home page
        authorizedHomePageOnliner = shoppingCartPageOnliner.clickOnAutorizedHomePageLink();
  
        // Additional Method
        authorizedHomePageOnliner.pause(5);
    }

}
