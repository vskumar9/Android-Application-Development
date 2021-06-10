package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,number,link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);

            }

    public void send(View view) {

        //we will Implement Explicit Intent
       String n= name.getText().toString();
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("key",n);
        startActivity(i);

    }

    public void call(View view) {
        String num=number.getText().toString();
        Uri u =Uri.parse("tel:"+num);
        Intent i=new Intent(Intent.ACTION_DIAL);
        startActivity(i);
    }

    public void search(View view) {
        String lin=link.getText().toString();
        Uri u=Uri.parse("https://"+lin);
        Intent i=new Intent(Intent.ACTION_SEARCH);
        startActivity(i);
    }
}