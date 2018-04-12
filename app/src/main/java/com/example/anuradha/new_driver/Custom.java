package com.example.anuradha.new_driver;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by anuradha on 4/12/2018.
 */

public class Custom extends ArrayAdapter {
    String text[];
    String text2[];
    String text3[];
    String text4[];
    String text5[];
    String text6[];

    Activity activity;
    public Custom(Activity activity, String[] text, String[] text2, String[] text3, String[] text4, String[] text5,String[] text6) {
        super(activity,R.layout.custom_layout,text);
        this.text=text;
        this.text2=text2;
        this.text3=text3;
        this.text4=text4;
        this.text5=text5;
        this.text6=text6;
        this.activity=activity;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator=activity.getLayoutInflater();
        View v=inflator.inflate(R.layout.custom_layout,null);
//        ImageView imageview= (ImageView) v.findViewById(R.id.img);
        TextView t1= (TextView) v.findViewById(R.id.tv1);
//        imageview.setImageResource(image[position]);
        TextView t2= (TextView) v.findViewById(R.id.tv2);
        TextView t3= (TextView) v.findViewById(R.id.tv3);
        TextView t4= (TextView) v.findViewById(R.id.tv4);
        TextView t5= (TextView) v.findViewById(R.id.tv5);
        TextView t6= (TextView) v.findViewById(R.id.tv6);


        t2.setText(text2[position]);
        t1.setText(text[position]);
        t3.setText(text3[position]);
        t4.setText(text4[position]);
        t5.setText(text5[position]);
        t6.setText(text6[position]);
        return v;
    }
}

