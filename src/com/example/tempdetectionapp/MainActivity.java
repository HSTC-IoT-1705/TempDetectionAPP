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

public class MainActivity extends Activity {

	private Button btnnews,btnmy;
	private ImageButton btntemp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);//添加这句：这里表达的意思为使用自定义标题栏
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_home);
     

        btnnews = (Button)findViewById(R.id.btn_faxian);
        btnmy = (Button)findViewById(R.id.btn_my);
        btntemp = (ImageButton)findViewById(R.id.lishitiwen);
   
  	 
        btnnews.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(MainActivity.this,News.class);
        		startActivity(intent);
        	}			
        });
        
        btnmy.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(MainActivity.this,My.class);
        		startActivity(intent);
        	}			
        });
        
        btntemp.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(MainActivity.this,HistoryTemp.class);
        		startActivity(intent);
        	}			
        });
    
    }
    
}

