package com.d4h.dagger2sample;

import android.app.Application;

import com.d4h.dagger2sample.dagger.AppComponent;
import com.d4h.dagger2sample.dagger.DaggerAppComponent;
import com.d4h.dagger2sample.dagger.DriverModule;

public class Dagger2SampleApplication extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("DriverName"));
    }

    public AppComponent getComponent() {
        return component;
    }
}
