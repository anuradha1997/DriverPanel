package com.example.anuradha.new_driver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Fourth_Activity extends AppCompatActivity {
    ListView l1;
    String text[]={"Name","Name","Name"};
    String text2[]={"Source","Source","Source"};
    String text3[]={"Destination","Destination","Destination"};
    Integer image[]={R.drawable.whatsapp,R.drawable.whatsapp,R.drawable.whatsapp};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);
        l1= (ListView) findViewById(R.id.lg);
        CustomAdapter adapter=new CustomAdapter(this,text,text2,text3,image);
        l1.setAdapter(adapter );

    }
}
