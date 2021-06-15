package com.example.examplelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("VSKUMAR","First Activity Create");
        //To display the text on the Android monitor or monitor

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("VSKUMAR","First Activity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("VSKUMAR","First Activity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("VSKUMAR","First Activity Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("VSKUMAR","First Activity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("VSKUMAR","First Activity Destroy");
    }

    public void next(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }
}