package com.incs870.contentdetector.retrofitservices;

import com.incs870.contentdetector.models.Detector;

import io.reactivex.Completable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ContentDetectionService {

    @POST()
    Completable sendContentData(@Body Detector detector);
}
