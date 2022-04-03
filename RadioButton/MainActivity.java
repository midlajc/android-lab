package com.midlajc.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
    RadioGroup Gender;
    RadioButton Male,Female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gender=(RadioGroup)findViewById(R.id.radioGroup);
        Male=(RadioButton)findViewById(R.id.radioMale);
        Female=(RadioButton)findViewById(R.id.radioFemale);
        Gender.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if(Male.isChecked()){
                    Toast.makeText(getApplication(), "Yor are a Man!!", Toast.LENGTH_LONG).show();
                }
                if(Female.isChecked()){
                    Toast.makeText(getApplication(), "Yor are a Woman!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}