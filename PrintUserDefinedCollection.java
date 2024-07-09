package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;

class User {

	private String name;
	private int age;


	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}


	public class PrintUserDefinedCollection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<User> li = new ArrayList<User>();
		
		HashMap<Integer, User> map = new HashMap<Integer, User>();
		
		User user1 = new User("Saurabh", 24);
		User user2 = new User("Shalini", 23);
		User user3 = new User("Surabhi", 22);
		User user4 = new User("Utkarsh", 22);
		
		/*
		 * li.add(user1); li.add(user2); li.add(user3); li.add(user4);
		 */
		
		map.put(1, user1);
		map.put(2, user2);
		map.put(3, user3);
		map.put(4, user4);
		
		map.remove(3);
		//System.out.println("User defined collection printed: \n"+li);
		
		System.out.println("Printed user defined collection byusing HashMap: "+map);
		
	}

}
