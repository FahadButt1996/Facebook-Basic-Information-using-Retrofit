package com.example.hp.myapplication;

/**
 * Created by M.FAHAD on 8/15/2017.
 */

public class ApiUtils {
//    static String Url;
    public ApiUtils(String url){
//        String url = "https://graph.facebook.com/" + object.getString("id") +"/picture?width=150&width=150";
//        this.Url = url;
    }
    public static ApiInterface getApiInterface(String Url){
        return RetrofitClient.getRetrofit(Url).create(ApiInterface.class);
    }
}
