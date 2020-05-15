package com.example.tempdetectionapp;

import com.example.tempdetectionapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class News extends Activity {

	private Button btnhome,btnmy;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_news);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.title_news);
        
        btnhome = (Button)findViewById(R.id.btn_zhuye);
        btnmy = (Button)findViewById(R.id.btn_my);
         
   
        btnhome.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(News.this,MainActivity.class);
        		startActivity(intent);
        	}			
        });
        
        btnmy.setOnClickListener(new OnClickListener() {		
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent=new Intent(News.this,My.class);
        		startActivity(intent);
        	}			
        });
        
        
        TextView tips = (TextView) findViewById(R.id.text);
        TextView tips1 = (TextView) findViewById(R.id.text1);
        TextView tips2 = (TextView) findViewById(R.id.text2);
        TextView tips3 = (TextView) findViewById(R.id.text3);
        TextView tips4 = (TextView) findViewById(R.id.text4);
    	

    	String  str = "<a href='http://news.youth.cn/sz/202005/t20200504_12314709.htm'>����ΰ��ʱ�����μ�ϰ��ƽ���ഺ����</a>";
    	String  str1 = "<a href='http://news.jstv.com/a/20200501/1588296796166.shtml'>��һ���ھ�������Ӧ������塢������ԤԼ������      �й����α�  </a>";
    	String  str2 = "<a href='https://www.sohu.com/a/391777006_265827'>�ʹ���һ���¿����ٶȽ�������ֱ��                              ������     </a>";
    	String  str3 = "<a href='http://www.chinanews.com/cj/2020/04-30/9173106.shtml'>�������������� �㶫����ص�������Ŀ��������      �й��»���  </a>";
    	String  str4 = "<a href='http://news.youth.cn/sz/202004/t20200416_12289412.htm'>ϰ��ƽ���Ž�����ǹ������սʤ��������������       �����ǡ� </a>";
    	
    	tips.setText(Html.fromHtml(str));
    	tips1.setText(Html.fromHtml(str1));
    	tips2.setText(Html.fromHtml(str2));
    	tips3.setText(Html.fromHtml(str3));
    	tips4.setText(Html.fromHtml(str4));

        
        tips.setMovementMethod(LinkMovementMethod.getInstance());
        tips1.setMovementMethod(LinkMovementMethod.getInstance());
        tips2.setMovementMethod(LinkMovementMethod.getInstance());
        tips3.setMovementMethod(LinkMovementMethod.getInstance());
        tips4.setMovementMethod(LinkMovementMethod.getInstance());
        
        NoUnderlineSpan mNoUnderlineSpan = new NoUnderlineSpan();
        
        if (tips.getText() instanceof Spannable) {
            Spannable s = (Spannable) tips.getText();
            s.setSpan(mNoUnderlineSpan, 0, s.length(), Spanned.SPAN_MARK_MARK);
        }
        if (tips1.getText() instanceof Spannable) {
            Spannable s = (Spannable) tips1.getText();
            s.setSpan(mNoUnderlineSpan, 0, s.length(), Spanned.SPAN_MARK_MARK);
        }
        if (tips2.getText() instanceof Spannable) {
            Spannable s = (Spannable) tips2.getText();
            s.setSpan(mNoUnderlineSpan, 0, s.length(), Spanned.SPAN_MARK_MARK);
        }
        if (tips3.getText() instanceof Spannable) {
            Spannable s = (Spannable) tips3.getText();
            s.setSpan(mNoUnderlineSpan, 0, s.length(), Spanned.SPAN_MARK_MARK);
        }
        if (tips4.getText() instanceof Spannable) {
            Spannable s = (Spannable) tips4.getText();
            s.setSpan(mNoUnderlineSpan, 0, s.length(), Spanned.SPAN_MARK_MARK);
        }
    }

    public class NoUnderlineSpan extends UnderlineSpan {

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(ds.linkColor);
            ds.setUnderlineText(false);
        }
    }
    

    
}
