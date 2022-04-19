package com.example.listviewdemo;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.listView);

        ArrayList<String> myFriends = new ArrayList<String>(asList("John","Paul","Sewan","Liaya"));
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Tuhin");
        myFamily.add("Bozzo");
        myFamily.add("Dragon");
        myFamily.add("Hulk");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        //myListView.setAdapter(arrayAdapter);
        myListView.setAdapter(arrayAdapter1);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //adapterView.setVisibility(View.GONE);
                //Log.i("Person tapped : ",myFamily.get(position));
                Toast.makeText(getApplicationContext(), "Hello "+ myFriends.get(position), Toast.LENGTH_LONG).show();
            }
        });

    }
}