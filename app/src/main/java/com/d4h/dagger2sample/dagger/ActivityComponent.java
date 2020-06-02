package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.MainActivity;
import com.d4h.dagger2sample.deps.Car;
import com.d4h.dagger2sample.deps.engine.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("HorsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("EngineCapacity") int engineCapacity);

        ActivityComponent build();
    }
}