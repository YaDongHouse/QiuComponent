package com.dong.basemodule;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * @packInfo:com.dong.basemodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/23
 * Time: 17:40
 */

public class ModuleApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //65535
        MultiDex.install(this);
    }
}
