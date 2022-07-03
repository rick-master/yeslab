package com.sentinels.terminallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question1 extends AppCompatActivity {

    Button op1,op2,n1;
    ImageView imageView,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        final int[] score = {0};
        op1 = (Button) findViewById(R.id.op1);
        op2 = (Button) findViewById(R.id.op2);
        n1 = (Button) findViewById(R.id.n1);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView7);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 5;
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score[0] += 0;
            }
        });


        op1.setVisibility(View.GONE);
        op2.setVisibility(View.GONE);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Question2.class);
                intent.putExtra("score",score[0]);
                startActivity(intent);
            }
        });

    }
}