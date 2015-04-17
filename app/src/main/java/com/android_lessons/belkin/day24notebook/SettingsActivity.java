package com.android_lessons.belkin.day24notebook;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Belkin on 17.04.2015.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
