package com.mwa.dep;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/// ------ ViewFlipper ပံုေတြကို တစ္ေနရာ ထဲမွာ slide ျပဖို့အတြက္သံုး
public class CustomAdapter extends BaseAdapter {
	
	Context context;
	int[] images;
	String[] imageNames;
	LayoutInflater inflater;

	public CustomAdapter(Context applicationContext, String[] imageNames, int[] images) {
		this.context = applicationContext;
		this.images = images;
		this.imageNames = imageNames;
		inflater = (LayoutInflater.from(applicationContext));

	}

	@Override
	public int getCount() {
		return imageNames.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		view = inflater.inflate(R.layout.view, null);
		TextView textView = (TextView) view.findViewById(R.id.tv);
		ImageView imageView = (ImageView) view.findViewById(R.id.iv);
		textView.setText(imageNames[position]);
		imageView.setImageResource(images[position]);
		return view;
	}
}
