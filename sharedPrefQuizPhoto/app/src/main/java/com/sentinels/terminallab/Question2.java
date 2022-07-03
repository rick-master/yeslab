package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question2 extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button op3,op4,f1;
    ImageView im1,im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        preferences = getPreferences(MODE_PRIVATE);
        editor = preferences.edit();

        Intent intent = getIntent();
        final int[] score = new int[1];

        score[0] = intent.getIntExtra("score",0);


        op3 = (Button) findViewById(R.id.op3);
        op4 = (Button) findViewById(R.id.op4);
        f1 = (Button) findViewById(R.id.f1);
        im1 = (ImageView) findViewById(R.id.imageView2);
        im2 = (ImageView) findViewById(R.id.imageView8);

        op3.setVisibility(View.GONE);
        op4.setVisibility(View.GONE);


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

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("Participant 1 :",String.valueOf(score[0]));
                editor.commit();
            }
        });
    }
}