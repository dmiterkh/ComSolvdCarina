package com.qaprosoft.carina.demo.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.CsvDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSVDataProviderTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CSVDataProviderTest.class);
	
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
    @Parameters({"a","b","c"})
	@CsvDataSourceParameters(path = "xls/dkharevich_csv/Addition.csv", dsUid = "TUID", separator = '!')
	public void testAddOperation(HashMap<String, String> args) {
		int actual = Integer.valueOf(args.get("a")) + Integer.valueOf(args.get("b"));
		int expected = Integer.valueOf(args.get("c"));
        LOGGER.info("arguments   " + String.valueOf(args.get("a")) + "," + String.valueOf(args.get("b")) + "," + String.valueOf(args.get("c")) + "   result   " + String.valueOf(actual) + "," + String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid addition result!");
	}

	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@CsvDataSourceParameters(path = "xls/dkharevich_csv/Subtraction.csv", dsUid = "TUID", separator = '@')
	public void testSubtractOperation(HashMap<String, String> args) {
		int actual = Integer.valueOf(args.get("a")) - Integer.valueOf(args.get("b"));
		int expected = Integer.valueOf(args.get("c"));
        LOGGER.info("arguments   " + String.valueOf(args.get("a")) + "," + String.valueOf(args.get("b")) + "," + String.valueOf(args.get("c")) + "   result   " + String.valueOf(actual) + "," + String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid subtraction result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@CsvDataSourceParameters(path = "xls/dkharevich_csv/Multiplication.csv", dsUid = "TUID", separator = '#')
	public void testMultiplyOperation(HashMap<String, String> args) {
		int actual = Integer.valueOf(args.get("a")) * Integer.valueOf(args.get("b"));
		int expected = Integer.valueOf(args.get("c"));
        LOGGER.info("arguments   " + String.valueOf(args.get("a")) + "," + String.valueOf(args.get("b")) + "," + String.valueOf(args.get("c")) + "   result   " + String.valueOf(actual) + "," + String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid multiplication result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@CsvDataSourceParameters(path = "xls/dkharevich_csv/Division.csv", dsUid = "TUID", separator = '$')
	public void testDivideOperation(HashMap<String, String> args) {
		int actual = Integer.valueOf(args.get("a")) / Integer.valueOf(args.get("b"));
		int expected = Integer.valueOf(args.get("c"));
        LOGGER.info("arguments   " + String.valueOf(args.get("a")) + "," + String.valueOf(args.get("b")) + "," + String.valueOf(args.get("c")) + "   result   " + String.valueOf(actual) + "," + String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid division result!");
	}
	
	@Test(dataProvider = "DataProvider")
	@MethodOwner(owner = "dkharevich")
	@CsvDataSourceParameters(path = "xls/dkharevich_csv/Power.csv", dsUid = "TUID", separator = '%')
	public void testPowerOperation(HashMap<String, String> args) {
		int actual = (int) Math.pow(Double.valueOf(args.get("a")), Double.valueOf(args.get("b")));
		int expected = Integer.valueOf(args.get("c"));
        LOGGER.info("arguments   " + String.valueOf(args.get("a")) + "," + String.valueOf(args.get("b")) + "," + String.valueOf(args.get("c")) + "   result   " + String.valueOf(actual) + "," + String.valueOf(expected));	
		Assert.assertEquals(actual, expected, "Invalid power result!");
	}
}
