package com.sapient.bean;

public class Mtable {

	private int num;

	public void setNum(int num) throws Exception {
		if(num > 0)
		this.num = num;
		else
			throw new Exception("number must be +ve");
	}
	public void display(int start, int end){
		for (int i=start;i<=end;++i)
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		
	}
		// TODO Auto-generated method stub

	}


