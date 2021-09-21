package com.qaprosoft.carina.demo.onliner;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
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
	
	private HomePageOnliner homePageOnliner;
	
	@BeforeSuite
    public void beforeSuiteShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-BeforeSuite-Child");
    }

	@BeforeTest
	public void beforeTestShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-BeforeTest-Child");
	}

	@BeforeClass
	public void beforeClassShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-BeforeClass-Child");
	}

	@BeforeMethod
	public void beforeMethodShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-BeforeMethod-Child");
		
        // Open Home page
        homePageOnliner = new HomePageOnliner(getDriver());
        homePageOnliner.open();
        Assert.assertTrue(homePageOnliner.isPageOpened(), "Home page is not opened");
        
        // Authorization Link is present
        homePageOnliner.refreshPageIfAuthLinkIsNotPresent();
        Assert.assertTrue(homePageOnliner.isAuthLinkElementPresent(), "Element has not been found after 20 attempts");

	}

    @Test()
    @MethodOwner(owner = "dkharevich")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = {"web", "regression"})
    
 	//testcase019 Verify that the user Gets correct work of Shopping Cart in Catalog section
    public void testUserGetsCorrectWorkOfShoppingCartInCatalogShort() {
        
        // Enter to personal account
        AuthorizedPageOnliner authorizedPageOnliner = homePageOnliner.openAuthorizedPageOnliner("dmiterkh@mail.ru", "3909091");

        // Get Item (List of items)
        ItemPageOnliner itemPageOnliner = authorizedPageOnliner.openFirstItemPageOnliner("1000");
        itemPageOnliner.addToShoppingCart();
        
        // Go to Shopping cart
        ShoppingCartPageOnliner shoppingCartPageOnliner = itemPageOnliner.openShoppingCartPageOnliner();
        shoppingCartPageOnliner.showShoppingCartOperations();
        pause(1);
        
        authorizedPageOnliner = shoppingCartPageOnliner.openAutorizedPageOnliner()
            
    }
    
    
    
	@AfterMethod
	public void afterMethodShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-AfterMethod-Child");
	}
	
	@AfterClass
	public void afterClassShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-AfterClass-Child");
	}

	@AfterTest
	public void afterTestShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-AfterTest-Child");
	}

	@AfterSuite
    public void afterSuiteShoppingCartTestChild() {
		LOGGER.info("@ShoppingCartTest-AfterSuite-Child");
    }



}    