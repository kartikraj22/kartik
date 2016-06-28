package com.sapient.demo;

public class Sales {

	
	private String sname;
	private double sales;
	public static double TOT_SALES;
	public Sales(String sname, int sales) {
		super();
		this.sname = sname;
		this.sales = sales;
		TOT_SALES = TOT_SALES + this.sales;
		
	}
	
	
}
