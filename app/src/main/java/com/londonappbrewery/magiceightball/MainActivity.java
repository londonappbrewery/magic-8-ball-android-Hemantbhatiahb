package com.londonappbrewery.magiceightball;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askb =(Button) findViewById(R.id.ask_button);
      final  ImageView decision_im= (ImageView) findViewById(R.id.decision_image);

       final int arr[]={R.drawable.ball1,
                   R.drawable.ball2,
                   R.drawable.ball3,
                   R.drawable.ball4,
                   R.drawable.ball5};

        askb.setOnClickListener(new View.OnClickListener()
        {

            @SuppressLint("LongLogTag")
            public void onClick(View v)
            {
                Random rand=new Random();
                int num=rand.nextInt(5);
               Log.d("magic-8-ball-android-Hemantbhatiahb", " the number is :"+ num);
               decision_im.setImageResource(arr[num]);
            }



        });
    }
}
