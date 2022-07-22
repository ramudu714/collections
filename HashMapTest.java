package com.monocept.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Arjun");
		map.put(102, "Viswas");
		map.put(103, "Ramya");
		map.put(104, "Joseph");
		
		System.out.println("Before invoking remove() method: " + map);
		map.remove(102);
		System.out.println("After invoking remove() method: " + map);

		// Fetching key
		System.out.println("Keys: " + map.keySet());
		// Fetching value
		System.out.println("Values: " + map.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + map.entrySet());
	}
}
