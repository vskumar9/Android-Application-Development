package com.example.program_3_2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText enterValuesEditText;
	 Button clickHereButton;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 enterValuesEditText =(EditText)findViewById(R.id.textView1);
	 clickHereButton =(Button)findViewById(R.id.button1);
	 clickHereButton.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
	Toast.makeText(MainActivity.this,enterValuesEditText.getText().toString(),Toast
	.LENGTH_LONG).show();
	 }
	 });
	 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
