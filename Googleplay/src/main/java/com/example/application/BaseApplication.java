package com.example.application;

import android.app.Application;

import java.util.logging.Handler;

/**
 * Created by KEXIN on 2015/11/10.
 */
public class BaseApplication extends Application {

    //获取主线程的上下文
    private static BaseApplication mContext = null;
    //获取主线程的handler
    private static Handler mMainThreadHandler = null;
    //获取到主线程
    private static  Thread mMainThread = null;




    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = mContext;
        this.mMainThreadHandler = mMainThreadHandler;
        this.mMainThread = mMainThread;

    }

}
