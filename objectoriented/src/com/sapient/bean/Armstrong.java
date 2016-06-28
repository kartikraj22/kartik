package com.sapient.bean;

public class Armstrong {

	
//	public int num;
	public int num;
	public String findArmstrong(){
		String res = "not a armstrong";
		int len= findLen();
		int sum = 0;
		int quot= num;
		int rem=0;
		
		while (quot>0){
			rem =quot % 10;
			sum = (int)(sum +Math.pow(rem, len));
			quot= quot/10;
			
		}
		if (sum==num)
			return "armstrong";
		return res;
		
	}
	
	public int findLen(){
		
		int count= 0;
		int quot= num;
		while (quot > 0){
			quot=quot/10;
			++count;
			
		}
		return count;
	}
}
