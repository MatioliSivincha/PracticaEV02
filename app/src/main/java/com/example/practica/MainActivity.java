package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity{
    GridView gridViewImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        gridViewImagenes = findViewById(R.id.grid_view_imagenes);
        gridViewImagenes.setAdapter(new ImagenG(this));
    }
}