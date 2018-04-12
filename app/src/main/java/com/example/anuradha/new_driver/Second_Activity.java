package com.example.anuradha.new_driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    Button b1,b2;
    ImageView i1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        t1= (TextView) findViewById(R.id.tg1);
        i1= (ImageView) findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Second_Activity.this,Fourth_Activity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Second_Activity.this,Third_Activity.class);
                startActivity(i1);
            }
        });

    }
}
