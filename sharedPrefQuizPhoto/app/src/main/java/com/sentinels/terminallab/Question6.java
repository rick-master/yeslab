package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question6 extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button op11,op12,f3;
    ImageView im1,im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        preferences = getPreferences(MODE_PRIVATE);
        editor = preferences.edit();

        Intent intent = getIntent();
        final int[] score = new int[1];

        score[0] = intent.getIntExtra("score",0);



        op11 = (Button) findViewById(R.id.op11);
        op12 = (Button) findViewById(R.id.op12);
        im1 = (ImageView) findViewById(R.id.imageView6);
        im2 = (ImageView) findViewById(R.id.imageView12);
        f3 = (Button) findViewById(R.id.f3);

        op11.setVisibility(View.GONE);
        op12.setVisibility(View.GONE);


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

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("Participant 3 :",String.valueOf(score[0]));
                editor.commit();
            }
        });
    }
}