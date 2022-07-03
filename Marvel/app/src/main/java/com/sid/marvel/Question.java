package com.sid.marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question extends AppCompatActivity {

    Button first,secon,third,four,five,submit;
   public static int scorevalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        first=findViewById(R.id.firstans);
        secon=findViewById(R.id.secondans);
        third=findViewById(R.id.thirdans);
        four=findViewById(R.id.fourans);

        five=findViewById(R.id.fiveans);
        submit=findViewById(R.id.Submit);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorevalue+=10;
            }
        });
        secon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorevalue+=10;
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorevalue+=10;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorevalue+=10;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorevalue+=10;
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),score.class));
            }
        });




    }
}