package com.example.program_3_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
    	 setContentView(R.layout.activity_main);
    	 b1 = (Button) findViewById(R.id.button1);
    	 b1.setOnClickListener(new View.OnClickListener() {
    	 @Override
    	 public void onClick(View v) {
    	 Toast.makeText(MainActivity.this,"You just Toasted me!!!",Toast.LENGTH_LONG).show();
    	 /*Another way to display a Toast message
    	 Toast t=Toast.makeText(MainActivity.this,"You just Toasted 
    	me!!!",Toast.LENGTH_LONG);
    	 t.show();*/
    	 }
    	 });
    	 }
    
}
