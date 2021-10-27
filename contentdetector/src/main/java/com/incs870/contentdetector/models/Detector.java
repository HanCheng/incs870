package com.incs870.contentdetector.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import okhttp3.OkHttpClient;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Detector {

    private static final String DATE_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT_STR, Locale.CANADA);

    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("textContent")
    private String textContent;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;

    public Detector() {
    }

    public Detector(final Detector detector) {
        this.textContent = detector.textContent;
        this.timeStamp = detector.timeStamp;
        this.userId = detector.userId;
        this.province = detector.province;
        this.city = detector.city;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    static class Builder {
        private String timeStamp;
        private String userId;
        private String textContent;
        private String city;
        private String state;

        public Builder(final Detector detector) {
            timeStamp = detector.timeStamp;
            userId = detector.userId;
            textContent = detector.textContent;
            city = detector.city;
            state = detector.province;
        }

        public Builder timeStamp(final Date date) {
            timeStamp = DATE_FORMATTER.format(date);
            return this;
        }

        public Builder userId(final String userId) {
            this.userId = userId;
            return this;
        }

        public Builder textContent(final String textContent) {
            this.textContent = textContent;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder state(final String state) {
            this.state = state;
            return this;
        }

        public Detector build() {
            Detector detector = new Detector();
            detector.timeStamp = timeStamp;
            detector.userId = userId;
            detector.textContent = textContent;
            return new Detector(detector);
        }
    }
}
