package com.sapient.demo;
import java.util.Scanner;

import com.sapient.util.MyUtil;

//import com.sapient.util.MyUtil;

public class interest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amount");
		double amt = scan.nextDouble();
		System.out.println("enter the years");
		int years = scan.nextInt();
		System.out.println("enter the rate");
		float rate = scan.nextFloat();
		double si = calcSimple(amt,years,rate);
		double ci = calcComp(amt,years,rate);
		System.out.println("Simple " + MyUtil.round2places(si));
		System.out.println("Compound " + MyUtil.round2places(ci));

	}

	public static double calcSimple(double amt, int years, float rate){
		return amt*years*rate/100;
		}
	
	public static double calcComp(double amt, int years, float rate){
		return amt* Math.pow((1+rate/100.0), years) - amt;
		}
}
