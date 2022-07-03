package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.question.MainActivity.scorevalue;

public class Result extends AppCompatActivity {

    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        t1=findViewById(R.id.textView);
        t1.setText(String.valueOf(scorevalue));
        Toast.makeText(this, ""+scorevalue, Toast.LENGTH_SHORT).show();
        scorevalue=0;

    }
}