package com.sapinet.cleint;

import com.sapient.beans.StdCalculator;

public class CalcClientA {

	public static void main(String[] args) {
	 
		try {
			StdCalculator calc = new StdCalculator(56.3767);
			System.out.println(calc.round2decimal());
			System.out.println(calc.round2decimal(3));
			System.out.println(calc.convert2int());
			
		} catch (Exception e) {
	
		System.out.println(e.getMessage());
		}
		
		try {
			StdCalculator calc = new StdCalculator(200);
			System.out.println(calc.convertToBin());
			System.out.println(calc.convertToOcta());
			System.out.println(calc.convertToHexa());
			
		} catch (Exception e) {
	
		System.out.println(e.getMessage());
		}
		
		try {
			StdCalculator calc = new StdCalculator(20.7889,50.38566);
			System.out.println(calc.doAdd());
			System.out.println(calc.doSub());
			System.out.println(calc.doMultiply());
			System.out.println(calc.round2decimal());
			System.out.println(calc.round2decimal(3));
			System.out.println(calc.convertToBin());
			
		} catch (Exception e) {
	
		System.out.println(e.getMessage());
		}

	}

}
