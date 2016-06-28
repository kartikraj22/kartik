package com.sapient.beans;

public interface Atm {
	 int MAX = 10;
	 
	void withdraw();  // by default method is public abstract in interface
	void getBalance(); // by default it is public abstract in interface
}
