package com.df.module.common_core.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Wdf on 19-2-14 16:08
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
