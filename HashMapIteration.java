package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("A", "Angular");
		map.put("J", "Java");
		map.put("P", "Python");
		map.put("R", "React");
		map.put("S", "Spring");
		
		System.out.println("Original Map : "+map);
		
		//method 1 using forEach method
		//map.forEach((key, value) -> System.out.println(key+" = "+value));
		
		//method 2 using for loop
		/*
		 * for(Map.Entry<String, String> set : map.entrySet()) {
		 * System.out.println(set.getKey()+" = "+set.getValue()); }
		 */
		
		//method 3 using stream() method
		//map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));
		
		//method 4 using iterator method
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}

}
