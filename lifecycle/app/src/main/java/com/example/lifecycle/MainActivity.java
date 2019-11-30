package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottery = findViewById(R.id.lottery);
        Log.d("DEBUG", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.d("DEBUG", "onDestroy");
    }

    public void exit(View view) {
        finish();
        Log.d("DEBUG", "exit");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("DEBUG", "finish");
    }

    public void gotoPage2(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }
}






}
