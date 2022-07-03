package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question5 extends AppCompatActivity {

    Button op9,op10,n3;
    ImageView im1,im2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        final int[] score = {0};


        op9 = (Button) findViewById(R.id.op9);
        op10 = (Button) findViewById(R.id.op10);
        n3 = (Button) findViewById(R.id.n3);
        im1 = (ImageView) findViewById(R.id.imageView5);
        im2 = (ImageView) findViewById(R.id.imageView11);


        op9.setVisibility(View.GONE);
        op10.setVisibility(View.GONE);

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

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Question6.class);
                intent.putExtra("score",score[0]);
                startActivity(intent);
            }
        });
    }
}