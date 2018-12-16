package com.msg.code;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

public class DateTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// System.out.println(c);
		Calendar calendar = new GregorianCalendar();
		Date time = calendar.getTime();
		System.out.println(time);
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("");
	}
}
