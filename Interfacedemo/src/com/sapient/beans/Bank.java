package com.sapient.beans;

public class Bank implements Offline, Agent{

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance() {
		System.out.println("get balance");
		
	}

	@Override
	public void clearPdc() {
		System.out.println("clear Pdc");	
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}

}
