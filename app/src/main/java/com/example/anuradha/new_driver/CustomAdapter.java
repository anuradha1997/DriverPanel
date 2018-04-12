package com.example.anuradha.new_driver;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by anuradha on 4/11/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    String text[];
    String text2[];
    String text3[];
    Integer image[];
    Activity activity;



    public CustomAdapter(Activity activity, String[] text, String[] text2,String[] text3,Integer[] image) {
        super(activity,R.layout.customize_layout,text);
        this.text=text;
        this.text2=text2;
        this.text3=text3;
        this.image=image;
        this.activity=activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator=activity.getLayoutInflater();
        View v=inflator.inflate(R.layout.customize_layout,null);
//        ImageView imageview= (ImageView) v.findViewById(R.id.img);
        TextView textview= (TextView) v.findViewById(R.id.tv1);
//        imageview.setImageResource(image[position]);
        TextView t= (TextView) v.findViewById(R.id.tv2);
        TextView tv= (TextView) v.findViewById(R.id.tv3);
        ImageView imageView= (ImageView) v.findViewById(R.id.img);
        imageView.setImageResource(image[position]);

        tv.setText(text3[position]);
        textview.setText(text[position]);
        t.setText(text2[position]);
        return v;
    }
}
