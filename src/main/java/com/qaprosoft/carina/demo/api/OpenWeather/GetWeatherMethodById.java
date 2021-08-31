package com.qaprosoft.carina.demo.api.OpenWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetWeatherMethodById extends AbstractApiMethodV2 {
	public GetWeatherMethodById(int idArg) {
        super(null, "api/openweather/_getweather/rs_weather.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameterIfNotNull("id", String.valueOf(idArg));
        
    }
}