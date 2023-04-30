package com.example.recetteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Switch darkMode = findViewById(R.id.switchdarkmode);
        //Mettre en dark Mode background
        darkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Background", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("background", Color.BLACK);
                editor.commit();
            }
        });
    }
}