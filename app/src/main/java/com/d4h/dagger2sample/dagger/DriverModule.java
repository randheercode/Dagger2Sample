package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Singleton
    @Provides
    Driver provideDriver() {
        return new Driver(driverName);
    }
}