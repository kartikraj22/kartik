package com.pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

public static void main(String[] args) {
		
		String[] arr = {"ram", "anand","balmukund","mukunda"};
		Arrays.sort(arr);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the element to search");
		String str = scan.next();
		
		int pos= Arrays.binarySearch(arr, str);
		System.out.println(pos);
	}

}
