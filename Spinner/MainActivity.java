package com.midlajc.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String array[]={"Malayalam","Tamil","Hindi","Kannada"};
        spin=(Spinner)findViewById(R.id.spinLanguage);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,array);
        spin.setAdapter(adapter);
    }



}