package com.example.testing.testingandroid;

import android.app.Application;

import com.wman.crash.CustomActivityOnCrash;

/**
 * Created by wman on 17-4-14.
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CustomActivityOnCrash.install(this);
    }
}
