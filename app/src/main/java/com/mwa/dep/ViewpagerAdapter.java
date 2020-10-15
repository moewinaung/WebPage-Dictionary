package com.mwa.dep;

import android.support.annotation.Nullable; 
import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager; 
import android.support.v4.app.FragmentPagerAdapter; 
import java.util.ArrayList; 

public class ViewpagerAdapter extends FragmentPagerAdapter { 

	ArrayList<Fragment> fragments = new ArrayList<>(); 
	ArrayList<String> strings = new ArrayList<>(); 

	public ViewpagerAdapter(FragmentManager fm)
	{ 
		super(fm); 
	} 

	@Override 
	public Fragment getItem(int i) { 

		switch (i) { 
			case 0: 
				return new FragmentA(); 
			case 1: 
				return new FragmentB(); 
			case 2: 
				return new FragmentC(); 
			case 3:
				return new FragmentD();
			default: 
				return null; 
		} 
	}
	@Override 
	public int getCount() { 
		return fragments.size(); 
	} 

	public  void add(Fragment fr, String str){ 
		fragments.add(fr); 
		strings.add(str); 
	} 
	
	@Nullable 
	@Override 
	public CharSequence getPageTitle(int position) { 
		return strings.get(position); 
	} 
} 
	 
