package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating HashSet of integer type
		HashSet<Integer> set = new HashSet<Integer>();

		// adding the value into the set
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);

		// adding duplicate value to set
		// but duplicate values are not allowed in set
		set.add(400);

		System.out.print("Set :");

		// Method - 1 iterating by using iterator() method
		
		  Iterator<Integer> itr = set.iterator();
		  
		  while(itr.hasNext()) {
			  
			  System.out.print(" "+itr.next());
		  }
		 

		// method 2 by using forEach() method
		//set.forEach(System.out::print);
		
		//method 3 by using for() loop
		/*
		 * for(int i : set) System.out.print(" "+i);
		 */
	}

}
