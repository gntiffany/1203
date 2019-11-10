package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onResume");
        }
}
