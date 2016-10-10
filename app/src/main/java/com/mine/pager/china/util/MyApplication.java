package com.mine.pager.china.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/10/8 0008.
 */

public class MyApplication extends Application {

    private  static Context context;

    @Override
    public void onCreate() {
        context = this;
    }
    public static Context getContext(){
        return context;//获得Application类型的application
    }
}
