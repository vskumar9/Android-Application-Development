package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name,number,link,open_chrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);
        open_chrome=findViewById(R.id.open_chrome);

    }

    public void send(View view) {
        String n=name.getText().toString();
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("key",n);
        startActivities(i);


    }

    public void call(View view) {
    }

    public void search(View view) {
    }

    public void welcome(View view) {
    }
}