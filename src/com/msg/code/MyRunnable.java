package com.msg.code;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("线程中" + i);
		}
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa");
		list.add(0);
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
