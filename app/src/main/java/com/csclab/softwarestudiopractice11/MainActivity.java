package com.csclab.softwarestudiopractice11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: (1) Find the UI element on xml file
        send = (Button)findViewById(R.id.button);
        edt = (EditText)findViewById(R.id.text);

        send.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                sendName();
            }
        });
    }

    public void sendName(){

        // TODO:  (1) Use intent and Bundle to pass string
        // TODO:  (2) Change activity to Activity2

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        String name = edt.getText().toString();

        intent.setClass(MainActivity.this, Activity2.class);
        bundle.putString("name", name);
        intent.putExtras(bundle);
        startActivity(intent);
    }



}
