package com.midlajc.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView lsV;
    String Array[]={"Algorithms","Data","Information","Computer","Android"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Array);
        lsV.setAdapter(arr);
    }

}