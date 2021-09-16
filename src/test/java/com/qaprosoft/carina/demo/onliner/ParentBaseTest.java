package com.qaprosoft.carina.demo.onliner;

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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;

/**
 * @author Dmitry Kharevich
 */

public class ParentBaseTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ParentBaseTest.class);
	
	@BeforeSuite
    public void beforeSuite() {
		LOGGER.info("!!!");		
		LOGGER.info("@LoginTest-BeforeSuite-Parent");
		LOGGER.info("!!!");		
    }
	
	@BeforeTest
	public void beforeTest() {
		LOGGER.info("!!!");		
		LOGGER.info("@LoginTest-BeforeTest-Parent");
		LOGGER.info("!!!");		
	}
	
	@BeforeClass
	public void beforeClass() {
		LOGGER.info("!!!");	
		LOGGER.info("@LoginTest-BeforeClass-Parent");
		LOGGER.info("!!!");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		LOGGER.info("!!!");	
		LOGGER.info("@LoginTest-BeforeMethod-Parent");
		LOGGER.info("!!!");	
	}
	
	
	
// Child Class with Child annotations
	
	
	
	@AfterMethod
	public void afterMethod() {
		LOGGER.info("!!!");	
		LOGGER.info("@LoginTest-AfterMethod-Parent");
		LOGGER.info("!!!");	
	}

	@AfterClass
	public void afterClass() {
		LOGGER.info("!!!");	
		LOGGER.info("@LoginTest-AfterClass-Parent");
		LOGGER.info("!!!");	
	}

	@AfterTest
	public void afterTest() {
		LOGGER.info("!!!");		
		LOGGER.info("@LoginTest-AfterTest-Parent");
		LOGGER.info("!!!");		
	}
	
    @AfterSuite
    public void afterSuite() {
		LOGGER.info("!!!");		
    	LOGGER.info("@LoginTest-AfterSuite-Parent");
		LOGGER.info("!!!");		
    }

		
	   
}