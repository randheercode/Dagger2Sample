package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.deps.Rims;
import com.d4h.dagger2sample.deps.Tires;
import com.d4h.dagger2sample.deps.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}