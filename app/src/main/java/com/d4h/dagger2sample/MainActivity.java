package com.d4h.dagger2sample;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.d4h.dagger2sample.dagger.CarComponent;
import com.d4h.dagger2sample.dagger.DaggerCarComponent;
import com.d4h.dagger2sample.dagger.DieselEngineModule;
import com.d4h.dagger2sample.deps.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(1000))
                .build();

        component.inject(this);

        car.drive();
    }
}