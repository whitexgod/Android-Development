package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Log.i("Info", myTextField.getText().toString());
    }
//
//    public void newCat(View view)
//    {
//        ImageView cat = (ImageView) findViewById(R.id.catImage);
//        cat.setImageResource(R.drawable.cat2);
//        Log.i("info","working!");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}