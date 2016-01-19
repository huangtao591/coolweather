package com.tks.k.coolweather.util;

/**
 * Created by K on 1/19/2016.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
