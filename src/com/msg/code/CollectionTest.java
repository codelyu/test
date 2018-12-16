package com.msg.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) { // throws ArrayIndexOutOfBoundsException

		// itator();
		// getArray();
		int[] arr = null;
		// new String(bytes, 0, 2);
		try {
			arr = new int[3];
			System.out.println(arr[5]);// 会抛出 ArrayIndexOutOfBoundsException
			// 当产生异常时，必须有处理方式。要么捕获，要么声明。
		} catch (ArrayIndexOutOfBoundsException e) { // 括号中需要定义什么呢？try 中抛出
			// 的是什么异常，在括号中就定义什么异常类型。
			System.out.println("异常发生了");
		} finally {
			arr = null; // 把数组指向 null，通过垃圾回收器，进行内存垃圾的清除
		}
		System.out.println("程序运行结果");
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 0, 0, 0, 4, 5 };
		System.arraycopy(a, 0, b, 0, 3);
		
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println("----------------");
		for (int i : b) {
			System.out.print(i);
		}
		// System.out.println(b);
	}

	public static void itator() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
		/*
		 * for (String str : coll) { if (str.equals("c")) {
		 * System.out.println("__________________-"); coll.remove(str); }
		 * 
		 * }
		 */
		System.out.println(coll);
		Iterator<String> it = coll.iterator();
		while (it.hasNext()) {
			String next = it.next();
			// System.out.println(it.next());
		}
	}

	public static void getArray() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
		String[] arr = new String[4];
		String[] array = coll.toArray(arr);
		System.out.println(array);
	}

	public static void map() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "value");
		Set<Entry<String, Object>> entrySet = map.entrySet();
		

		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}

		for (Object value : map.values()) {
			System.out.println(value);
		}
		Iterator<Entry<String, Object>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getKey() + "" + iterator.next().getValue());
		}
	}
}
