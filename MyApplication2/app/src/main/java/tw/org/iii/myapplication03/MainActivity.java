package tw.org.iii.myapplication03;

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
        Log.v("tiffany","Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.v("tiffany","onDestroy");
    }



}


