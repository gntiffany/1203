package tw.org.iii.myapplication03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.time.Instant;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


    public void gotoMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("tiffany","Welcome die");
    }
}
