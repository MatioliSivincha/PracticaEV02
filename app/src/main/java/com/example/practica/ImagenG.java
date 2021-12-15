package com.example.practica;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImagenG extends BaseAdapter {

    private Context context;
    public int[] imagenesA = {
            R.drawable.coliseo,
            R.drawable.huacachina,
            R.drawable.piramide,
            R.drawable.paracas,
            R.drawable.huanchaco,
            R.drawable.banos,
    };

    public ImagenG(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return imagenesA.length;
    }

    @Override
    public Object getItem(int position) {
        return imagenesA[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imagenesA[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        340,
                        350
                ));

        return imageView;
    }
}
