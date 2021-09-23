package com.incs870.contentdetector.retrofitservices;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RestClient {

    private static final String API_ENDPOINT = "";
    private final ContentDetectionService mContentService;

    public RestClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_ENDPOINT).addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .client(httpClient.build())
                .build();

        mContentService = retrofit.create(ContentDetectionService.class);
    }

    public ContentDetectionService getContentService() {
        return mContentService;
    }
}
