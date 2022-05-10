package com.yqb.basic.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionTest {
	public static void main(String[] args) {
		String invNo = "BPIC826";

		Pattern p = Pattern.compile("\\D+");
//		p.compile("");

		Matcher match = p.matcher(invNo);
		while (match.find()) {
			System.out.println(match.group(0));
		}

		String content = "I am noob from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.printf("×Ö·û´®[%s]ÖÐÊÇ·ñ°üº¬ÁË 'sub' ×Ó×Ö·û´®?%b \n", content, Pattern.matches(pattern, content));

//		Pattern pattern1 = Pattern.compile("sub");
		Pattern pattern1 = Pattern.compile("\\\\t");
		Matcher matcher1 = pattern1.matcher("\\t\\tsubdirsub1");
//		System.out.printf("×Ö·û´®[%s]ÖÐÊÇ·ñ°üº¬ÁË 'sub' ×Ó×Ö·û´®?%b \n", "\\tsubdir1", matcher1.matches());
//		System.out.println(matcher1.find());
		while (matcher1.find()) {
			System.out.println(matcher1.group(0));
		}
		
		Pattern patter2 = Pattern.compile("\\.");
		System.out.println(Pattern.matches("\\.", "dir"));
		System.out.println(Pattern.matches("\\.", "file1.exe"));
	
		Pattern pattern3 = Pattern.compile("^[-\\+]?[\\d]*$");
		System.out.println(pattern3.matcher("8").matches());

	}
}
