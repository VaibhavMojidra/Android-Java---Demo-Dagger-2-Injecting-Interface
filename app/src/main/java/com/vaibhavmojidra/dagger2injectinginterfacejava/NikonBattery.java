package com.vaibhavmojidra.dagger2injectinginterfacejava;

import android.util.Log;

import javax.inject.Inject;

public class NikonBattery implements Battery {

    @Inject
    public NikonBattery() {
    }

    @Override
    public void getPowerAvailability() {
        Log.i("MyInfo","Power is available");
    }
}
