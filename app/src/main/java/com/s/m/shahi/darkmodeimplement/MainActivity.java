package com.s.m.shahi.darkmodeimplement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button lightMode, nightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (SettingsData.getDarkMode(this)) {
            Toast.makeText(this, "Dark", Toast.LENGTH_SHORT).show();
            //true its means dark
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            Toast.makeText(this, "Light", Toast.LENGTH_SHORT).show();
            //false its means light
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        lightMode = (Button) findViewById(R.id.lightMode);
        nightMode = (Button) findViewById(R.id.nightMode);

        lightMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Light Enable", Toast.LENGTH_SHORT).show();
                SettingsData.setDarkMode(MainActivity.this, false);
                onRestart();
            }
        });

        nightMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dark Enable", Toast.LENGTH_SHORT).show();
                SettingsData.setDarkMode(MainActivity.this, true);
                onRestart();
            }
        });
    }
}
