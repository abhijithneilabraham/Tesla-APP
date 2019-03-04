package com.example.abhijithneilabraham.tesla;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//Button b2,b3,b4,b5;
//Context con;
//View.OnClickListener mylistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView=findViewById(R.id.list1);
        String[] values=new String[] {"About Department","TESLA","EEE study materials","Route MAP"};


// Create the adapter to convert the array to views
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_main2, values);
// Attach the adapter to a ListView
        ListView list1 = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);

    }
}
