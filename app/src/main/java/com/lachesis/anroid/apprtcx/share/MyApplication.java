package com.lachesis.anroid.apprtcx.share;

import android.app.Application;
import android.content.Context;

import com.lachesis.common.CommonLib;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * 自定义应用程序类
 *
 *（尽量轻量化）
 *
 * Created by Robert on 2017/9/19.
 */

public class MyApplication extends Application {

    public static RefWatcher getRefWatcher(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();

        //内存泄漏监测
        refWatcher = LeakCanary.install(this);
        init();
    }

    private void init(){
        CommonLib.getInstance().init(this);
        RunDataHelper.getInstance().init();
    }
}
