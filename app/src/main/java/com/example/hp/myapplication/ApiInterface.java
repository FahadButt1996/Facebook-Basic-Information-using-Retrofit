package com.example.hp.myapplication;

import android.graphics.Bitmap;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


/**
 * Created by M.FAHAD on 8/15/2017.
 */

public interface ApiInterface {
    @GET("/picture?width=150&width=150")
    Call<ResponseBody> getData(@Query("id")String id);
}
