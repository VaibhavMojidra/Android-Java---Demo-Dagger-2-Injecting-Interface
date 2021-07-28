package com.vaibhavmojidra.dagger2injectinginterfacejava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerSmartPhoneComponent.create().getSmartPhone().startCallRecording();// Injecting via dagger 2
    }
}