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

public class LoginBaseTest2 implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginBaseTest2.class);
	
	@BeforeSuite
    public void initTestSuite() {
		LOGGER.info("@LoginTest-BeforeSuite-Parent");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownTestSuite() {
    	LOGGER.info("@LoginTest-AfterSuite-Parent");
    }

	@BeforeTest
	public void beforeTest() {
		LOGGER.info("@LoginTest-BeforeTest-Parent");
	}

	@AfterTest
	public void afterTests() {
		LOGGER.info("@LoginTest-AfterTest-Parent");
	}
	
	@BeforeClass
	public void beforeClass() {
		LOGGER.info("@LoginTest-BeforeClass-Parent");
	}

	@AfterClass
	public void afterClass() {
		LOGGER.info("@LoginTest-AfterClass-Parent");
	}

	@BeforeMethod
	public void beforeMethod() {
		LOGGER.info("@LoginTest-BeforeMethod-Parent");
	}

	@AfterMethod
	public void afterMethod() {
		LOGGER.info("@LoginTest-AfterMethod-Parent");
	}		
	   
}