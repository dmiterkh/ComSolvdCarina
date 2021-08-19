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
import com.qaprosoft.carina.demo.gui.pages.Onliner.AuthorizedPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.ItemPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.LaptopPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.Onliner.ShoppingCartPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerShoppingCartTest implements IAbstractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
       
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase019 Verify that the user Gets correct work of Shopping Cart in Catalog section
    public void testUserGetsCorrectWorkOfShoppingCartInCatalog() {
        
    	// Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
                
        // Open Authorization page
        LoginPageOnliner loginPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink();
        
        // Type in Login field
        loginPageOnliner.typeInLoginField("dmiterkh@mail.ru");
        
        // Type in Password field
        loginPageOnliner.typeInPasswordField("111111");
        
        // Password checking
        loginPageOnliner.clickOnAuthHelperButton();
        
        // Click on Auth button
        AuthorizedPageOnliner authorizedPageOnliner = loginPageOnliner.clickOnAuthButton();

        // Click on (Enter to) Shopping Cart
        ShoppingCartPageOnliner shoppingCartPageOnliner = authorizedPageOnliner.getTopHeaderBar().clickOnShoppingCartLink();        
        
        // Return to Home page
        authorizedPageOnliner = shoppingCartPageOnliner.clickOnAutorizedPageLink();
       
        // Open Catalog page
        CatalogPageOnliner catalogPageOnliner = authorizedPageOnliner.getTopHeaderBar().openCatalogPageOnliner();
      
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
        
        // Type in Number of Item window
        shoppingCartPageOnliner.typeInNumberOfItemWindowLink();
        
        // Add one item
        shoppingCartPageOnliner.clickOnIncrementButtonLink();
      
        // Subtract one item
        shoppingCartPageOnliner.clickOnDecrementButtonLink();
      
        // Remove item
        shoppingCartPageOnliner.clickOnRemoveButtonLink();
        shoppingCartPageOnliner.pause(5);
        
        // Return to Home page
        authorizedPageOnliner = shoppingCartPageOnliner.clickOnAutorizedPageLink();
        authorizedPageOnliner.pause(10);
        
        getDriver().close();
        
    }
    
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase019 short description
    public void testtestUserGetsCorrectWorkOfShoppingCartInCatalogShort() {
        
        // Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Enter to personal account
        AuthorizedPageOnliner authorizedPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink().getAuthorizedPageOnliner("dmiterkh@mail.ru", "111111");

        // Get Item (List of items)
        ItemPageOnliner itemPageOnliner = authorizedPageOnliner.getTopHeaderBar().openCatalogPageOnliner().getLaptopPageOnliner().getItemPageOnliner("1000");
        
        // Add to Shopping cart
        itemPageOnliner.addToShoppingCart();
        
        // Go to Shopping cart
        ShoppingCartPageOnliner shoppingCartPageOnliner = itemPageOnliner.clickOnShoppingCartLink();
        
        // Do Shopping cart operations
        authorizedPageOnliner = shoppingCartPageOnliner.showShoppingCartOperations();
        authorizedPageOnliner.pause(10);
        
        getDriver().close();
        
    }

}    