package com.example.hp.myappprefer2;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by hp on 27-06-2017.
 */

public class PrefsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle saveInstantState)
    {
        super.onCreate(saveInstantState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
