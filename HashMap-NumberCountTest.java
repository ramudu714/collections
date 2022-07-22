package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class NumberCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberList = new ArrayList<Integer>(
				Arrays.asList(2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 6, 18, 18, 19, 19, 19));
		int tempCount = 0;

		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (Integer key : numberList) {
			numberMap.get(key);
			if (numberMap.get(key) == null) {
				tempCount = 0;
			} else {
				tempCount = numberMap.get(key);
			}
			numberMap.put(key, ++tempCount);
		}
		for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {

			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
	}
}
