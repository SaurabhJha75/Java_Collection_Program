package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class GetSubListFromList {

	public static void main(String[] args) {
		
		try {
			
			List<String> list1 = new ArrayList<String>();
			
			list1.add("Ankit");
			list1.add("Nupur");
			list1.add("Priya");
			list1.add("Megha");
			list1.add("Shalini");
			
			System.out.println("List :"+list1);
			
			List<String> list2 = list1.subList(1, 8);
			
			System.out.println("Sublist :"+list2);
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown "+e);
		}catch (IllegalArgumentException e) {
			System.out.println("Exception thrown "+e);
		}
	}

}
