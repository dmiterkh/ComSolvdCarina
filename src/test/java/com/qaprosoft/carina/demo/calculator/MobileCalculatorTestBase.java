package com.qaprosoft.carina.demo.calculator;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.qaprosoft.carina.core.foundation.IAbstractTest;

/**
 * @author Dmitry Kharevich
 */

public class MobileCalculatorTestBase implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MobileCalculatorTestBase.class);
	
	@BeforeSuite
    public void initTestSuite() {
		System.out.println("@@BeforeSuite");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownTestSuite() {
		System.out.println("@@AfterSuite");
    }

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTests() {
		System.out.println("@AfterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}	
		   
}