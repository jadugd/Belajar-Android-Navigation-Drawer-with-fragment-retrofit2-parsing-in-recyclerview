package com.testbot.tukang;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 03/02/2018.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
