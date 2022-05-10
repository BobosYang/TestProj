package com.yqb.basic.datatype;

public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(String.format("0:0####", "1111"));
		
		String raw = "hello";
//		String str = String.format("%1$7s", raw);
		// ��
		String str = String.format("%7s", raw);
		System.out.println(str);
		
		str = String.format("%1$-7s", raw);
		System.out.println(str);
		
		System.out.println(String.format("0%s", "1234"));
		
		System.out.println(String.format("��%dҳ", 10));
		
		System.out.println("���ڻ��ܷ�Ʊ��\\{invoiceNo\\}������У��ʧ��֪ͨ".replace("\\{invoiceNo\\}", "test"));
		
		System.out.println("abcdefgh".substring(0, 5));
		
		String test1 = "\\t\\tsubsubdir1";
		System.out.println(test1.indexOf("\\t"));
		System.out.println(test1.substring(test1.indexOf("\\t") + "\\t".length(), test1.length()));
		
		String test2 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
		String[] split2 = test2.split("\\n");
		System.out.println(split2.length);
		System.out.println(split2[3].replace("\t", "|"));
		
		System.out.println("\t".length());
		
		System.out.println("compare:" +("saeafa".compareTo("kds")));
		System.out.println("compare:" +("sa".compareTo("kdsasdf")));
		System.out.println("compare:" +("off key dog".compareTo("act zoo")));
		
	}
}
