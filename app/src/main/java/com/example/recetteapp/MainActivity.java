package com.example.recetteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //recup header
    SearchView searchRef;
    ImageView addref;
    ImageView settingsref;
    Button petitdejButton;
    Button entreesButton;
    Button platsButton;
    Button aperosButton;
    Button boissonsButton;
    Button dessertsButton;

    boolean petitdejButtonState = false;
    boolean entreesButtonState = false;
    boolean platsButtonState = false;
    boolean aperosButtonState = false;
    boolean boissonsButtonState = false;
    boolean dessertsButtonState = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recup par id
        addref = findViewById(R.id.add);
        settingsref = findViewById(R.id.options);
        searchRef = findViewById(R.id.searchView);
        searchRef.clearFocus();
        petitdejButton = findViewById(R.id.petitdej);
        entreesButton = findViewById(R.id.entrees);
        platsButton = findViewById(R.id.plats);
        aperosButton = findViewById(R.id.aperos);
        boissonsButton = findViewById(R.id.boissons);
        dessertsButton = findViewById(R.id.desserts);





        //onclick buttons
        addref.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToAddRecette = new Intent(MainActivity.this, AddRecette.class);
                startActivity(goToAddRecette);
            };
        });
        settingsref.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent goToOptions = new Intent(MainActivity.this, Options.class);
            startActivity(goToOptions);
        };

        });
        // A OPTIMISER (avec fragments ou drawable)
        // Onclick pour les boutons du header de la page home
        petitdejButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(petitdejButtonState == true){
                    petitdejButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    petitdejButtonState = false;
                } else {
                    petitdejButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    petitdejButtonState = true;
                }

            };

        });
        entreesButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(entreesButtonState == true){
                    entreesButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    entreesButtonState = false;
                } else {
                    entreesButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    entreesButtonState = true;
                }

            };

        });
        platsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(platsButtonState == true){
                    platsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    platsButtonState = false;
                } else {
                    platsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    platsButtonState = true;
                }

            };

        });
        aperosButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(aperosButtonState == true){
                    aperosButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    aperosButtonState = false;
                } else {
                    aperosButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    aperosButtonState = true;
                }

            };

        });
        boissonsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(boissonsButtonState == true){
                    boissonsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    boissonsButtonState = false;
                } else {
                    boissonsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    boissonsButtonState = true;
                }

            };

        });
        dessertsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(dessertsButtonState == true){
                    dessertsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    dessertsButtonState = false;
                } else {
                    dessertsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    dessertsButtonState = true;
                }

            };

        });
}}