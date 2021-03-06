package com.lenovo.rxjavaretrofitdownload.videoDownload;

import com.lenovo.rxjavaretrofitdownload.common.AppConstant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * songwenju on 16-8-5 : 16 : 09.
 * 邮箱：songwenju@outlook.com
 */
public class BaseApi {
    //统一的超时时间管理
    public static OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
            .readTimeout(AppConstant.READ_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
            .writeTimeout(AppConstant.WRITE_TIMEOUT,TimeUnit.SECONDS)//设置写的超时时间
            .connectTimeout(AppConstant.CONNECT_TIMEOUT,TimeUnit.SECONDS)//设置连接超时时间
            .build();
}
