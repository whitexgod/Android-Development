package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int flag = 1;
    public void myFunc(View view)
    {
        ImageView naruto = (ImageView) findViewById(R.id.imageView);
        if(flag==1)
        {
            naruto.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
            flag=0;
        }
        else
        {
            naruto.animate().scaleX(1f).scaleY(1f).setDuration(2000);
            flag=1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView naruto = (ImageView) findViewById(R.id.imageView);
        naruto.animate().alpha(1f).setDuration(2000);
    }
}