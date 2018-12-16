package com.msg.thread;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		System.out.println("test1----" + test1.list.size());
		System.out.println("test2----" + test2.list.size());

		test1.list = test2.list;
		List<Integer> test1list = test1.list;
		test1list.clear();
		System.out.println("test1----" + test1.list.size());
		System.out.println("test2----" + test2.list.size());

	}
}
