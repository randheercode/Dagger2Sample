package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Singleton
    @Provides
    static Driver provideRims() {
        return new Driver();
    }
}