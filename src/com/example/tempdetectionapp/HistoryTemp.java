package com.example.tempdetectionapp;

import java.util.ArrayList;
import com.example.tempdetectionapp.R;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
 

public class HistoryTemp extends Activity {

	private ImageButton btnback;
	
	ArrayList<Double> yList;
	LineGraphicView tu;
	
	int num=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);//添加这句：这里表达的意思为使用自定义标题栏
		setContentView(R.layout.activity_history_temp);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_history_temp);
		

		btnback = (ImageButton)findViewById(R.id.back);		 
		btnback.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(HistoryTemp.this,MainActivity.class);
				startActivity(intent);
			}			
	});
		
		initView();
		
		
	}
	
	public void initView(){
		tu = (LineGraphicView) findViewById(R.id.line_graphic);

		yList = new ArrayList<Double>();
		yList.add((double) 39.103);
		yList.add(37.0);
		yList.add(36.60);
		yList.add(36.08);
		yList.add(37.32);
		yList.add(38.0);
		yList.add(36.5);
		yList.add(38.5);

		ArrayList<String> xRawDatas = new ArrayList<String>();
		xRawDatas.add("05-02");
		xRawDatas.add("05-03");
		xRawDatas.add("05-04");
		xRawDatas.add("05-05");
		xRawDatas.add("05-06");
		xRawDatas.add("05-07");
		xRawDatas.add("05-08");
		xRawDatas.add("05-09");
		tu.setData(yList, xRawDatas,40.0,35.0,1);
	}
	

}
