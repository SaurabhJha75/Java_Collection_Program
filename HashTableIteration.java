package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableIteration {

	public static void main(String[] args) {

		//creating HashTable 
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		//adding the values in hashtable
		ht.put(1, "Ram");
		ht.put(2, "Shyam");
		ht.put(3, "Rahul");
		ht.put(4, "Ranjan");
		ht.put(5, "Manjay");
		
		System.out.println("Hash Table: "+ht);
		
		//creating the set of key
		//Set<Integer> setOfKeys = ht.keySet();
		
		//method 1 by using for loop
		/*
		 * for(Integer key : setOfKeys) {
		 * System.out.println("Rank: "+key+"\t\t Value: "+ht.get(key)); }
		 */
		
		//method2 by using itertaor() method
		/*
		 * Iterator<Integer> itr = setOfKeys.iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * //getting key of particular entry int key = itr.next();
		 * 
		 * System.out.println("Rank: "+key+"\t\t Value: "+ht.get(key)); }
		 */
		
		//method 3 by using forEach() method
		//ht.forEach((key, value) -> System.out.println("Rank: "+key+"\t\t Value: "+ht.get(key)));
		
		
		//method 4 by using EntrySet() method
		/*
		 * // Storing all entries of Hashtable in a Set // using entrySet() method
		 * 
		 * Set<Entry<Integer, String>> entrySet = ht.entrySet();
		 * 
		 * // Creating an Iterator object to // iterate over the given Hashtable
		 * Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		 * 
		 * // Iterating through the Hashtable object // using iterator
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * //getting a particular entry of the hashtable Entry<Integer, String> entry =
		 * itr.next();
		 * 
		 * System.out.println("Rank: "+entry.getKey()+"\t\t Value: "+entry.getValue());
		 * 
		 * }
		 */
		 
		//method 5 by using Enummeration
		
		//creating enummeration to stror the key of hashtable
		Enumeration<Integer> e = ht.keys();
		
		while(e.hasMoreElements()) {
			Integer key = e.nextElement();
			System.out.println("Rank: "+key+"\t\t Value: "+ht.get(key));
		}
	}

}
