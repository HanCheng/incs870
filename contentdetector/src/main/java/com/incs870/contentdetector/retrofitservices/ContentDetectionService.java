package com.incs870.contentdetector.retrofitservices;

import com.incs870.contentdetector.models.Detector;
import com.incs870.contentdetector.models.SAResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ContentDetectionService {

    @POST("/report")
    Observable<SAResponse> sendContentData(@Body Detector detector);
}
