package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeReadOnlyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			numbers.add(i);
		}
		
		numbers.stream().forEach(System.out::print);
		
		numbers.add(11);
		numbers.remove(8);
		
		numbers.set(3, 100);
		
		System.out.println("\nAfter performing some operation on list");
		numbers.stream().forEach(System.out::print);
		
		//now making the list read-only
		try {
			numbers = Collections.unmodifiableList(numbers);
			
			numbers.remove(3);
			
		}catch(Exception e) {
			System.out.println("\nLists are in Read-only mode"+e);
			
		}finally {
			
			System.out.println("\n"+numbers.get(3));
			System.out.println("Now List are in Read only mode So, you cant modify the list now");
		}

	}

}
