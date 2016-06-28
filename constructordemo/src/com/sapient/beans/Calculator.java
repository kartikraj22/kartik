package com.sapient.beans;

public class Calculator {
	private double d;

	public Calculator(double d) throws Exception {
		super();
		if (d <= 0)
			throw new Exception("value must be greater than zero");

		this.d = d;
	}
	
	public Calculator( int d) throws Exception{
		this((double)d);
		
		
	}

	public double getD() {
		return d;
	}

	public double round2decimal() {
		return Math.round(d * 100) / 100.0;

	}

	public double round2decimal(int n) {
		double p = (int) Math.pow(10, n);
		return Math.round(d * p) / p;

	}
	
	public int convert2int(){
		return (int)d;
		
	}
	public String convertToBin(){
		int val = convert2int();
		return Integer.toBinaryString(val);
	}
	public String convertToHexa(){
		int val= convert2int();
		return Integer.toHexString(val);
	}
	public String convertToOcta(){
		int val= convert2int();
		return Integer.toOctalString(val);
		
	}
	
}
