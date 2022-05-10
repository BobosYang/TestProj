package com.yqb.basic.datatype;

import java.math.BigDecimal;

/**
 * @author C10695
 *
 */
public class BigDecimalTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test2();
	}

	private static void test1() {
		BigDecimal num1 = new BigDecimal("10.002");
		BigDecimal num2 = null;
		System.out.println(num1.multiply(num2));
		System.out.println(num1.multiply(num2).setScale(3, BigDecimal.ROUND_HALF_UP));
		System.out.println(num1.multiply(num2).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println(num1.multiply(num2).setScale(3, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(num1.multiply(num2).setScale(2, BigDecimal.ROUND_HALF_DOWN));
	}

	private static void test2() {
		BigDecimal num1 = new BigDecimal("11111222.12345");
		System.out.println(num1.setScale(0, BigDecimal.ROUND_UP));
	}
}
