package com.sapient.client;

import com.sapient.beans.Student;

public class StudenClientB {
	public static void main(String[] args) {
		
		Student stu= new Student(1001, "ram", 89);
		Student stu2= new Student(1002, "tom", 89);
		stu2=null;
		stu= null;
		System.gc();
		System.out.println("line 2");
		System.out.println("line3");
	}

}
