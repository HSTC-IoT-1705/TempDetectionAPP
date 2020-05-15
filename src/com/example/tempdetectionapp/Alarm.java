package com.example.tempdetectionapp;

import com.example.tempdetectionapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Alarm extends Activity {

 
	private ImageButton btnback;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_alarm);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_alarm);
		
		btnback = (ImageButton)findViewById(R.id.back);		 
		btnback.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Alarm.this,My.class);
				startActivity(intent);
			}			
	});
	}

	 

}
