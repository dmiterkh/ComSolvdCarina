package com.qaprosoft.carina.demo.onliner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.onliner.CatalogPageOnliner;
import com.qaprosoft.carina.demo.gui.pages.onliner.HomePageOnliner;

/**
 * @author Dmitry Kharevich
 */

public class OnlinerDataProviderUsingFormatTest extends ParentBaseTestNotLoginTests implements IAbstractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(OnlinerDataProviderUsingFormatTest.class);
	
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
        
	}
    
	
	
	
    @Test(dataProvider = "DP1")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testCategoriesUsingDataProviderAndFormat(String a, String b, String c) {
        
    	CatalogPageOnliner catalogPageOnliner = homePageOnliner.openCatalogPageOnliner();
    	catalogPageOnliner.getCategoryAndSubCategoryPageOnliner(a, b, c);

    } 
    
    @DataProvider(parallel = false, name = "DP1")
    public static Object[][] dataprovider1()
    {
        return new Object[][] {
            { "Компьютеры и", "Ноутбуки, компьютеры, мониторы", "notebook" },
            { "Бытовая техника", "Приготовление пищи", "microvawe" },
            { "Стройка и", "Оснастка для", "saw_blades" },
            { "Дом и", "Уход за одеждой", "linendryer"}
        };
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