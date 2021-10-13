package com.incs870.contentdetector.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getUserId() {
        return userId;
    }

    public String getTextContent() {
        return textContent;
    }

    static class Builder {
        private String timeStamp;
        private String userId;
        private String textContent;

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

        public Detector build() {
            Detector detector = new Detector();
            detector.timeStamp = timeStamp;
            detector.userId = userId;
            detector.textContent = textContent;
            return new Detector();
        }
    }
}
