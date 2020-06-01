package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.engine.Engine;
import com.d4h.dagger2sample.deps.engine.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    // Only static method is allow now.
}
