package com.example.examplelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("VSKUMAR","2 Activity Create");
        //To display the text on the Android monitor or monitor
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("VSKUMAR","2 Activity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("VSKUMAR","2 Activity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("VSKUMAR","2 Activity Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("VSKUMAR","2 Activity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("VSKUMAR","2 Activity Destroy");
    }

}