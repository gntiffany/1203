package com.example.hw04_20191111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view) {
    counter++;
    String strInput=input.getText().toString();
    if (!isRightNumber(strInput)){
        return;
    }

    String result = checkAB(strInput);

        log.append(counter+":"+strInput+"=>"+result+ "\n");

        if (result.equals(dig +"A0B")){

        }




    }

    public void newGame(View view) {
    }

    public void setting(View view) {
    }

    public void exit(View view) {
    }
}
