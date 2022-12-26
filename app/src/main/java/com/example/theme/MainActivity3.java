package com.example.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int pos;
    int[] temp;
    String title;
    TextView textView1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView=findViewById(R.id.image);
        textView1=findViewById(R.id.text);

        pos=getIntent().getIntExtra("pos",pos);
        temp=getIntent().getIntArrayExtra("temp");
        title=getIntent().getStringExtra("title");
        textView1.setText(title);
        imageView.setImageResource(temp[pos]);

    }
}