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

import com.qaprosoft.carina.demo.onliner.OnlinerAllTestsWithLoginParentAnnotation;

public class XLSDataProviderTest extends ParentDataProviderBaseTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(XLSDataProviderTest.class);
	
	/**
	* Parametrization using external XLS/XLSX: every row in spreadsheet provides tests arguments set for 1 test.
	* <p>
	* 1. Specify data-provider type:
	* - @Test(dataProvider = "DataProvider") allows parallel execution
	* - @Test(dataProvider = "SingleDataProvider") allows single-thread execution
	* 2. In @XlsDataSourceParameters should contain:
	* - path - xls/xlsx file path located in src/test/resources
	* - sheet - xls spreadsheet name
	* - dsUid - data-source unique identifier, use TUID or set of parameters
	* - dsArgs - column names from spreadsheet
	*
	* @param a String
	*
	* @param b String
	*
	* @param c String
	*/
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Addition", dsUid = "TUID", dsArgs = "a,b,c", testRailColumn = "a")
	public void testAddOperation(String a, String b, String c) {
		int actual = Integer.valueOf(a) + Integer.valueOf(b);
		int expected = Integer.valueOf(c);
		LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid addition result!");
	}

	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Subtraction", dsUid = "TUID", dsArgs = "a,b,c", testRailColumn = "a")
	public void testSubtractOperation(String a, String b, String c) {
		int actual = Integer.valueOf(a) - Integer.valueOf(b);
		int expected = Integer.valueOf(c);
		LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid subtraction result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Multiplication", dsUid = "TUID", dsArgs = "a,b,c", testRailColumn = "a")
	public void testMultiplyOperation(String a, String b, String c) {
		int actual = Integer.valueOf(a) * Integer.valueOf(b);
		int expected = Integer.valueOf(c);
		LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid multiplication result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Division", dsUid = "TUID", dsArgs = "a,b,c", testRailColumn = "a")
	public void testDivideOperation(String a, String b, String c) {
		int actual = Integer.valueOf(a) / Integer.valueOf(b);
		int expected = Integer.valueOf(c);
		LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid division result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Power", dsUid = "TUID", dsArgs = "a,b,c", testRailColumn = "a")
	public void testPowerOperation(String a, String b, String c) {
		int actual = (int) Math.pow(Double.valueOf(a), Double.valueOf(b));
		int expected = Integer.valueOf(c);
		LOGGER.info(String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+"--->>>"+String.valueOf(actual)+","+String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid power result!");
	}
}
