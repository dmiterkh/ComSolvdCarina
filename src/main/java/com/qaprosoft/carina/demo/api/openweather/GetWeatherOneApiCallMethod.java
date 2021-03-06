package com.qaprosoft.carina.demo.api.openweather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetWeatherOneApiCallMethod extends AbstractApiMethodV2 {
	public GetWeatherOneApiCallMethod(double lonArg, double latArg, String stringArg) {
	        super(null, "api/openweather/_getoneapicall/rs_oneapicall.json", new Properties());
	        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	        addParameterIfNotNull("lon", String.valueOf(lonArg));
	        addParameterIfNotNull("lat", String.valueOf(latArg));
	        addParameterIfNotNull("cnt", stringArg);
    }
}
