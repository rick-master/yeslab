package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question4 extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button op7,op8,f2;
    ImageView im1,im2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        preferences = getPreferences(MODE_PRIVATE);
        editor = preferences.edit();

        Intent intent = getIntent();
        final int[] score = new int[1];

        score[0] = intent.getIntExtra("score",0);


        op7 = (Button) findViewById(R.id.op7);
        op8 = (Button) findViewById(R.id.op8);
        f2 = (Button) findViewById(R.id.f2);
        im1 = (ImageView) findViewById(R.id.imageView4);
        im2 = (ImageView) findViewById(R.id.imageView10);

        op7.setVisibility(View.GONE);
        op8.setVisibility(View.GONE);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 5;
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 0;
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("Participant 2 :",String.valueOf(score[0]));
                editor.commit();
            }
        });
    }
}