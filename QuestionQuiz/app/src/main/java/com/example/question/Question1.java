package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import static com.example.question.MainActivity.scorevalue;

public class Question1 extends AppCompatActivity {

    private Button first,second,third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        first=findViewById(R.id.firstans);
        second=findViewById(R.id.secondans);
        third=findViewById(R.id.thirdans);

        first.setOnClickListener(view -> {
            scorevalue=scorevalue+1;
            Intent i=new Intent(getApplicationContext(),Question2.class);
            startActivity(i);
        });
        second.setOnClickListener(view -> {
            //scorevalue=scorevalue+1;
            Intent i=new Intent(getApplicationContext(),Question2.class);
            startActivity(i);
        });
        third.setOnClickListener(view -> {
            //scorevalue=scorevalue+1;
            Intent i=new Intent(getApplicationContext(),Question2.class);
            startActivity(i);
        });
    }
}