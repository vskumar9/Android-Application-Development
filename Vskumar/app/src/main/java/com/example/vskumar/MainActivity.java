package com.example.vskumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button stop,start,toast;
    TextView tv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    stop=findViewById(R.id.stop);
    start=findViewById(R.id.start);
    toast=findViewById(R.id.toast);
    tv=findViewById(R.id.tv);
    toast.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,
                    "welcome_to app your count is "+i, Toast.LENGTH_SHORT).show();
                    }
    });
    start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i++;
            tv.setText(""+i);
        }
    });
    stop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i--;;
          tv.setText(String.valueOf(i));
        }
    });

    }
}