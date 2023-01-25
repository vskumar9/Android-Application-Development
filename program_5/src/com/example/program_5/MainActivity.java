package com.example.program_5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
Button 
clear,div,mul,sub,dot,equal,add,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
float Res1,Res2;
boolean Add,Sub,Mul,Div;
EditText ed1;
TextView tv1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ed1 = (EditText)findViewById(R.id.editText1);
tv1 = (TextView)findViewById(R.id.textView1);
btn0 = (Button)findViewById(R.id.button4);
btn1 = (Button)findViewById(R.id.Button05);
btn2 = (Button)findViewById(R.id.Button11);
btn3 = (Button)findViewById(R.id.Button10);
btn4 = (Button)findViewById(R.id.Button08);
btn5 = (Button)findViewById(R.id.Button07);
btn6 = (Button)findViewById(R.id.Button04);
btn7 = (Button)findViewById(R.id.button2);
btn8 = (Button)findViewById(R.id.Button02);
btn9 = (Button)findViewById(R.id.Button01);
clear = (Button)findViewById(R.id.button1);
div = (Button)findViewById(R.id.Button06);
mul = (Button)findViewById(R.id.button5);
sub = (Button)findViewById(R.id.Button09);
dot = (Button)findViewById(R.id.button3);
equal = (Button)findViewById(R.id.Button03);
add = (Button)findViewById(R.id.button6);
btn1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"1");
}
});
btn2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"2");
}
});
btn3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"3");
}
});
btn4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"4");
}
});
btn5.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"5");
}
});
btn6.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"6");
}
});
btn7.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"7");
}
});
btn8.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"8");
}
});
btn9.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"9");
}
});
btn0.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+"0");
}
});
dot.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText(ed1.getText()+".");
}
});
add.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
if(ed1==null){
ed1.setText("");
} else {
Res1=Float.parseFloat(ed1.getText()+"");
Add=true;
tv1.setText(ed1.getText());
ed1.setText(null);
}
}
});
sub.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
if(ed1==null){
ed1.setText("");
} else {
Res1=Float.parseFloat(ed1.getText()+"");
Sub=true;
tv1.setText(ed1.getText());
ed1.setText(null);
}
}
});
mul.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
if(ed1==null){
ed1.setText("");
} else {
Res1=Float.parseFloat(ed1.getText()+"");
Mul=true;
tv1.setText(ed1.getText());
ed1.setText(null);
}
}
});
div.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
if(ed1==null){
ed1.setText("");
} else {
Res1=Float.parseFloat(ed1.getText()+"");
Div=true;
tv1.setText(ed1.getText());
ed1.setText(null);
}
}
});
equal.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
Res2=Float.parseFloat(ed1.getText()+"");
if(Add==true){
tv1.setText(tv1.getText()+"+"+ed1.getText());
ed1.setText(Res1+Res2+"");
tv1.setText(tv1.getText()+"="+ed1.getText());
Add=false;
}
if(Sub==true){
tv1.setText(tv1.getText()+"-"+ed1.getText());
ed1.setText(Res1-Res2+"");
tv1.setText(tv1.getText()+"="+ed1.getText());
Sub=false;
}
if(Mul==true){
tv1.setText(tv1.getText()+"*"+ed1.getText());
ed1.setText(Res1*Res2+"");
tv1.setText(tv1.getText()+"="+ed1.getText());
Mul=false;
}
if(Div==true){
tv1.setText(tv1.getText()+"/"+ed1.getText());
ed1.setText(Res1/Res2+"");
tv1.setText(tv1.getText()+"="+ed1.getText());
Div=false;
}
}
});
clear.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
ed1.setText("");
tv1.setText("");
}
});
}
}