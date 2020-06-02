package com.d4h.dagger2sample.dagger;

import com.d4h.dagger2sample.MainActivity;
import com.d4h.dagger2sample.deps.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create(@BindsInstance @Named("HorsePower") int horsePower,
                                 @BindsInstance @Named("EngineCapacity") int engineCapacity);
    }
}