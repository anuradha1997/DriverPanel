package com.example.anuradha.new_driver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

public class Fifth_Activity extends AppCompatActivity {
    TabHost t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView l1;
        String text[]={"Name","Name","Name"};
        String text2[]={"Source","Source","Source"};
        String text3[]={"Destination","Destination","Destination"};
        String text4[]={"Distance","Distance","Distance"};
        String text5[]={"Date","Date","Date"};
        String text6[]={"Time","Time","Time"};

        setContentView(R.layout.activity_fifth_);
        t1= (TabHost) findViewById(R.id.myTab);
        t1.setup();
        TabHost.TabSpec tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("Daily");
        tabSpec.setContent(R.id.tab1);
        t1.addTab(tabSpec);
        tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("Weekly");
        tabSpec.setContent(R.id.tab2);
        t1.addTab(tabSpec);
        tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("Monthly");
        tabSpec.setContent(R.id.tab3);
        t1.addTab(tabSpec);
        l1= (ListView) findViewById(R.id.lg1);
        Custom adapter=new Custom(this,text,text2,text3,text4,text5,text6);
        l1.setAdapter(adapter );
        l1= (ListView) findViewById(R.id.lg2);
        Custom adap=new Custom(this,text,text2,text3,text4,text5,text6);
        l1.setAdapter(adap );
        l1= (ListView) findViewById(R.id.lg3);
        Custom adapt=new Custom(this,text,text2,text3,text4,text5,text6);
        l1.setAdapter(adapt );



    }
}
