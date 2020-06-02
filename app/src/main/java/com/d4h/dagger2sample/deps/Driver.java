package com.d4h.dagger2sample.deps;

public class Driver {
    // Can't use inject here, third party.

    String name;

    public Driver(String name) {
        this.name = name;
    }

}
