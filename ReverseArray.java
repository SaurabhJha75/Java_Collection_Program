package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//System.out.print("Reverse Array: ");
		
		//method 1 to reverse the array
		/*
		 * for(int i=arr.length-1;i>=0;i--) { System.out.print(" "+arr[i]); }
		 */
		
		//method 2 for reverse the array
		// Collections.reverse(Arrays.asList(arr));
		//System.out.print("Reverse Array : "+Arrays.toString(arr));
		
		//rotate a list 
		List list = Arrays.asList(arr);
		Collections.reverse(list);
		System.out.println("Reverse List is: "+ list);
		
	}

}
