package com.example.rupeetodollarconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public void myFunc(View view)
    {
        ImageView currency = (ImageView) findViewById(R.id.imageView);
        currency.setImageResource(R.drawable.dollar);
        //Log.i("info","Clicked!");
        EditText cur = (EditText) findViewById(R.id.numberField);
        Double result = Double.parseDouble(cur.getText().toString());
        result = result * 0.013;

        Toast.makeText(MainActivity.this, "$ "+result , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}