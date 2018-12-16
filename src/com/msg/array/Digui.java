package com.msg.array;

public class Digui {
	public static void main(String[] args) {
		int method = method(3);
		System.out.println(method);
	}

	private static int method(int n) {
		if (n == 1) {
			return 1;
		} else {
			int num = n * method(n - 1);
			return num;
		}
	}
}
