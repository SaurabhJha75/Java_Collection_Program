package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxValueOfList {

	//userdefind method for finding the min value of list
	public static int findMin(List<Integer> list) {

		Integer minValue = Integer.MAX_VALUE;

		for (int i : list) {
			if (minValue > i)
				minValue = i;
		}

		return minValue;

	}
	
	//user defind method to find the max value of list
	public static int findMax(List<Integer> list) {
		
		Integer maxValue = Integer.MIN_VALUE;
		
		for(int i : list) {
			if(maxValue < i)
				maxValue = i;
		}
		
		return maxValue;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(44);
		list.add(98);
		list.add(32);
		list.add(54);
		list.add(12);

		System.out.println("List is: " + list);

		// method 1 to find the min and max value of the list
		/*
		 * Collections.sort(list); int minValue = list.get(0); int maxValue =
		 * list.get(list.size()-1);
		 * 
		 * System.out.println("\nMax Value: "+maxValue+", Min Value: "+minValue);
		 */

		// method 2
		// System.out.println("\nMinimum value: "+Collections.min(list));
		// System.out.println("Minimum value: "+Collections.max(list));

		//method 3
		System.out.println("\nMinimum value: "+findMin(list));
		System.out.println("\nMinimum value: "+findMax(list));

	}

}
