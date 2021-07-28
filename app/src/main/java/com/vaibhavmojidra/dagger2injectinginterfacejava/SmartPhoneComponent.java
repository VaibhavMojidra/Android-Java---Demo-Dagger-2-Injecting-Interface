package com.vaibhavmojidra.dagger2injectinginterfacejava;

import dagger.Component;

@Component(modules = {NikonBatteryModule.class})
public interface SmartPhoneComponent {
    public SmartPhone getSmartPhone();
}
