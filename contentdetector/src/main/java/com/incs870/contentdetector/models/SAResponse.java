package com.incs870.contentdetector.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SAResponse {

    @JsonProperty("err")
    private int error;

    public void setError(int error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "SAResponse{" +
                "error=" + error +
                '}';
    }
}
