package com.example.hw05_20191112;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SimpleAdapter adapter;
    private LinkedList<HashMap<String,String>> data;
    private String[] from={"title","mesg"};
    private int[] to={R.id.item_title,R.id.item_mesg};
    private View add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add = findViewById(R.id.add);
        listView=findViewById(R.id.listview);
        initListView();}



    private void initListView(){
        data= new LinkedList<>();
        for (int i=0;i<10;i++) {
            HashMap<String, String> dd = new HashMap<>();
            int rand = (int) (Math.random() * 49 + 1);
            dd.put(from[0], "Title:" + rand);
            dd.put(from[1], "Contact" + rand);
            dd.put("detail", "Detail" + rand);
            data.add(dd);
        }
        adapter = new SimpleAdapter(this,data,R.layout.activity_item_hw05,from,to);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                StringBuffer sb = new StringBuffer();
                sb.append("Title:"+data.get(position).get("title")+"\n");
                sb.append("Mesg:"+data.get(position).get("mesg")+"\n");
                sb.append("Detail:"+data.get(position).get("detail")+"\n");
                displayDetail(sb.toString());
            }
        });





        }




        private void displayDetail(String mesg){
        new AlertDialog.Builder(this).setMessage(mesg).create().show();




    }
}
