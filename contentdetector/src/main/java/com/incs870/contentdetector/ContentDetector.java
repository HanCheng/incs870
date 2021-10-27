package com.incs870.contentdetector;

import androidx.annotation.NonNull;

import com.incs870.contentdetector.retrofitservices.LocationServiceClient;
import com.incs870.contentdetector.retrofitservices.RestClient;

public class ContentDetector {

    private final RestClient mRestClient;
    private final LocationServiceClient mLocationClient;

    private static ContentDetector SINGLETON;

    private ContentDetector() {
        // init retrofit client
        mRestClient = new RestClient();
        mLocationClient = new LocationServiceClient();
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

    public LocationServiceClient getLocationClient() {
        return mLocationClient;
    }
}
