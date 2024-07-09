package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Geeks ");
		list.add("for ");
		list.add("Geeks");
		
		String strArray[] = list.toArray(new String[0]);
		
		System.out.println("Converted array from list is: ");
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]);
		}

	}

}
