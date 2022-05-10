package com.yqb.basic.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest1 {

	public static void main(String[] args) {
		List<String> list = Stream.of("A", "B", "C", "D", "E").collect(Collectors.toList());

		for (int idx = 0; idx < list.size(); idx++) {
			System.out.printf("%d:%s, ", idx, list.get(idx));
		}
		
//		list.add(6, "F");   //如果跳过5，直接add 6，会报错
		list.add(5, "F");
		System.out.println();
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.printf("%d:%s, ", idx, list.get(idx));
		}
		
		list.add(2, "G");
		System.out.println();
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.printf("%d:%s, ", idx, list.get(idx));
		}
		
		System.out.println();
		System.out.println(String.join("/", list));
	}
}
