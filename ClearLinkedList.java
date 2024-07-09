package com.java.collections;

import java.util.LinkedList;

public class ClearLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(54);
		list.add(87);
		list.add(90);
		list.add(14);
		list.add(43);
		
		System.out.println("List is "+list);
		
		list.clear();
		System.out.println("After clearing list is "+list);
	}

}
