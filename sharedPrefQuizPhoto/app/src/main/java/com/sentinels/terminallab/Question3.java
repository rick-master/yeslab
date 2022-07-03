package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question3 extends AppCompatActivity {

    Button op5,op6,n2;
    ImageView im1,im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        final int[] score = {0};


        op5 = (Button) findViewById(R.id.op5);
        op6 = (Button) findViewById(R.id.op6);
        n2 = (Button) findViewById(R.id.n2);
        im1 = (ImageView) findViewById(R.id.imageView3);
        im2 = (ImageView) findViewById(R.id.imageView9);

        op5.setVisibility(View.GONE);
        op6.setVisibility(View.GONE);

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 0;
            }
        });

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 5;
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Question4.class);
                intent.putExtra("score",score[0]);
                startActivity(intent);
            }
        });
    }


}