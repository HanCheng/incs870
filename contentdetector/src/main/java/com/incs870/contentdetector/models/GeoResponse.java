package com.incs870.contentdetector.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "country_code": "CA",
 *     "country_name": "Canada",
 *     "region_code": "BC",
 *     "region_name": "British Columbia",
 *     "city": "North Vancouver",
 *     "zip": "V5K 1A1",
 *     "latitude": 49.29270935058594,
 *     "longitude": -123.04773712158203,
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoResponse {

    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("region_name")
    private String regionName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }
}
