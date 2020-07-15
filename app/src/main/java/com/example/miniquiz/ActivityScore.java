package com.example.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityScore extends AppCompatActivity {
    Button map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent intent= getIntent();
        int i = intent.getIntExtra(quiz2.finalScore,0);

        com.github.lzyzsd.circleprogress.DonutProgress D = findViewById(R.id.donut_progress);

        D.setProgress(((float)i/2)*100);


    }
}