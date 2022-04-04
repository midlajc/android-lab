package com.midlajc.ipaddress;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.android_device_ip_address);
        WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
        String ipAddress = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
        textView.setText("Your Device IP Address: " + ipAddress);
    }
}