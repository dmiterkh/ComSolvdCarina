package com.qaprosoft.carina.demo.OpenWeather;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherBboxMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherCircleMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetWeatherOneApiCallMethod;
import com.qaprosoft.carina.demo.api.OpenWeather.GetForecastMethod;


public class OWApiSampleTestLists implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OWApiSampleTestLists.class);
   
   
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data by bbox ex. Minsk
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
    // 27,53,29,56,20
    // testcase 5
    public void testUserGetsValidWeatherDataByBbox() {
        GetWeatherBboxMethod getWeatherBboxMethod = new GetWeatherBboxMethod(27,53,29,56,20);
        getWeatherBboxMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherBboxMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherBboxMethod.callAPI();
        
//      getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

      getWeatherBboxMethod.validateResponseAgainstSchema("api/openweather/_getbbox/rs_bbox.schema");
  }

    
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

        getWeatherCircleMethod.validateResponseAgainstSchema("api/openweather/_getcircle/rs_circle.schema");
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

      getWeatherOneApiCallMethod.validateResponseAgainstSchema("api/openweather/_getoneapicall/rs_oneapicall.schema");
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

      getForecastMethod.validateResponseAgainstSchema("api/openweather/_getforecast/rs_forecast.schema");
  }

    
    
}
