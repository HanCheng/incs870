package com.incs870.contentdetector.retrofitservices;

import static com.incs870.contentdetector.Constant.OWN_API_ENDPOINT;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RestClient {

    private final ContentDetectionService mContentService;

    public RestClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(OWN_API_ENDPOINT)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .client(httpClient.build())
                .build();

        mContentService = retrofit.create(ContentDetectionService.class);
    }

    public ContentDetectionService getContentService() {
        return mContentService;
    }
}
