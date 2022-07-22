package com.monocept.test;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<String>();
		set.add("Apples");
		set.add("Bananas");
		set.add("Cherries");
		set.add("Dumbles");
		set.add("Elephants");
		
		System.out.println("Initial Set: " + set);

		System.out.println("Reverse Set: " + set.descendingSet());

		System.out.println("Head Set: " + set.headSet("C", true));

		System.out.println("SubSet: " + set.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set.tailSet("C", false));
		
		System.out.println("After poll first: " + set.pollFirst());
		
		System.out.println("After poll last: " + set.pollLast());
	}

}
