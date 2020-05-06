package com.s.m.shahi.darkmodeimplement;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import java.util.Map;
import java.util.Set;

public class SettingsData {
    public static void setDarkMode(Context context, boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("darkMode", value);
        editor.apply();
    }

    public static boolean getDarkMode(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("darkMode", false);
    }
}
