package com.example.darkroom.basecontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent=new Intent(this,DispMsgActivity.class);
        EditText editText=(EditText)findViewById(R.id.editText);
        String msg=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,msg);
        startActivity(intent);

            }
}
