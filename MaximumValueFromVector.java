package com.java.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class MaximumValueFromVector {

	public static int getMaximumValue(Vector<Integer> vector) {
		
		//int maximumNumber = Collections.max(vector);
		
		int maxValue = 0;
		
		Iterator<Integer> itr = vector.iterator();
		
		while(itr.hasNext()) {
			
			int element = itr.next();
			
			if(element>maxValue) {
				maxValue = element;
			}
		}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(89);
		v.add(42);
		v.add(43);
		v.add(98);
		v.add(21);
		
		int result = getMaximumValue(v);
		System.out.println("Maximum value from the vector: "+result);

	}

}
