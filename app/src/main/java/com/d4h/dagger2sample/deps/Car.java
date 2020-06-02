package com.d4h.dagger2sample.deps;


import android.util.Log;

import com.d4h.dagger2sample.dagger.PerActivity;
import com.d4h.dagger2sample.deps.engine.Engine;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving... " +
                "\n Driver: " + driver);
    }
}