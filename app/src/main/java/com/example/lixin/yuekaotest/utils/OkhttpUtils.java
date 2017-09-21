package com.example.lixin.yuekaotest.utils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hua on 2017/9/21.
 */

public class OkhttpUtils {


        public static void sendOkHttpRequest(String address, Callback callback){
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(address)
                    .build();
            client.newCall(request).enqueue(callback);
    }

}
