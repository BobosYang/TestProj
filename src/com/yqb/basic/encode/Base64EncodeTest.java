package com.yqb.basic.encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

public class Base64EncodeTest {
	public static void main(String[] args) {
//		try {
//			final Base64.Decoder decoder = Base64.getDecoder();
//			final Base64.Encoder encoder = Base64.getEncoder();
//			final String text = "×Ö´®ÎÄ×Ö";
//			final byte[] textByte = text.getBytes("UTF-8");
//			// ±àÂë
//			final String encodedText = encoder.encodeToString(textByte);
//			System.out.println(encodedText);
//			// ½âÂë
//			System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		String base64EncodeString = "QzEwNjk1JjE2MjkzMzI3MTU5Nzg=";
		String base64DecodeString = decodeBase64(base64EncodeString);
		System.out.println(base64DecodeString);
		
		String[] usernumberArray = base64DecodeString.split("&");
		System.out.println(Arrays.toString(usernumberArray));
	}

	private static String decodeBase64(String target) {
		try {
			Base64.Decoder decoder = Base64.getDecoder();

			return new String(decoder.decode(target), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

}
