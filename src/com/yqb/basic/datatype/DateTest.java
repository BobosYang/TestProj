package com.yqb.basic.datatype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
	public static void main(String[] args) {
		String dateStr = "2019-05-23T16:00:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			Date date = sdf.parse(dateStr);
			System.out.println(date);
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println(sdf.format(date));
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			System.out.println(sdf1.parse(sdf.format(date)));
		} catch (ParseException e) {
		}
	}
}
