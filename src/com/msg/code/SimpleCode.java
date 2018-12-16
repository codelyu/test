package com.msg.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCode {
	public static void main1(String[] args) {
		Integer[] arr = { 1, 2, 34, 5, 6, 7 };
		List<Integer> list = Arrays.asList(arr);

		Map<String, String> map = new HashMap<String, String>();
		map.put("aa", "222");
		map.forEach((k, v) -> System.out.println(k + "  " + v));
	}

	private static void print(String k, String v) {
		// TODO Auto-generated method stub
		System.out.println(k + "   " + v);
	}

	public static void main2(String[] args) {
		int x = 20;
		{
			int y = 20;
			System.out.println(y);// 读取 y 变量中的值失败，失败原因，找不到 y 变量，因为超出了 y 变量
			// 作用范围，所以不能使用 y 变量
		}
		System.out.println(x);// 读取 x 变量中的值，再打印

	}

	public static void main3(String[] args) {
		long a = 12345L;
		float b = 222222222F;
		long c = (long) b;// 强制转换

	}

	public static void main4(String args[]) {
		int i = 1, j;
		float f1 = 0.1f;
		float f2 = 123;
		long l1 = 12345678, l2 = 88888888;
		double dl = 2e20, d2 = 124;
		byte bl = 1, b2 = 2;// b3 = 129;//超出范围
		// j = j+10;
		// i = (byte) (i/10);
		// i= i*0.1;
		char cl = 'a', c2 = 125;
		byte b = (byte) (bl - b2);
		char c = (char) (cl + c2 - 1);
		float f3 = f1 + f2;
		float f4 = f1 + f2 * 0.1f;
		// double d = dl*b+j;
		float f = (float) (dl * 5 + d2);
	}

	public static void main(String[] args) {
		List<Integer> list=new  ArrayList<Integer>();
		//list.remove(index);
		//list.add
		int i = 1;
		do {
			i++;
			System.out.println(i);

		} while (i < 4);
	}

	public int get(String i) {
		return 0;
	}

	public int get(int i) {
		return 0;
	}
}
