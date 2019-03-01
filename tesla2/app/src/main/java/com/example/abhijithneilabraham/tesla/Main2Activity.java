package com.example.abhijithneilabraham.tesla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main3);

            }
        });
    }*/
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i1);
            }
        });
        b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(i2);
            }
        });
        b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(i3);
            }

        });
        b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(i4);
            }
        });

    }
}
