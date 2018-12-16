package com.msg.code;

import java.io.IOException;
import java.util.Collections;

public class StringDemo {
	public static void main1(String[] args) throws IOException {
		String str = "abcd";
		str = "1233";
		System.out.println(str);
		String str1 = str.substring(0, 2);
		System.out.println(str1);
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.insert(2, "123"); // ab123c
		System.out.println(sb);
		System.in.read();
//		Collections.addAll(c, elements)
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		Integer[] b = { 4, 5, 6, 2, 3 };
		System.arraycopy(a, 0, b, 0, 3);
		for (Integer a1 : a) {
			System.out.print(a1);
		}
		System.out.println("----------------");
		for (Integer a1 : b) {
			System.out.print(a1);
		}

	}
}
