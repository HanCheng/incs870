package com.incs870.contentdetector;

import androidx.annotation.NonNull;

import com.incs870.contentdetector.retrofitservices.RestClient;

public class ContentDetector {

    private final RestClient mRestClient;

    private static ContentDetector SINGLETON;

    private ContentDetector() {
        // init retrofit client
        mRestClient = new RestClient();
    }

    public static ContentDetector getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new ContentDetector();
        }
        return SINGLETON;
    }

    @NonNull
    public RestClient getRestClient() {
        return mRestClient;
    }
}
