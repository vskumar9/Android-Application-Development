package com.example.program_4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity { 
EditText et1, et2, et3; 
Button b1, b2, b3, b4; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
et1 = (EditText) findViewById(R.id.editText1); 
et2 = (EditText) findViewById(R.id.editText2); 
et3 = (EditText)findViewById(R.id.editText3); 
b2 = (Button) findViewById(R.id.button1); 
b1 = (Button) findViewById(R.id.button2); 
b3 = (Button) findViewById(R.id.button3); 
b4 = (Button) findViewById(R.id.button4); 
b1.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View arg0) { 
// TODO Auto-generated method stub 
String f = et1.getText().toString(); 
int i = Integer.parseInt(f); 
String s = et2.getText().toString(); 
int j = Integer.parseInt(s); 
Integer result = i + j; 
String res = result.toString(); 
et3.setText(res); 
} 
}); 
b2.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View arg0) { 
// TODO Auto-generated method stub 
String f = et1.getText().toString(); 
int i = Integer.parseInt(f); 
String s = et2.getText().toString(); 
int j = Integer.parseInt(s); 
Integer result = i - j; 
String res = result.toString(); 
et3.setText(res); 
} 
}); 
b3.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View arg0) { 
// TODO Auto-generated method stub 
String f = et1.getText().toString(); 
int i = Integer.parseInt(f); 
String s = et2.getText().toString(); 
int j = Integer.parseInt(s); 
Integer result = i * j; 
String res = result.toString(); 
et3.setText(res); 
} 
}); 
b4.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View arg0) { 
// TODO Auto-generated method stub 
String f = et1.getText().toString(); 
int i = Integer.parseInt(f); 
String s = et2.getText().toString(); 
int j = Integer.parseInt(s); 
Integer result = i / j; 
String res = result.toString(); 
et3.setText(res); 
} 
}); 
}}