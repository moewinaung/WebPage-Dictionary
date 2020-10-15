package com.mwa.dep;

import android.support.v4.app.*;
import android.view.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.support.design.widget.*;
import android.net.*;





/// ------- ViewPager မွာ ထည့္သံုးဖို့အတြက္ Fragment တစ္ခုတည္ေဆာက္
public class FragmentA extends Fragment{
	

	FloatingActionButton fab;
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,
	b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,
	b31,b32,b33,b34,b35,b36,b37,b38,b39;

	private AdapterViewFlipper adapterViewFlipper;
	
	int[] images={R.drawable.nai,R.drawable.pre,R.drawable.p8,R.drawable.p10,R.drawable.p11,R.drawable.p1,R.drawable.p12,
		R.drawable.p13,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p14,R.drawable.p15,R.drawable.p16,R.drawable.p17,
		R.drawable.p18,R.drawable.p19,R.drawable.p20,R.drawable.p21,R.drawable.p2};

	String[]imagesNames={"နိုင္ငံေတာ္ တံဆိပ္","နိုင္ငံေတာ္ သမၼတရံုး","ကာကြယ္ေရးဝန္ၾကီးဌာန","နယ္စပ္ေရးရာဝန္ၾကီးဌာန","ျပန္ၾကားေရးဝန္ၾကီးဌာန","နိုင္ငံျခားေရးဝန္ၾကီးဌာန","သာသနာေရး ႏွင့္ယဥ္ေက်းမွုဝန္ၾကီးဌာန",
		"လယ္ယာစိုက္ပ်ိဳးေရး ႏွင့္ဆည္ေျမာင္းဝန္ၾကီးဌာန","ျပည္ေထာင္စုေရွ႕ေနခ်ဳပ္ရံုး","ျပည္ေထာင္စုစစ္ရင္းစစ္ခ်ဳပ္ရံုး","ျပည္ေထာင္စုရာထူးဝန္အဖြဲ႔","ပို႔ေဆာင္ေရးႏွင့္ဆက္သြယ္ေရးဝန္ၾကီးဌာန","လ်ွပ္စစ္ႏွင့္စြမ္းအင္ဝန္ၾကီးဌာန",
		"စက္မွုဝန္ၾကီးဌာန","စီးပြားေရး ႏွင့္ကူးသန္းေရာင္းဝယ္ေရး ဝန္ၾကီးဌာန","ပညာေရးဝန္ၾကီးဌာန","က်န္းမာေရး ႏွင့္အားကစားဝန္ၾကီးဌာန","စီမံကိန္းႏွင့္ဘ႑ာေရး ဝန္ၾကီးဌာန","ေဆာက္လုပ္ေရး ဝန္ၾကီးဌာန",
		"လူမွုဝန္ထမ္း၊ ကယ္ဆယ္ေရးႏွင့္ျပန္လည္ေနရာခ်ထားေရး ဝန္ၾကီးဌာန"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// ဒီ code က onCreateView အတြက္
		View view=inflater.inflate(R.layout.fragment_a,container,false);
		

        /// ------ /// ------ ViewFlipper ပံုေတြကို တစ္ေနရာ ထဲမွာ slide ျပဖို့အတြက္သံုး
		adapterViewFlipper=view.findViewById(R.id.av);
		CustomAdapter customAdapter=new CustomAdapter(getActivity(),imagesNames,images);
		adapterViewFlipper.setAdapter(customAdapter);
		adapterViewFlipper.setFlipInterval(3000);
		adapterViewFlipper.setAutoStart(true);
		
		/// ---- Fragment ရဲ့ id သတ္မွတ္တဲ့ အခါ view ဆိုတဲ့ code တစ္ခုထပ္ေပၚင္းရတယ္ ** Activity မွာ မလိုဘူး
		Button b1=(Button)view.findViewById(R.id.b1);
		Button b2=(Button)view.findViewById(R.id.b2);
		Button b3=(Button)view.findViewById(R.id.b3);
        Button b4=(Button)view.findViewById(R.id.b4);
		Button b5=(Button)view.findViewById(R.id.b5);
		Button b6=(Button)view.findViewById(R.id.b6);
        Button b7=(Button)view.findViewById(R.id.b7);
		Button b8=(Button)view.findViewById(R.id.b8);
		Button b9=(Button)view.findViewById(R.id.b9);
        Button b10=(Button)view.findViewById(R.id.b10);
		Button b11=(Button)view.findViewById(R.id.b11);
		Button b12=(Button)view.findViewById(R.id.b12);
		Button b13=(Button)view.findViewById(R.id.b13);
		Button b14=(Button)view.findViewById(R.id.b14);
		Button b15=(Button)view.findViewById(R.id.b15);
        Button b16=(Button)view.findViewById(R.id.b16);
		Button b17=(Button)view.findViewById(R.id.b17);
		Button b18=(Button)view.findViewById(R.id.b18);
        Button b19=(Button)view.findViewById(R.id.b19);
		Button b20=(Button)view.findViewById(R.id.b20);
		Button b21=(Button)view.findViewById(R.id.b21);
		
		fab = (FloatingActionButton) view.findViewById(R.id.fab); 

		
		/*
        Button b22=(Button)view.findViewById(R.id.b22);
		Button b23=(Button)view.findViewById(R.id.b23);
		Button b24=(Button)view.findViewById(R.id.b24);
		Button b25=(Button)view.findViewById(R.id.b25);
		Button b26=(Button)view.findViewById(R.id.b26);
		Button b27=(Button)view.findViewById(R.id.b27);
        Button b28=(Button)view.findViewById(R.id.b28);
		Button b29=(Button)view.findViewById(R.id.b29);
		Button b30=(Button)view.findViewById(R.id.b30);
        Button b31=(Button)view.findViewById(R.id.b31);
		Button b32=(Button)view.findViewById(R.id.b32);
		Button b33=(Button)view.findViewById(R.id.b33);
        Button b34=(Button)view.findViewById(R.id.b34);
		Button b35=(Button)view.findViewById(R.id.b35);
		Button b36=(Button)view.findViewById(R.id.b36);
		Button b37=(Button)view.findViewById(R.id.b37);
		Button b38=(Button)view.findViewById(R.id.b38);
		Button b39=(Button)view.findViewById(R.id.b39);*/
		
		  
		/// ----- button ကို အလုပ္လုပ္ေစဖို့သံုး **
		b1.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle(); // Bundle တစ္ခုတည္ေဆာက္ ** အျခားတစ္ခုနဲ့ လွမ္းခ်ိတ္ဖို့

					Intent in=new Intent(getActivity(),WebActivity.class);	/// Fragment ကေန Activity သို့ ကူးလိုရင္ getActivity() ဆိုတဲ့ code နဲ့ အသက္သြင္းရတယ္		
					bun.putString("webUrl","http://www.president-office.gov.mm");
					in.putExtras(bun); /// webUrl သံုးျပီး အျခားတစ္ခုနဲ့ လွမ္းခ်ိတ္ဖို့
					startActivity(in);

				}
			}); 
		b2.setOnClickListener(new View.OnClickListener() {


				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mod.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 

		b3.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mba.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b4.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  
					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moi.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b5.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(),WebActivity.class);				
					bun.putString("webUrl","http://www.mofa.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b6.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mora.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b7.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.myancoop.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b8.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moai.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b9.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mcpt.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b10.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mip.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b11.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.livestock-fisheries.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b12.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.energy.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b13.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mot.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b14.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moecaf.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b15.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moin.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b16.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.commerce.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b17.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moep.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b18.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.myasoc.org");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b19.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.myanmar-education.edu.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b20.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.moh.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b21.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(getActivity(), WebActivity.class);				
					bun.putString("webUrl","http://www.mining.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); /*
		b22.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.mol.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b23.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.ministryofrailtransportation.com");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b24.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.mswrr.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 

		b25.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.ministryofconstruction.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b26.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.most.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b27.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.oag.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b28.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.oagmac.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b29.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.ucsb.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b30.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.myanmarpoliceforce.org");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b31.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.fsd.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b32.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.ddm.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}

			}); 


		b33.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.mmftb.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b34.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.ird.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 

		b35.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.customs.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b36.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.mnped.gov.mm");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b37.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  


					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.myanmartourism");
					in.putExtras(bun);
					startActivity(in);


				}
			}); 
		b38.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  



					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.culturemyanmar.org");
					in.putExtras(bun);
					startActivity(in);

				}
			}); 
		b39.setOnClickListener(new View.OnClickListener() { 
				@Override 
				public void onClick(View v) {  

					Bundle bun=new Bundle();

					Intent in=new Intent(MainActivity.this, WebActivity.class);				
					bun.putString("webUrl","http://www.mofra.gov.mm");
					in.putExtras(bun);
					startActivity(in);


				}
			}); */
			
			
		/// ----- FloationActionButton ထည့္ဖို့သံုး
		
    	fab.setOnClickListener(new View.OnClickListener(){

				private Intent intent;

				private Intent chooser;

				

				@Override
				public void onClick(View v)
				{
					intent = new Intent(Intent.ACTION_VIEW); 
					                intent.setData(Uri.parse("https://play.google.com/store?hl=en")); 
						                chooser=Intent.createChooser(intent,"launch Play Store"); 
					            startActivity(chooser); 
					}
			});
	
		return view; // ဒီ code က onCreateView အတြက္
	}}
			
   
