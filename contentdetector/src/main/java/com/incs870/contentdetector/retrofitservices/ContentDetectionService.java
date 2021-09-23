package com.incs870.contentdetector.retrofitservices;

import io.reactivex.Completable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ContentDetectionService {

    @POST
    Completable sendContentData(@Body String requestContent);
}
