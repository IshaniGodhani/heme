package com.example.theme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    int[] theme_img;
    String[] theme_title;
    MainActivity mainActivity;
    ImageView imageView;
    TextView textView;
    public ListAdapter(MainActivity mainActivity, int[] theme_img, String[] theme_title) {
        this.theme_img=theme_img;
        this.theme_title=theme_title;
        this.mainActivity=mainActivity;

    }

    @Override
    public int getCount() {
        return theme_img.length;
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
        view= LayoutInflater.from(mainActivity).inflate(R.layout.theme_category,viewGroup,false);
        imageView=view.findViewById(R.id.theme_img);
        textView=view.findViewById(R.id.theme_title);

        textView.setText(theme_title[i]);
        imageView.setImageResource(theme_img[i]);
        return view;
    }
}
