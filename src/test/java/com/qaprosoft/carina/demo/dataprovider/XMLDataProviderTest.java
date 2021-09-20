package com.qaprosoft.carina.demo.dataprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

public class XMLDataProviderTest extends ParentDataProviderBaseTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(XLSDataProviderTest.class);
	
	@Test()
    @MethodOwner(owner = "dkharevich")
    @Parameters({"a1", "b1", "c1"})
    public void testAddOperation( int a1,  int b1, int c1) {
        int actual = Integer.valueOf(a1) + Integer.valueOf(b1);
        int expected = Integer.valueOf(c1);
        LOGGER.info("@@@");
        LOGGER.info(String.valueOf(a1)+","+String.valueOf(b1)+","+String.valueOf(c1)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
        LOGGER.info("@@@");
        Assert.assertEquals(actual, expected, "Invalid addition result!");
    } 

//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @Parameters({"a2", "b2", "c2"})
//    public void testSubtractOperation(@Optional("3") int a2, @Optional("2") int b2, @Optional("1") int c2) {
//        int actual = Integer.valueOf(a2) - Integer.valueOf(b2);
//        int expected = Integer.valueOf(c2);
//        LOGGER.info("@@@");
//        LOGGER.info(String.valueOf(a2)+","+String.valueOf(b2)+","+String.valueOf(c2)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
//        LOGGER.info("@@@");
//        Assert.assertEquals(actual, expected, "Invalid subtraction result!");
//    } 
//
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @Parameters({"a3", "b3", "c3"})
//    public void testMultiplyOperation(@Optional("2") int a3, @Optional("3") int b3, @Optional("6") int c3) {
//        int actual = Integer.valueOf(a3) * Integer.valueOf(b3);
//        int expected = Integer.valueOf(c3);
//        LOGGER.info("@@@");
//        LOGGER.info(String.valueOf(a3)+","+String.valueOf(b3)+","+String.valueOf(c3)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
//        LOGGER.info("@@@");
//        Assert.assertEquals(actual, expected, "Invalid multiplication result!");
//    } 
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @Parameters({"a4", "b4", "c4"})
//    public void testDivideOperation(@Optional("8") int a4,  @Optional("4") int b4, @Optional("2") int c4) {
//        int actual = Integer.valueOf(a4) / Integer.valueOf(b4);
//        int expected = Integer.valueOf(c4);
//        LOGGER.info("@@@");
//        LOGGER.info(String.valueOf(a4)+","+String.valueOf(b4)+","+String.valueOf(c4)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
//        LOGGER.info("@@@");
//        Assert.assertEquals(actual, expected, "Invalid division result!");
//    } 
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    @Parameters({"a5", "b5", "c5"})
//    public void testPowerOperation(@Optional("2") int a5, @Optional("3") int b5, @Optional("8") int c5) {
//        int actual = (int) Math.pow(Double.valueOf(a5), Double.valueOf(b5));
//        int expected = Integer.valueOf(c5);
//        LOGGER.info("@@@");
//        LOGGER.info(String.valueOf(a5)+","+String.valueOf(b5)+","+String.valueOf(c5)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
//        LOGGER.info("@@@");
//        Assert.assertEquals(actual, expected, "Invalid power result!");
//    } 

}
