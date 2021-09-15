package com.qaprosoft.carina.demo.api.openweather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetWeatherBboxMethod extends AbstractApiMethodV2 {
	public GetWeatherBboxMethod(double lonLeftArg, double latBottomArg, double lonRightArg, double latTopArg, int zoomArg) {
        super(null, "api/openweather/_getbbox/rs_bbox.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameterIfNotNull("bbox", String.valueOf(lonLeftArg) + "," + String.valueOf(latBottomArg) + "," + String.valueOf(lonRightArg) + "," + String.valueOf(latTopArg) + "," + String.valueOf(zoomArg));        
        
    }
}
