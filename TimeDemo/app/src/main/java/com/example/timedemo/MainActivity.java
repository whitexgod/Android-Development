package com.example.timedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(20000, 1000){

            @Override
            public void onTick(long l) {
                //countdown is counting down (Every second)
                Log.i("Seconds left", String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                //Counter is finished after 20 seconds as per the given condition
                Log.i("Done!","Countdown finished.");
            }
        }.start();

        /*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Insert code to run every second
                Log.i("Runable has run!","A second must have passed...");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);
        */
    }
}