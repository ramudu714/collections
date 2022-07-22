package com.monocept.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "Arya");
		map.put(102, "Ramesh");
		map.put(101, "bijay");
		map.put(103, "sudarshan");
		System.out.println("Before invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
