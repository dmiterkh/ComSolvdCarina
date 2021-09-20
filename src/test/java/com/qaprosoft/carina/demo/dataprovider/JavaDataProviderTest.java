package com.qaprosoft.carina.demo.dataprovider;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaDataProviderTest extends ParentDataProviderBaseTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaDataProviderTest.class);    
 
	/**
     * Parametrization using TestNG annotation @Parameters:
     * <p>
     * 1. List all parameter names in appropriate annotation. 2. Pass all parameters from TestNG xml file (check
     * test_suites/dataproviders.xml).
     * @param a int
     *
     * @param b int
     *
     * @param c int
     */
    @Test(dataProvider = "DP1")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testAddOperation(int a, int b, int c) {
        int actual = Integer.valueOf(a) + Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        Assert.assertEquals(actual, expected, "Invalid addition result!");
    } 
    
    @DataProvider(parallel = false, name = "DP1")
    public static Object[][] dataprovider1()
    {
        return new Object[][] {
            { 2, 3, 5 },
            { 14, 6, 20 },
            { 15, 8, 23 } 
        };
    }

    @Test(dataProvider = "DP2")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testSubtractOperation(int a, int b, int c) {
        int actual = Integer.valueOf(a) - Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        Assert.assertEquals(actual, expected, "Invalid subtraction result!");
    } 
    
    @DataProvider(parallel = false, name = "DP2")
    public static Object[][] dataprovider2()
    {
        return new Object[][] {
            { 12, 3, 9 },
            { 14, 6, 8 },
            { 15, 8, 7 } 
        };
    }

    @Test(dataProvider = "DP3")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testMultiplyOperation(int a, int b, int c) {
        int actual = Integer.valueOf(a) * Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        Assert.assertEquals(actual, expected, "Invalid multiplication result!");
    } 
    
    @DataProvider(parallel = false, name = "DP3")
    public static Object[][] dataprovider3()
    {
        return new Object[][] {
            { 2, 3, 6 },
            { 14, 6, 84 },
            { 15, 8, 120 } 
        };
    }
    
    @Test(dataProvider = "DP4")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testDivideOperation(int a, int b, int c) {
        int actual = Integer.valueOf(a) / Integer.valueOf(b);
        int expected = Integer.valueOf(c);
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        Assert.assertEquals(actual, expected, "Invalid division result!");
    } 
    
    @DataProvider(parallel = false, name = "DP4")
    public static Object[][] dataprovider4()
    {
        return new Object[][] {
            { 12, 3, 4 },
            { 14, 2, 7 },
            { 126, 21, 6 } 
        };
    }
    
    @Test(dataProvider = "DP5")
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a", "b", "c"})
    public void testPowerOperation(int a, int b, int c) {
        int actual = (int) Math.pow(Double.valueOf(a), Double.valueOf(b));
        int expected = Integer.valueOf(c);
        LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        Assert.assertEquals(actual, expected, "Invalid power result!");
    } 
    
    @DataProvider(parallel = false, name = "DP5")
    public static Object[][] dataprovider5()
    {
        return new Object[][] {
            { 2, 3, 8 },
            { 3, 4, 81 },
            { 3, 3, 82 },  
            { 2, 9, 512 } 
        };
    }
}
