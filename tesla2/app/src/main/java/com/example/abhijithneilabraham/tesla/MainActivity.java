package com.example.abhijithneilabraham.tesla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewGroup transitionsContainer = (ViewGroup) findViewById(R.id.transitioned);
        final TextView text = (TextView) transitionsContainer.findViewById(R.id.text1);
        final Button button = (Button) transitionsContainer.findViewById(R.id.button1);;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                

                setContentView(R.layout.activity_main2);



            }
        });
    }
}
