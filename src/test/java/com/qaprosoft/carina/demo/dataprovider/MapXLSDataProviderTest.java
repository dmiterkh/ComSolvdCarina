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

public class MapXLSDataProviderTest extends ParentBaseTest implements IAbstractTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MapXLSDataProviderTest.class);
	
	

}

///**
//*
//* Parametrization using external XLS/XLSX: every row in spreadsheet provides tests arguments as Map&lt;String, String&gt; for 1 test.
//* For datasets with huge number of columns just remove dsArgs parameter to return whole row as single map object
//* <p>
//* 1. Specify data-provider type:
//* - @Test(dataProvider = "XLSDataProvider") allows parallel execution
//* - @Test(dataProvider = "SingleDataProvider") allows single-thread execution
//* 2. In @XlsDataSourceParameters should contain:
//* - path - xls/xlsx file path located in src/test/resources
//* - sheet - xls spreadsheet name
//* - dsUid - data-source unique identifier, use TUID or set of parameters
//*
//* @param args HashMap&lt;String, String&gt;
//*/
//@Test(dataProvider = "DataProvider")
//@MethodOwner(owner = "dkharevich")
//@TestRailCases(testCasesId = "1")
//@XlsDataSourceParameters(path = "xls/dkharevich.xlsx", sheet = "Addition", dsUid = "TUID", testRailColumn = "a")
//public void testSumOperationEx(HashMap<String, String> args) {
// int actual = Integer.valueOf(args.get("a")) + Integer.valueOf(args.get("b"));
// int expected = Integer.valueOf(args.get("c"));
// Assert.assertEquals(actual, expected, "Invalid sum result!");
//}
//
//