package com.mwa.dep;

import android.webkit.*;
import android.support.v7.app.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;

public class WebActivity extends AppCompatActivity {
    WebView web;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webactivity);

		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true); /// ----- toolbar မွာ back arrow ျဖင့္ back click သံုးဖို႔သံုး
		
		web=(WebView)findViewById(R.id.wv);
		web.setWebViewClient(new Callback());
		WebSettings WebSettings=web.getSettings();
		
		Bundle bun=getIntent().getExtras(); // MainActivity မွ Intent က္ု getExtras ျဖင့္ ေခၚယူ
		String url=bun.getString("webUrl"); // webUrl ျဖင့္ String က item ေတြကို ေဖာ္ျပ
		web.loadUrl(url);
    }
	
	/// ----- WebPage ကို မိမိ app မွာပဲ ေဖာ္ျပလိုတဲ့ အတြက္ WebViewClient သံုး
	private class Callback extends WebViewClient
	{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String URL)
		{
			return false;
	}}
	
	
	
	/// ----- toolbar မွာ back arrow ျဖင့္ back click သံုးဖို႔သံုး
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId()){
			case android.R.id.home:
				finish();
				
		}
		return true;
		
	}}





