package com.vaibhavmojidra.dagger2injectinginterfacejava;

import dagger.Module;
import dagger.Provides;

@Module
public class NikonBatteryModule {
    @Provides
    Battery provideNikonBattery(NikonBattery nikonBattery){
        return nikonBattery;
    }
}
