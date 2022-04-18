package com.example.textfielddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void myFunction(View view)
    {
        //Toast.makeText(MainActivity.this, "Hi" , Toast.LENGTH_LONG).show();

        EditText user = (EditText) findViewById(R.id.userName);
        EditText pass = (EditText)  findViewById(R.id.passWord);

        //Log.i("Username : ", user.getText().toString());
        Toast.makeText(MainActivity.this, "Hi " + user.getText().toString() + "!" , Toast.LENGTH_SHORT).show();
        Log.i("Password :", pass.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}