package com.example.recetteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //recup header
    SearchView searchRef;
    ImageView addref;
    ImageView settingsref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recup par id
        addref = findViewById(R.id.imageView);
        settingsref = findViewById(R.id.imageView2);
        searchRef = findViewById(R.id.searchView);
        searchRef.clearFocus();

        //onclick buttons
        addref.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add Button", Toast.LENGTH_SHORT).show();
            };
        });
        settingsref.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Settings Button", Toast.LENGTH_SHORT).show();
        };
    });


}}