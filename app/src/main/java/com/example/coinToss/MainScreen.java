package com.example.coinToss;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_layout);



    }

    public void callCoinToss(View view){
        Intent coinToss = new Intent(this,CoinToss.class);
        coinToss.putExtra("EXTRA_MESSAGE" , "");
        startActivity(coinToss);
    }

    public void callDice(View view){
        Intent dice = new Intent(this,Dice.class);
        //dice.putExtra("EXTRA_MESSAGE" , "");
        startActivity(dice);
    }
}
