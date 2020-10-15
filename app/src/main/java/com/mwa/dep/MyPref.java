package com.mwa.dep;

import java.lang.reflect.*;
import android.content.*;

public class MyPref
{
	private static final Method setMethod=setMethod();
	private static Method setMethod(){
		try{
			Class<?> cl=SharedPreferences.Editor.class;

			return cl.getMethod("");


		}catch(NoSuchMethodException noe){}
		return null;
	}
	public static void setUP(SharedPreferences.Editor edit){
		if(setMethod !=null){
			try{
				setMethod.invoke(edit);
				return;
			}catch(InvocationTargetException invo){
			}catch(IllegalAccessException ill){}
		}edit.commit();
	}}
