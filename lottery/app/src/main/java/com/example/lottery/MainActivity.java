package com.example.lottery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private TextView lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottery = (TextView)findViewById(R.id.lottery);
    }

    public void createLottery(View view){
        HashSet<Integer> set = new HashSet<>();
        while(set.size()<6){
             set.add((int)(Math.random()*49+1));
        }

        lottery.setText(set.toString());

    }



}
