package com.yqb.basic.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamSorted {
	public static void main(String[] args) {
		System.out.println("MDUB32-200DZ".compareTo("CP96SDB32-125C"));
		System.out.println("CP96SDB32-125C".compareTo("D5063"));
		System.out.println("MDUB32-200DZ".compareTo("D5063"));
		System.out.println("-----------------------------------------------------");

		List<String> testList = new ArrayList<String>();
		testList.add("MDUB32-200DZ");
		testList.add("CP96SDB32-125C");
		testList.add("D5063");
		List<String> resultList = testList.stream().sorted(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}).collect(Collectors.toList());

		resultList.stream().forEach(e -> {
			System.out.println(e);
		});
	}
}
