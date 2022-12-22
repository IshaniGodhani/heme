package com.example.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int[] theme_img={R.drawable.nature,R.drawable.christmas,R.drawable.cool,
            R.drawable.flower,R.drawable.music,R.drawable.sparkle};
    String[] theme_title={"Nature","Christmas","Cool","Flower","Music","Sparkle"};

    ListView listView;
    ListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listAdapter=new ListAdapter(this,theme_img,theme_title);
        listView=findViewById(R.id.theme_list);
        listView.setAdapter(listAdapter);



    }
}