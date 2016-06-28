package com.sapient.client;

import com.sapient.bean.Mtable;

public class clientm {
	
	public static void main(String[] args) {
		Mtable tbl = new Mtable();
		
		try {
			tbl.setNum(5);
			tbl.display(3,7);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
