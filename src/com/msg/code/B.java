package com.msg.code;

public class B {
	public static void main(String[] args) {
		Integer a = 3210;
		change(a);
	}

	private static void change(Integer  a) {
	
		String b = a + "";
		StringBuffer buffer = new StringBuffer(b);
		StringBuffer reverse = buffer.reverse();
		int parseInt = Integer.parseInt(reverse.toString());
		System.out.println(parseInt);
	}
}
