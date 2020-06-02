package com.d4h.dagger2sample.deps.engine;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("HorsePower") int horsePower, @Named("EngineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started." +
                "\nHorse Power " + horsePower + "" +
                "\nEngine Capacity: " + engineCapacity);
    }
}
