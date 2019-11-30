package tw.org.iii.myapplication1203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView MyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView = findViewById(R.id.MyView);

    }

    public void clear(View view){MyView.clear();}
    public void undo(View view){
        MyView.undo();
    }

   public void redo(View view){
        MyView.redo();

   }




}





