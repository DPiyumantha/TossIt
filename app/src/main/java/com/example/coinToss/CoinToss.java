package com.example.coinToss;


import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class CoinToss extends AppCompatActivity {
    int totalAttempts = 0;
    int headWins =0;
    int tailWins =0;
    String msg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent sender = getIntent();


    }

        public void tossIt(View view){
            Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibe.vibrate(100);
            TextView attempts = findViewById(R.id.textView2);
            totalAttempts++;

            ImageView image = findViewById(R.id.imageView);
            int i = (int)Math.floor(Math.random()*2) +1;
            TextView tv =findViewById(R.id.textView);
            if(i%2 == 0) {
                image.setImageResource(R.drawable.tail);
                msg= "Now it's Tails\n";
                tailWins++;
            }else {
                image.setImageResource(R.drawable.head);
                msg ="Now it's Heads\n";
                headWins++;
            }

            if(tailWins>headWins){
                tv.setText(getString(R.string.twin) +"<"+tailWins+"/"+totalAttempts+">");
            }else if(headWins>tailWins){
                tv.setText(getString(R.string.hwin) +"<"+headWins+"/"+totalAttempts+">");
            }else{
                tv.setText(getString(R.string.draw) +"<"+totalAttempts+">");
            }

            msg+= "\nHead wins : "+headWins+"\nTail wins : "+tailWins+"\nTotal Attempts : "+totalAttempts;
            attempts.setText(msg);
    }
}
