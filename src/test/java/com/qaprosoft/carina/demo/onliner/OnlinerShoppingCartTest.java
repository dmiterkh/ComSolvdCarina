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
import com.qaprosoft.carina.demo.gui.pages.onliner.AuthorizedPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.ItemPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LaptopPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.LoginPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.ShoppingCartPageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerShoppingCartTest extends ParentBaseTestNotLoginTests implements IAbstractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerShoppingCartTest.class);
	
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
        loginPageOnliner.typeInPasswordField("3909091");
        
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

        
    }
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
    //testcase019 short description
    public void testUserGetsCorrectWorkOfShoppingCartInCatalogShort() {
        
        // Open Home page
        HomePageOnliner homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Enter to personal account
        AuthorizedPageOnliner authorizedPageOnliner = homePageOnliner.getTopHeaderBar().clickOnAuthLink().getAuthorizedPageOnliner("dmiterkh@mail.ru", "3909091");

        // Get Item (List of items)
        ItemPageOnliner itemPageOnliner = authorizedPageOnliner.getTopHeaderBar().openCatalogPageOnliner().getLaptopPageOnliner().getItemPageOnliner("1000");
        
        // Add to Shopping cart
        itemPageOnliner.addToShoppingCart();
        
        // Go to Shopping cart
        ShoppingCartPageOnliner shoppingCartPageOnliner = itemPageOnliner.clickOnShoppingCartLink();
        
        // Do Shopping cart operations
        authorizedPageOnliner = shoppingCartPageOnliner.showShoppingCartOperations();
        authorizedPageOnliner.pause(10);
        
        
    }

}    