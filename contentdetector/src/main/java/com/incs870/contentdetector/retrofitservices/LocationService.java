package com.incs870.contentdetector.retrofitservices;

import com.incs870.contentdetector.models.GeoResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LocationService {

    @GET("/{ip}")
    Observable<GeoResponse> getLocationResponse(@Path("ip") String ipAddress, @Query("access_key") String accessKey);
}
