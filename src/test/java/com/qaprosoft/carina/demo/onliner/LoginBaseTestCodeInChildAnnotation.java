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

public class LoginBaseTestCodeInChildAnnotation implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginBaseTestCodeInChildAnnotation.class);
	
	@BeforeSuite
    public void beforeSuiteLoginParent() {	
		LOGGER.info("@LoginTest-BeforeSuite-Parent");
    }
	
	@BeforeTest
	public void beforeTestLoginParent() {	
		LOGGER.info("@LoginTest-BeforeTest-Parent");	
	}
	
	@BeforeClass
	public void beforeClassLoginParent() {
		LOGGER.info("@LoginTest-BeforeClass-Parent");
	}
	
	@BeforeMethod
	public void beforeMethodloginParent() {
		LOGGER.info("@LoginTest-BeforeMethod-Parent");
	}
	
	
	
// Child Class with Child annotations
	
	
	
	@AfterMethod
	public void afterMethodLoginParent() {
		LOGGER.info("@LoginTest-AfterMethod-Parent");
	}

	@AfterClass
	public void afterClassLoginParent() {
		LOGGER.info("@LoginTest-AfterClass-Parent");
	}

	@AfterTest
	public void afterTestLoginParent() {
		LOGGER.info("@LoginTest-AfterTest-Parent");
	}
	
    @AfterSuite
    public void afterSuiteLoginParent() {
    	LOGGER.info("@LoginTest-AfterSuite-Parent");
    }

		
	   
}