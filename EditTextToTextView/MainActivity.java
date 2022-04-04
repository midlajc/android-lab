package com.midlajc.edittexttotextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName  = (EditText) findViewById(R.id.editName);
        result = (TextView) findViewById(R.id.tvResult);
        editName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String name = editName.getText().toString();
                result.setText("Text:\t" + name);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
