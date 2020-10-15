package com.mwa.dep;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.support.design.widget.*;
import android.support.v4.widget.*;
import android.support.v7.app.*;
import android.widget.AdapterView.*;
import android.support.v4.view.*;
import android.widget.*;
import android.content.*;
import android.net.*;



/// ----- navigation ကို Listener ေခၚထား
public class MainActivity extends AppCompatActivity implements  
NavigationView.OnNavigationItemSelectedListener{

	Toolbar toolbar;
	DrawerLayout dl;
	TabLayout tab;
	ViewPager vv;
	NavigationView navi;
	
	Button b1,b2;
	View v1;

	private Intent intent;
	private Intent chooser;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		/// ----- app ဝင္ဝင္ခ်င္း Alert Dialog ျဖင့္ မိတ္ဆက္
		AlertDialog alert=new AlertDialog.Builder(this).create();
		alert.setTitle(" မဂၤလာပါ ");
		alert.setMessage("ျပည္ေထာင္စု သမၼတျမန္မာနိုင္ငံေတာ္ အစိုးရ၏ တရားဝင္ဝက္ဆိုက္မ်ား\n\n                      write by zawgyi-code");
		alert.setIcon(R.drawable.ic_app);
		alert.show();
			
		/// ------ DrawerLayout ကို Toggle icon ထဲ့ျပီး click လုပ္နိုင္ဖို႔
		dl=(DrawerLayout)findViewById(R.id.dl);
		ActionBarDrawerToggle tg=new ActionBarDrawerToggle
		(this,dl,toolbar,R.string.open,R.string.close);
		dl.addDrawerListener(tg);
		tg.syncState();

		navi=(NavigationView)findViewById(R.id.navi);
		navi.setNavigationItemSelectedListener(this);

		/// --------- ViewPager သံုးရန္အတြက္
		tab = findViewById(R.id.tab); 
		vv = findViewById(R.id.vv); 
		
		ViewpagerAdapter adapter=new ViewpagerAdapter(getSupportFragmentManager()); /// ---- ViewpagerAdapter class တစ္ခုတည္ေဆာက္
		adapter.add(new FragmentA(),"Home"); 
		adapter.add(new FragmentB(),"Top Site"); 
		adapter.add(new FragmentC(),"Categories"); 
		adapter.add(new FragmentD(),"Live");

		vv.setAdapter(adapter); 
		tab.setupWithViewPager(vv);
		
	
		
	}

		/// -------- NavigationView ထည့္ဖို႔သံုး
		@Override
		public boolean onNavigationItemSelected(MenuItem mi)
		{
			switch(mi.getItemId()){
				case R.id.cc:
					intent = new Intent(Intent.ACTION_SEND); 
					                intent.setData(Uri.parse("mail to:")); 
					                String[] to={"moewinaungwyp@gmail.com"}; 
					                intent.putExtra(Intent.EXTRA_EMAIL, to); 
					                intent.putExtra(Intent.EXTRA_SUBJECT, "Web Dictionary App"); 
				                    intent.putExtra(Intent.EXTRA_TEXT, "Type your letter"); 
					                intent.setType("message/rfc822"); 
						            chooser=Intent.createChooser(intent, "Send Email"); 
					                startActivity(chooser); 

			}
			return true;
		}
		
		
		
	
		/// ----- OptionMenu သံုးရန္အတြက္
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.search:
				Intent intent=new Intent(MainActivity.this,Activity1.class);
				startActivity(intent);
				break;  
				}return true;
		}
		

	/// ----- Dialog ျဖင့္ ျပပီး app မွထြက္ဖို့
	@Override
	public void onBackPressed()
	{
		v1=getLayoutInflater().inflate(R.layout.ExitDialog,null); // အျခား xml က id ကို လွမ္းေခၚ
	    b1=v1.findViewById(R.id.b1);
		b2=v1.findViewById(R.id.b2); // xml က button ကို id ေပး

		final AlertDialog ad=new AlertDialog.Builder
		(MainActivity.this).create();
		b1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					finish();
				}
			});
		b2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					ad.dismiss();
				}
			});
		ad.setView(v1);
		ad.show();

	}

	}

	
		
	    
