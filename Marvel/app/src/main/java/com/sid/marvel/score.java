package com.sid.marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import static com.sid.marvel.Question.scorevalue;

public class score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Toast.makeText(this, ""+scorevalue, Toast.LENGTH_SHORT).show();
        scorevalue=0;
    }
}