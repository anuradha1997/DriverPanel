package com.example.anuradha.new_driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Third_Activity extends AppCompatActivity {
    TextView t1, t2, t3;
    Button b1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);
        t1 = (TextView) findViewById(R.id.tg1);
        t1 = (TextView) findViewById(R.id.tg2);
        t3 = (TextView) findViewById(R.id.tg3);
        Button b1 = (Button) findViewById(R.id.bg1);
        EditText e1 = (EditText) findViewById(R.id.eg1);
        EditText e2 = (EditText) findViewById(R.id.eg2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Third_Activity.this,Fifth_Activity.class);
                startActivity(i);

            }
        });
    }
}
