package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class GetElementsFromLinkeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Saurabh Kumar Jha");
		list.add("Gaurav Kumar Jha");
		list.add("Shubham Kumar Jha");
		list.add("Hema Jha");
		list.add("Ramesh Jha");
		
		/*
		 * for(int i=0;i<list.size();i++) {
		 * 
		 * System.out.println("Element on the index "+i+" is "+list.get(i)); }
		 */
		
		int j=0;
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print("Elements at the index "+j+" is ");
			String str = itr.next();
			
			System.out.print(str);
			System.out.println(" \n");
			
			++j;
		}

	}

}
