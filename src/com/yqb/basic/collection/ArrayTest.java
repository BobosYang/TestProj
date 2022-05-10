package com.yqb.basic.collection;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		/**
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
				at java.lang.System.arraycopy(Native Method)
				at com.yqb.basic.collection.ArrayTest.main(ArrayTest.java:12)
		 */
//		String[] names = new String[] { "Jordon", "James", "Kobe", "Oneal", "Peppen", "Carl", "Webbo", "Johnson"};
//		String[] sports = new String[] { "baseball", "basketball", "football", "tennis", "volleyball" };
//		System.arraycopy(sports, 1, names, 2, 5);
		
		/**
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
				at java.lang.System.arraycopy(Native Method)
				at com.yqb.basic.collection.ArrayTest.main(ArrayTest.java:25)
		 */
//		String[] names = new String[] { "Jordon", "James", "Kobe", "Oneal", "Peppen"};
//		String[] sports = new String[] { "baseball", "basketball", "football", "tennis", "volleyball" };
//		System.arraycopy(sports, 1, names, 2, 4);
		
		/**
			通用写法，不会抛异常
		 */
		int srcPos = 2;
		int destPos = 3;
		String[] names = new String[] { "Jordon", "James", "Kobe", "Oneal", "Peppen", "Carl", "Webbo", "Johnson" };
		String[] sports = new String[] { "baseball", "basketball", "football", "tennis", "volleyball" };
		int length = (sports.length - srcPos) > (names.length  - destPos) ? (names.length  - destPos)
				: sports.length - srcPos;
		System.arraycopy(sports, srcPos, names, destPos, length);

		System.out.printf("names=%s\n", Arrays.toString(names));
		System.out.printf("sports=%s\n", Arrays.toString(sports));
	}

}
