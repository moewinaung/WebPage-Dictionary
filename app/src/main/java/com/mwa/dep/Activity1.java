package com.mwa.dep;
import android.support.v7.app.*;
import android.content.*;
import android.webkit.*;
import android.support.v7.widget.Toolbar;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.support.v4.widget.*;



public class Activity1 extends AppCompatActivity {
	
	
	
	
	AutoCompleteTextView url;
	String[]inputs={"www.mmtimes.com","www.mrtv4.com","www.moe.gov.mm","www.myawady.net.mm","bird cat","board","www.cat","card","country",
		"dog","www.done","doing","ear","eaten","www.enginner"};
	
	
	/** Called when the activity is first created. */
	ProgressBar Pbar;
	
	TextView search;
	WebView WebView;
	
	private class WebClient extends WebViewClient
	{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
// TODO Auto-generated method stub
			view.loadUrl(url);
			return true;
		}
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setTitle("Search...");
        setContentView(R.layout.activity1);

		

		
		
		Pbar = (ProgressBar) findViewById(R.id.pb);
		url = (AutoCompleteTextView)findViewById(R.id.url);
		search = (TextView)findViewById(R.id.search);
		WebView = (WebView) findViewById(R.id.WebView);
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,inputs);

		url.setAdapter(adapter);
		
		
		

		search.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
// TODO Auto-generated method stub

					WebView.setWebViewClient(new WebClient());
					WebView.loadUrl("http://"+url.getText().toString());
					WebView.getSettings().setLoadsImagesAutomatically(true);
					WebView.getSettings().setJavaScriptEnabled(true);
					WebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

				}
			});
		WebView.setWebViewClient(new Callback());
		WebSettings webSettings = WebView.getSettings();
		//webSettings.setBuiltInZoomControls(true);
		WebView.getSettings().setLoadsImagesAutomatically(true);
		WebView.getSettings().setJavaScriptEnabled(true);
		WebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		//WebView.loadUrl( "http://www.google.com" );
		
		WebView.setWebChromeClient(new WebChromeClient() {
				public void onProgressChanged(WebView view, int progress) {
					if(progress < 100 && Pbar.getVisibility() == ProgressBar.GONE){
						Pbar.setVisibility(ProgressBar.VISIBLE);

					}

					Pbar.setProgress(progress);
					if(progress == 100) {
						Pbar.setVisibility(ProgressBar.GONE);

					}
				}
			});
	

   
	
	}

	
	
	private class Callback extends WebViewClient
 {
		public boolean shouldOverrideUrlLoading(WebView view,
												String url) {

			return false;
			
	}}}
	
	
	
	
	

	
	
