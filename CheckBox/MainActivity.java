package com.midlajc.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    CheckBox c1,c2,c3,c4;
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.result);
        btn=(Button)findViewById(R.id.button1);
        c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);


    }
    public void Check(View v)
    {
        String msg="";

        if(c1.isChecked())
            msg = msg + "Malayalam\n ";
        if(c2.isChecked())
            msg = msg + "English \n";
        if(c3.isChecked())
            msg = msg + "Hindi\n";
        if(c4.isChecked())
            msg = msg + "Spanish\n";

        txt.setText(msg);
    }
}