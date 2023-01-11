package com.example.program_2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity { 
Button btn1; 
EditText et1; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
btn1 = (Button) findViewById(R.id.button1); 
et1 = (EditText) findViewById(R.id.editText1); 
btn1.setOnClickListener(new OnClickListener() { 
public void onClick(View arg0) 
{ 
// TODO Auto-generated method stub 
InputMethodManager imm = (InputMethodManager) 
getSystemService(Context.INPUT_METHOD_SERVICE); 
imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0); } 
}); 
}}