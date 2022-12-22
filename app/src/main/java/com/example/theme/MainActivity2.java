package com.example.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int[] nature={R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,
                R.drawable.n5,R.drawable.n6,R.drawable.n7,R.drawable.n8,
                R.drawable.n9,R.drawable.n10};
        int[] christmas={R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,
                R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8,
                R.drawable.c9,R.drawable.c10};
    }
}