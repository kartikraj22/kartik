
package com.sapient.util;

public class MyUtil {

	public static final String slogan = "troublemakers" ;
	public static final double pi = 3.14;
	
	public static double round2places(double val){
		double res = Math.round(val * 100)/100.0;
		return res;
	}
} 
