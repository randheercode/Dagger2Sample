package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.MainActivity;
import com.d4h.dagger2sample.deps.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("HorsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("EngineCapacity") int engineCapacity);

        CarComponent build();
    }
}