package com.example.abhijithneilabraham.electricalcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttona=findViewById(R.id.facilities);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inta=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(inta);
            }
        });
        Button buttonb=findViewById(R.id.contact);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intb=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intb);
            }
        });
    }
}
