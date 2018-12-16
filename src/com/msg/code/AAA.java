package com.msg.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AAA {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("2");
		list.add("3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String next = it.next();
			if ("a".equals(next)) {
				list.add("33"); // 迭代器里面添加元素的
			}
		}
		System.out.println(list);

	/*	ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String next = listIterator.next();
			if ("a".equals(next)) {
				listIterator.add("33"); // 迭代器里面添加元素的
			}

		}
		System.out.println(list);
*/
	}
}
