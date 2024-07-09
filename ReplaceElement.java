package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			li.add(i);
		}
		
		System.out.print("List is: "+li);
		
		//method 1 replaing the element of index 3
		//li.set(3, 59);
		//System.out.print("\nModified List is: "+li);
		
		li.replaceAll(e -> e == 4 ? 100 : e);
		System.out.print("\nModified List is: "+li);
		

	}

}
