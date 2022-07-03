package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button button1;
    private static final int CAMERA_REQUEST=1888;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button);
        imageview=(ImageView) findViewById(R.id.imageView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,CAMERA_REQUEST);
            }
        });

        imageview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                RotateAnimation rotateAnimation = new RotateAnimation(0.90f, 0.360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setRepeatCount(10);
                //rotateAnimation.setDuration(700);
                imageview.startAnimation(rotateAnimation);
            }
        });
    }

    protected  void onStart() {
        super.onStart();
        RotateAnimation rotateAnimation = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(100);
        rotateAnimation.setDuration(1000);
        imageview.startAnimation(rotateAnimation);
    }
    protected void onActivityResult(int Request_code,int result_code,Intent data) {

        super.onActivityResult(Request_code, result_code, data);
        if (Request_code==CAMERA_REQUEST)
        {
            Bitmap photo=(Bitmap) data.getExtras().get("data");
            imageview.setImageBitmap(photo);
        }
    }

}