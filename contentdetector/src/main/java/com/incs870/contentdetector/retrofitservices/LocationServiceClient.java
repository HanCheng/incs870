package com.incs870.contentdetector.retrofitservices;

import static com.incs870.contentdetector.Constant.LOCATION_API_ENDPOINT;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class LocationServiceClient {

    private final LocationService mLocationService;

    public LocationServiceClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LOCATION_API_ENDPOINT)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .client(httpClient.build())
                .build();

        mLocationService = retrofit.create(LocationService.class);
    }

    public LocationService getLocationService() {
        return mLocationService;
    }
}
