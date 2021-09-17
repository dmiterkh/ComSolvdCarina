package com.qaprosoft.carina.demo.dataprovider;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qaprosoft.carina.demo.onliner.OnlinerAllTestsWithLoginParentAnnotation;

public class TUIDJavaDataProviderTest extends ParentDataProviderBaseTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TUIDJavaDataProviderTest.class);

  
    
    /**
     * Paramatrization using TestNG dataproviders:
     * <p>
     * 1. Create data-provider method that returns Object[][] and set DataProvider annotation. 2. Specify data-provider
     * name in @Test annotation.
     *
     * @param TUID String
     *
     * @param testRailColumn String
     *
     * @param a int
     *
     * @param b int
     *
     * @param c int
     */
    @Test(dataProvider = "DP1")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    @TestRailCases(testCasesId = "55")
    public void testAddOperation(String TUID, String testRailColumn, int a, int b, int c) {
        int actual = Integer.valueOf(a) + Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid addition result!");
    } 
    
    @DataProvider(parallel = false, name = "DP1")
    public static Object[][] dataprovider1()
    {
        return new Object[][] {
        	{"TUID: Data1", "111,112", 2, 3, 5 },
        	{"TUID: Data2", "114", 14, 6, 20 },
        	{"TUID: Data3", "113", 15, 8, 23 } 
        };
    }

    @Test(dataProvider = "DP2")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    @TestRailCases(testCasesId = "55")
    public void testSubtractOperation(String TUID, String testRailColumn, int a, int b, int c) {
        int actual = Integer.valueOf(a) - Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid subtraction result!");
    } 
    
    @DataProvider(parallel = false, name = "DP2")
    public static Object[][] dataprovider2()
    {
        return new Object[][] {
        	{"TUID: Data1", "111,112", 12, 3, 9 },
        	{"TUID: Data2", "114", 14, 6, 8 },
        	{"TUID: Data3", "113", 15, 8, 7 } 
        };
    }

    @Test(dataProvider = "DP3")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    @TestRailCases(testCasesId = "55")
    public void testMultiplyOperation(String TUID, String testRailColumn, int a, int b, int c) {
        int actual = Integer.valueOf(a) * Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid multiplication result!");
    } 
    
    @DataProvider(parallel = false, name = "DP3")
    public static Object[][] dataprovider3()
    {
        return new Object[][] {
        	{"TUID: Data1", "111,112", 2, 3, 6 },
        	{"TUID: Data2", "114", 14, 6, 84 },
        	{"TUID: Data3", "113", 15, 8, 120 } 
        };
    }
    
    @Test(dataProvider = "DP4")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    @TestRailCases(testCasesId = "55")
    public void testDivideOperation(String TUID, String testRailColumn, int a, int b, int c) {
        int actual = Integer.valueOf(a) / Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid division result!");
    } 
    
    @DataProvider(parallel = false, name = "DP4")
    public static Object[][] dataprovider4()
    {
        return new Object[][] {
        	{"TUID: Data1", "111,112", 12, 3, 4 },
        	{"TUID: Data2", "114", 14, 2, 7 },
        	{"TUID: Data3", "113", 126, 21, 6 } 
        };
    }
    
    @Test(dataProvider = "DP5")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    @TestRailCases(testCasesId = "55")
    public void testPowerOperation(String TUID, String testRailColumn, int a, int b, int c) {
        int actual = (int) Math.pow(Double.valueOf(a), Double.valueOf(b));
        int expected = Integer.valueOf(c);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid power result!");
    } 
    
    @DataProvider(parallel = false, name = "DP5")
    public static Object[][] dataprovider5()
    {
        return new Object[][] {
        	{"TUID: Data1", "111,112", 2, 3, 8 },
        	{"TUID: Data2", "114", 3, 4, 81 },
        	{"TUID: Data3", "113", 2, 9, 512 }, 
        	{"TUID: Data5", "116", 2, 10, 1024 } 
        };
    }
}
