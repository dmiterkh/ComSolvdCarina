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
    //Verify, that the user gets valid data for today for Minsk, Belarus,
    // testcase 1
    public void testUserGetsValidWeatherDataForMinskBelarus() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.addParameter("q", "Minsk");
        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.callAPI();
        
//      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_getweather/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data in celsium degrees and in Russian language for today for London, GB,
    // testcase 2
    public void testUserGetsValidWeatherDataForLondonBritainInCelsiumInRussian() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.addParameter("q", "London");
        getWeatherMethod.addParameter("units", "metric");
        getWeatherMethod.addParameter("lang", "ru");
        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.callAPI();
        
//        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_getweather/rs.schema");
    }

    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //Verify, that the user gets valid data by city id, ex Madrid
//    //{
//    //    "id": 6359304,
//    //    "name": "Madrid",
//    //    "state": "",
//    //    "country": "ES",
//    //    "coord": {
//    //        "lon": -3.68275,
//    //        "lat": 40.489349
//    //    }
//    //}    
//    // testcase 3
//    public void testUserGetsValidWeatherDataById() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//    }
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //Verify, that the user gets valid data by lat and lon ex. Kabul 
//    //{
//    //    "id": 1138958,
//    //    "name": "Kabul",
//    //    "state": "",
//    //    "country": "AF",
//    //    "coord": {
//    //        "lon": 69.172333,
//    //        "lat": 34.52813
//    //    }
//    //}    
//    // testcase 4
//    public void testUserGetsValidWeatherDataByLatAndLon() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//    }
//   
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //Verify, that the user gets valid data by bbox ex. Minsk
//    //{
//    //    "id": 625144,
//    //    "name": "Minsk",
//    //    "state": "",
//    //    "country": "BY",
//    //    "coord": {
//    //        "lon": 27.566668,
//    //        "lat": 53.900002
//    //    }
//    //}    
//    // testcase 5
//    public void testUserGetsValidWeatherDataByBbox() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//      getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//  }
//
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //Verify, that the user gets valid data by circle ex. Minsk
//    //{
//    //    "id": 625144,
//    //    "name": "Minsk",
//    //    "state": "",
//    //    "country": "BY",
//    //    "coord": {
//    //        "lon": 27.566668,
//    //        "lat": 53.900002
//    //    }
//    //}    
//    // testcase 6
//    public void testUserGetsValidWeatherDataByCircle() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//      getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//  }
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //One Api Call
//    //Verify, that the user gets data for forecast for Minsk, Belarus
//    //{
//    //    "id": 625144,
//    //    "name": "Minsk",
//    //    "state": "",
//    //    "country": "BY",
//    //    "coord": {
//    //        "lon": 27.566668,
//    //        "lat": 53.900002
//    //    }
//    //}    
//    // testcase 7
//    public void testUserGetsValidWeatherDataByCircle() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//      getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//  }
//    
//    
//    @Test()
//    @MethodOwner(owner = "dkharevich")
//    //Verify, that the user gets data for forecast for Moscow, Russia    
//    // testcase 8
//    public void testUserGetsValidWeatherDataByCircle() {
//        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
////        getWeatherMethod.addParameter("q", "Minsk");
////        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
////        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
////        getWeatherMethod.callAPI();
//        
////      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//      getWeatherMethod.validateResponseAgainstSchema("api/openweather/_get/rs.schema");
//  }

    
    
}
