package com.example.remove.log.by.proguard;

import com.example.hello.proguard.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class HelloProGuardActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.d("PROGUARD_TEST", "TESTLOG");
    }
}