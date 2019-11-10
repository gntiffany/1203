package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottery = findViewById(R.id.lottery);
        Log.v("tiffany","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lottery.setText("" + (int)(Math.random()*49+1));
        Log.v("tiffany","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("tiffany","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("tiffany","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("tiffany","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("tiffany","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("tiffany","onDestroy");

        Intent intent= new Intent(this,Page2Activity,class);
        startActivity(intent);

    }


}
