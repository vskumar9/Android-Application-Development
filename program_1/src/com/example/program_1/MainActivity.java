package com.example.program_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{ 
TextView hello1; 
Button display; 
@Override 
protected void onCreate(Bundle savedInstanceState) 
{ 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
hello1 = (TextView) findViewById(R.id.textView1); 
hello1.setText("HELLO MITS MCA"); 
display = (Button) findViewById(R.id.button1); 
display.setOnClickListener(new View.OnClickListener() 
{ 
@Override 
public void onClick(View arg0) 
{ 
Toast t = Toast.makeText(getApplicationContext(), "Sanjeev Kumar", 2000); 
t.show(); 
} 
}); 
} 
} 