package com.example.tempdetectionapp;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_login);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_login);
	}

	 

}
