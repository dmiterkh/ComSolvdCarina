package com.qaprosoft.carina.demo.OpenWeather;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.GetWeatherMethod;

public class OWApiSampleTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	
    @Test()
    @MethodOwner(owner = "dkharevich")
    public void testGetWeather() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.addParameter("q", "Minsk");
        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.callAPI();
        
 //       getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
    }

}
