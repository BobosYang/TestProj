package com.yqb.basic.datatype;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat("000000");
		String code = "XQ20190417000019";
		String codenew = code.substring(10, code.length());
		System.out.printf("\"%s\".substring(10, %d)=%s\n", code, code.length(), codenew);

		int i = Integer.parseInt(codenew) + 1;
		System.out.printf("i=Integer.parseInt(\"%s\") + 1=%d + 1=%d\n", codenew, Integer.parseInt(codenew), i);

		String k = decimalFormat.format(i);
		System.out.printf("k=decimalFormat(%s).format(%d)=%s\n", decimalFormat.toPattern(), i, k);

		System.out.printf("decimalFormat(%s).format(%d)=%s\n", decimalFormat.toPattern(), new Integer(1),
				decimalFormat.format(new Integer(1)));
	}
}
