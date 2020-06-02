package com.d4h.dagger2sample;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.d4h.dagger2sample.dagger.ActivityComponent;
import com.d4h.dagger2sample.deps.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((Dagger2SampleApplication) getApplication()).getComponent()
                .getActivityComponentBuilder()
                .horsePower(232)
                .engineCapacity(3243)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}