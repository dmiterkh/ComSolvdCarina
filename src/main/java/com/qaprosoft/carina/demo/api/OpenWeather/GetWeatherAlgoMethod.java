package com.qaprosoft.carina.demo.api.OpenWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
//import com.qaprosoft.carina.demo.api.Key;

import java.util.Properties;

public class GetWeatherAlgoMethod extends AbstractApiMethodV2 {
	public GetWeatherAlgoMethod() {
        super(null, "api/openweather/_getweatheralgo/rs_weatheralgo.json", "api/openweather/_getweatheralgo/weatheralgo.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
//        addParameter("appId", Key.getApiKey());
    }
}
