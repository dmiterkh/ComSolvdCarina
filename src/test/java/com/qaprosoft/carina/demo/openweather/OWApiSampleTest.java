package com.qaprosoft.carina.demo.openweather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.openweather.GetWeatherAlgoMethod;
import com.qaprosoft.carina.demo.api.openweather.GetWeatherMethod;
import com.qaprosoft.carina.demo.api.openweather.GetWeatherMethodById;
import com.qaprosoft.carina.demo.api.openweather.GetWeatherMethodByLonLat;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class OWApiSampleTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OWApiSampleTest.class);
	
    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data for today for Minsk, Belarus,
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
    // "timezone": 10800,
    // testcase 1
    public void testUserGetsValidWeatherDataForMinskBelarus() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.addParameter("q", "Minsk");
        getWeatherMethod.addParameter("units", "metric");
        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.callAPI();
        
        String rs = getWeatherMethod.callAPI().asString();
        Assert.assertEquals(new JsonPath(rs).getString("sys.country"), "BY", "Country name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getString("name"), "Minsk", "City name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("id"), 625144, "Id is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("timezone"), 10800, "Time zone is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_min") > 11, "Minimal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_max") < 33, "Maximal temperature is incorrect!");        
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lon") > 27, "Longitude is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lat") < 54, "Latitude is incorrect!");        
 
        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_getweather/rs_weather.schema");
        getWeatherMethod.validateResponse();
        
    }

    @Test()
    @MethodOwner(owner = "dkharevich")
    //Verify, that the user gets valid data in celsium degrees and in Russian language for today for London, GB,
    //{
    //    "id": 2643743,
    //    "name": "London",
    //    "state": "",
    //    "country": "GB",
    //    "coord": {
    //        "lon": -0.12574,
    //        "lat": 51.50853
    //    }
    //}
    // "timezone": 3600,
    // testcase 2
    public void testUserGetsValidWeatherDataForLondonBritainInCelsiumInRussian() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.addParameter("q", "London");
        getWeatherMethod.addParameter("units", "metric");
        getWeatherMethod.addParameter("lang", "ru");
        getWeatherMethod.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.callAPI();
        
        String rs = getWeatherMethod.callAPI().asString();
        Assert.assertEquals(new JsonPath(rs).getString("sys.country"), "GB", "Country name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getString("name"), "Лондон", "City name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("id"), 2643743, "Id is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("timezone"), 3600, "Time zone is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_min") > 11, "Minimal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_max") < 33, "Maximal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lon") > -0.5, "Longitude is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lat") < 51.6, "Latitude is incorrect!");

        getWeatherMethod.validateResponseAgainstSchema("api/openweather/_getweather/rs_weather.schema");
//        getWeatherMethod.validateResponse();        
   
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
    //"timezone": 7200,
    // testcase 3
    public void testUserGetsValidWeatherDataById() {
        GetWeatherMethodById getWeatherMethodById = new GetWeatherMethodById(6359304);
        getWeatherMethodById.addParameter("units", "metric");
        getWeatherMethodById.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethodById.callAPI();
        
        String rs = getWeatherMethodById.callAPI().asString();
        Assert.assertEquals(new JsonPath(rs).getString("sys.country"), "ES", "Country name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getString("name"), "Madrid", "City name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("id"), 6359304, "Id is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("timezone"), 7200, "Time zone is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_min") > 11, "Minimal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_max") < 33, "Maximal temperature is incorrect!");        
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lon") > -4.1, "Longitude is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lat") < 40.6, "Latitude is incorrect!");

        getWeatherMethodById.validateResponseAgainstSchema("api/openweather/_getweather/rs_weather.schema");
//        getWeatherMethodById.validateResponse();  
        
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
    // "timezone": 16200,
    // testcase 4
    public void testUserGetsValidWeatherDataByLatAndLon() {
        GetWeatherMethodByLonLat getWeatherMethodByLonLat = new GetWeatherMethodByLonLat(69.172333, 34.52813);
        getWeatherMethodByLonLat.addParameter("units", "metric");
        getWeatherMethodByLonLat.addParameter("appid", "cefb78b4ff8ef92994c1f20445ba028d");
        getWeatherMethodByLonLat.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethodByLonLat.callAPI();
        
        String rs = getWeatherMethodByLonLat.callAPI().asString();
        Assert.assertEquals(new JsonPath(rs).getString("sys.country"), "AF", "Country name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getString("name"), "Kabul", "City name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("id"), 1138958, "Id is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("timezone"), 16200, "Time zone is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_min") > 15, "Minimal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_max") < 42, "Maximal temperature is incorrect!");        
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lon") > 69.1, "Longitude is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lat") < 34.7, "Latitude is incorrect!");

        getWeatherMethodByLonLat.validateResponseAgainstSchema("api/openweather/_getweather/rs_weather.schema");
//        getWeatherMethodByLonLat.validateResponse();   
        
    }
    
    
    
    @Test()
    @MethodOwner(owner = "dkharevich")
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
    // "timezone": 10800,
    public void testUserGetsValidWeatherDataAlgo() {
        GetWeatherAlgoMethod getWeatherAlgoMethod = new GetWeatherAlgoMethod();
        getWeatherAlgoMethod.addParameter("q", "Minsk");
        getWeatherAlgoMethod.addParameter("units", "metric");
        getWeatherAlgoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherAlgoMethod.callAPI();
        getWeatherAlgoMethod.getProperties().replace("sysId", "skip", 625144);
        getWeatherAlgoMethod.getProperties().replace("countryId", "skip", "BY");
        getWeatherAlgoMethod.getProperties().replace("timeZone", "skip", 10800);
        getWeatherAlgoMethod.getProperties().replace("cityName", "skip", "Minsk");

        
        String rs = getWeatherAlgoMethod.callAPI().asString();
        Assert.assertEquals(new JsonPath(rs).getString("sys.country"), "BY", "Country name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getString("name"), "Minsk", "City name is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("id"), 625144, "Id is incorrect!");
        Assert.assertEquals(new JsonPath(rs).getInt("timezone"), 10800, "Time zone is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_min") > 11, "Minimal temperature is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("main.temp_max") < 33, "Maximal temperature is incorrect!");        
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lon") > 27, "Longitude is incorrect!");
        Assert.assertTrue(new JsonPath(rs).getDouble("coord.lat") < 54, "Latitude is incorrect!");        

        getWeatherAlgoMethod.validateResponseAgainstSchema("api/openweather/_getweatheralgo/rs_weatheralgo2.schema");
        getWeatherAlgoMethod.validateResponse();
        

    }
   
    
    
}
