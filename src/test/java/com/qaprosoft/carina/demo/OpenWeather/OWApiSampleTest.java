package com.qaprosoft.carina.demo.OpenWeather;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherMethodById;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherMethodByLonLat;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherBboxMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherCircleMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherOneApiCallMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetForecastMethod;


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

    
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data by city id, ex Madrid
    //{
    //    "id": 6359304,
    //    "name": "Madrid",
    //    "state": "",
    //    "country": "ES",
    //    "coord": {
    //        "lon": -3.68275,
    //        "lat": 40.489349
    //    }
    //}    
    // testcase 3
    public void testUserGetsValidWeatherDataById() {
        GetWeatherMethodById getWeatherMethodById = new GetWeatherMethodById(6359304);
        getWeatherMethodById.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethodById.callAPI();
        
//        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherMethodById.validateResponseAgainstSchema("api/openweather/_getweather/rs.schema");
    }
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data by lat and lon ex. Kabul 
    //{
    //    "id": 1138958,
    //    "name": "Kabul",
    //    "state": "",
    //    "country": "AF",
    //    "coord": {
    //        "lon": 69.172333,
    //        "lat": 34.52813
    //    }
    //}    
    // testcase 4
    public void testUserGetsValidWeatherDataByLatAndLon() {
        GetWeatherMethodByLonLat getWeatherMethodByLonLat = new GetWeatherMethodByLonLat(69.172333, 34.52813);
        getWeatherMethodByLonLat.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethodByLonLat.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethodByLonLat.callAPI();
        
//        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherMethodByLonLat.validateResponseAgainstSchema("api/openweather/_getweather/rs.schema");
    }
   
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
//    // 27,53,29,56,20
//    // testcase 5
//    public void testUserGetsValidWeatherDataByBbox() {
//        GetWeatherBboxMethod getWeatherBboxMethod = new GetWeatherBboxMethod(27,53,29,56,20);
//        getWeatherBboxMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
//        getWeatherBboxMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
//        getWeatherBboxMethod.callAPI();
//        
////      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
//
//      getWeatherBboxMethod.validateResponseAgainstSchema("api/openweather/_getbbox/rs.schema");
//  }

    
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data by circle ex. Minsk
    //{
    //    "id": 625144,
    //    "name": "Minsk",
    //    "state": "",
    //    "country": "BY",
    //    "coord": {
    //        "lon": 27.566668,
    //        "lat": 53.900002
    //    }
    //}    
    // 27.566668, 53.90002, 50
    // testcase 6
    public void testUserGetsValidWeatherDataByCircle() {
        GetWeatherCircleMethod getWeatherCircleMethod = new GetWeatherCircleMethod(27.566668, 53.90002, 50);
        getWeatherCircleMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherCircleMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherCircleMethod.callAPI();
        
//      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

        getWeatherCircleMethod.validateResponseAgainstSchema("api/openweather/_getcircle/rs.schema");
  }
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    //One Api Call
    //Verify, that the user gets data for forecast for Minsk, Belarus
    //{
    //    "id": 625144,
    //    "name": "Minsk",
    //    "state": "",
    //    "country": "BY",
    //    "coord": {
    //        "lon": 27.566668,
    //        "lat": 53.900002
    //    }
    //}    
    // testcase 7
    public void testUserGetsValidWeatherDataByOneApiCall() {
        GetWeatherOneApiCallMethod getWeatherOneApiCallMethod = new GetWeatherOneApiCallMethod(27.566668, 53.900002, "hourly,daily");
        getWeatherOneApiCallMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherOneApiCallMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherOneApiCallMethod.callAPI();
        
//      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

      getWeatherOneApiCallMethod.validateResponseAgainstSchema("api/openweather/_getoneapicall/rs.schema");
  }
    
    
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets data for forecast for Moscow, Russia    
    // testcase 8
    public void testUserGetsValidForecastData() {
        GetForecastMethod getForecastMethod = new GetForecastMethod();
        getForecastMethod.addParameter("q", "Moscow");
        getForecastMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getForecastMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getForecastMethod.callAPI();
        
//      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

      getForecastMethod.validateResponseAgainstSchema("api/openweather/_getforecast/rs.schema");
  }

    
    
}
