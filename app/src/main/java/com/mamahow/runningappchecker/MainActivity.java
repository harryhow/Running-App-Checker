package com.mamahow.runningappchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RunningAppChecker";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind service
//        Intent bindIntent = new Intent(this, MyService.class);
//        bindService(bindIntent, connection, BIND_AUTO_CREATE);

        // simple service start
        Intent startIntent = new Intent(this, MyService.class);
        startService(startIntent);

    }
}
