package com.example.recetteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AddRecette extends AppCompatActivity {
    // Variable type recette
    TextView textViewSelectType;
    boolean[] selectedType;
    ArrayList<Integer> langList = new ArrayList<>();
    String[] langArray = {"Petit-dej", "Plat", "Apero", "C", "Python", "Javascript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recette);
    }
}