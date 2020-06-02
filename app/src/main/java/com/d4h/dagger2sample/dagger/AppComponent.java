package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
