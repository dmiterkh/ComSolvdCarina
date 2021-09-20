package com.qaprosoft.carina.demo.dataprovider;

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

public class ParentDataProviderBaseTest implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ParentDataProviderBaseTest.class);
	
	@BeforeSuite
    public void beforeSuiteNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-BeforeSuite-Parent");	
    }
	
	@BeforeTest
	public void beforeTestNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-BeforeTest-Parent");	
	}
	
	@BeforeClass
	public void beforeClassNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-BeforeClass-Parent");
	}
	
	@BeforeMethod
	public void beforeMethodNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-BeforeMethod-Parent");	}
	
	
	
// Child Class with Child annotations
	
	
	
	@AfterMethod
	public void afterMethodNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-AfterMethod-Parent");
	}

	@AfterClass
	public void afterClassNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-AfterClass-Parent");
	}

	@AfterTest
	public void afterTestNotLoginParent() {
		LOGGER.info("@@@@@ --->>> @DataProviderTest-AfterTest-Parent");		
	}
	
    @AfterSuite
    public void afterSuiteNotLoginParent() {
    	LOGGER.info("@@@@@ --->>> @DataProviderTest-AfterSuite-Parent");		
    }

		
	   
}