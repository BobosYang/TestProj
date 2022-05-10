package com.yqb.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ListTest {
	public static void main(String[] args) {
//		System.out.println(Arrays.asList(null));

		List<String> containerNoList = new ArrayList<String>(
				Arrays.asList(new String[] { "1", "8", "3", "5", "2", "10", "7", "Æ´Ïä", "6" }));
		containerNoList.stream().sorted((x, y) -> {
			if (isNumeric(x)) {
				if (isNumeric(y)) {
					return Integer.valueOf(x).compareTo(Integer.valueOf(y));
				} else {
					return -1;
				}
			} else {
				if (isNumeric(y)) {
					return 1;
				} else {
					return x.compareTo(y);
				}

			}
		}).forEach(System.out::println);
	}

	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
}
