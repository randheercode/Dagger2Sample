package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.engine.DieselEngine;
import com.d4h.dagger2sample.deps.engine.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
