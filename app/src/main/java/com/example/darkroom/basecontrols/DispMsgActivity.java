package com.example.darkroom.basecontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DispMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_msg);
        Intent intent=getIntent();
        String msg=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText(msg);

    }
}
