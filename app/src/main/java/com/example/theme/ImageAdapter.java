package com.example.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    String title;
    int[] temp;
    TextView textView;
    ImageView imageView;
    Context context;
    public ImageAdapter(Context context, int[] temp, String title) {

        this.context=context;
        this.title=title;
        this.temp=temp;


    }

    @Override
    public int getCount() {
        return temp.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= LayoutInflater.from(context).inflate(R.layout.img_category,viewGroup,false);
        textView=view.findViewById(R.id.list_title);
        imageView=view.findViewById(R.id.list_img);

        textView.setText(title);
        imageView.setImageResource(temp[i]);
        return view;
    }
}
