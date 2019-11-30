package com.example.myapplication05_web;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    EditText input;
    Button add, clear;
    ListView listview;
    ArrayAdapter<String> MyArrayAdapter;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    input = (EditText)findViewById(R.id.input);
        add = (Button)findViewById(R.id.add);
        clear = (Button)findViewById(R.id.clear);
        listview = (ListView)findViewById(R.id.list);

        MyArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listview.setAdapter(MyArrayAdapter);

        add.setOnClickListener(addOnClickListener);
        clear.setOnClickListener(clearOnClickListener);
    }

    private Button.OnClickListener addOnClickListener
            = new Button.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            String newInput = input.getText().toString();
            MyArrayAdapter.add(newInput);
            MyArrayAdapter.notifyDataSetChanged();
        }};

    private Button.OnClickListener clearOnClickListener
            = new Button.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            MyArrayAdapter.clear();
            MyArrayAdapter.notifyDataSetChanged();
        }};
}