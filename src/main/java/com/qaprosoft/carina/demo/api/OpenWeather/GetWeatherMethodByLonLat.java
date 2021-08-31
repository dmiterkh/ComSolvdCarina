package com.qaprosoft.carina.demo.api.OpenWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetWeatherMethodByLonLat extends AbstractApiMethodV2 {
	public GetWeatherMethodByLonLat(double lonArg, double latArg) {
        super(null, "api/openweather/_getweather/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameterIfNotNull("lon", String.valueOf(lonArg));
        addParameterIfNotNull("lat", String.valueOf(latArg));
        
        
    }
}