package com.yqb.basic.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayTest {
	
	private static List<Integer> resultList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		List<Integer> numlist = new ArrayList<Integer>(Arrays.asList(1, 2));
		int[] arrayValue = { 0, 1 };

//		System.out.println(numlist.subList(1, numlist.size()));
		for (int i = 0; i < numlist.size(); i++) {
			for (int j = 0; j <= arrayValue.length; j++) {
				
			}
		}
		
//		System.out.println(getValue(numlist));
//		getValue(numlist);
		
		List<String> test = null;
		for(String a:test) {
			System.out.println("a=" + a);
		}
	}
//
//	private static void getValue(List<Integer> numlist, int flag) {
//		if(numlist instanceof List) {
//			
//		}else {
//			List<Integer> finalList = new ArrayList<Integer>();
//			finalList.add(0);
//			finalList.add(1);
//			return finalList;
//		}
//	}
//	
//	
//	private static void printValue(List<Integer> numlist) {
//		
//	}
}
