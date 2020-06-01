package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.engine.DieselEngine;
import com.d4h.dagger2sample.deps.engine.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
