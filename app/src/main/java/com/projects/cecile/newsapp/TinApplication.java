package com.projects.cecile.newsapp;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class TinApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }


}
