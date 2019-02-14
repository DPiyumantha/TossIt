package com.example.coinToss;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Dice extends AppCompatActivity {
    int pAtmpt1;
    int pAtmpt2;
    int attempts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_screen);
        Intent sender = getIntent();
        setDiceFace((ImageView) findViewById(R.id.imageView),6);
        setDiceFace((ImageView) findViewById(R.id.imageView2),6);

    }

    public void rollThem(View view){
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(100);
        ImageView p1Img = findViewById(R.id.imageView);
        ImageView p2Img = findViewById(R.id.imageView2);
        TextView label = findViewById(R.id.textView3);
        int p1= (int) (Math.random()*6 +1);
        int p2= (int) (Math.random()*6 +1);
        attempts++;

        setDiceFace(p1Img,p1);
        setDiceFace(p2Img,p2);
        if (p1>p2){
            pAtmpt1++;
            label.setText(R.string.p1win);
        }else if(p2>p1){
            pAtmpt2++;
            label.setText(R.string.p2win);
        }else{
            label.setText(R.string.draw);
        }

    }

    public void setDiceFace(ImageView i , int n){
        switch (n){
            case 1:
                i.setImageResource(R.drawable.d1);
                break;
            case 2:
                i.setImageResource(R.drawable.d2);
                break;
            case 3:
            i.setImageResource(R.drawable.d3);
                break;
            case 4:
                i.setImageResource(R.drawable.d4);
                break;
            case 5:
                i.setImageResource(R.drawable.d5);
                break;
            case 6:
                i.setImageResource(R.drawable.d6);
                break;
        }
    }
}
