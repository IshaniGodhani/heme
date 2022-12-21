package com.example.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int[] theme_img={R.drawable.nature,R.drawable.christmas,R.drawable.cool,
            R.drawable.flower,R.drawable.music,R.drawable.sparkle};
    String[] theme_title={"Nature","Christmas","Cool","Flower","Music","SParkle"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}