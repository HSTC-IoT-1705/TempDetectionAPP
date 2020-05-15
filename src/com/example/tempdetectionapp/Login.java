package com.example.tempdetectionapp;

import com.example.tempdetectionapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Activity {

	private Button btnlogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_login);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_login);		
		
		btnlogin = (Button)findViewById(R.id.login);		 
		btnlogin.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Login.this,MainActivity.class);
				startActivity(intent);
			}			
	});

 }
}
