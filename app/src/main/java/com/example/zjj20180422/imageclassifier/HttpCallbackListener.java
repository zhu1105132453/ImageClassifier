package com.example.zjj20180422.imageclassifier;

/**
 * Created by Zjj on 2018/4/10.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
