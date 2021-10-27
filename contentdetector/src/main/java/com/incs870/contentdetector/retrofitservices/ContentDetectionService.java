package com.incs870.contentdetector.retrofitservices;

import com.incs870.contentdetector.models.Detector;

import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ContentDetectionService {

    @POST("/report")
    Completable sendContentData(@Body Detector detector);
}
