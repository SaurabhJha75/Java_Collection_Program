package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"SK", "AK", "GK", "HK", "UK"};
		
		System.out.println("Array is...");
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		//method 1
		/*
		 * List<Integer> al = new ArrayList<Integer>();
		 * 
		 * for(int i=0;i<arr.length;i++) { al.add(arr[i]); }
		 */
		 
		//method 2
		/*
		 * List list = Arrays.asList(arr); System.out.println(list);
		 */
		
		//method 3
		/*
		 * List<String> list = List.of(arr); System.out.println(list);
		 */
		
		//method 4
		List<String> list = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(list);
		
		
		
	}

}
