package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElementsOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(43);
		list.add(43);
	//	list.add(34);
		//list.add(60);
		//list.add(12);
		
		int minValue = Collections.min(list);
		int maxValue = Collections.max(list);
		
		if(minValue==maxValue) {
			System.out.println("All the elements are equal");
		}else {
			System.out.println("Minimum value of our list: "+minValue);
			System.out.println("Maximum value of our list: "+maxValue);
		}

	}

}
