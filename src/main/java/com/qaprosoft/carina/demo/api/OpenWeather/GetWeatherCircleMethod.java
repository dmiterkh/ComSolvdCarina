package com.qaprosoft.carina.demo.api.OpenWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetWeatherCircleMethod extends AbstractApiMethodV2 {
	public GetWeatherCircleMethod(double lonArg, double latArg, int cntArg) {
	        super(null, "api/openweather/_getcircle/rs_circle.json", new Properties());
	        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	        addParameterIfNotNull("lon", String.valueOf(lonArg));
	        addParameterIfNotNull("lat", String.valueOf(latArg));
	        addParameterIfNotNull("cnt", String.valueOf(cntArg));
    }
}
