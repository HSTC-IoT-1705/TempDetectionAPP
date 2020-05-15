package com.example.tempdetectionapp;

import com.example.tempdetectionapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class My extends Activity {

	private Button btnnews,btnhome,btnalarm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_my);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_my);
		
		btnnews = (Button)findViewById(R.id.btn_faxian);
        btnhome = (Button)findViewById(R.id.btn_zhuye);
        btnalarm = (Button)findViewById(R.id.btn_baojing);
   
  	 
        btnnews.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(My.this,News.class);
        		startActivity(intent);
        	}			
        });
        
        btnhome.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(My.this,MainActivity.class);
        		startActivity(intent);
        	}			
        });
        btnalarm.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(My.this,Alarm.class);
        		startActivity(intent);
        	}			
        });
	}

	 

}
