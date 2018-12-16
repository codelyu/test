package com.msg.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {
	public static void main1(String[] args) {
		MyRunnable run = new MyRunnable();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("我main线程：正在执行！" + i);
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		MyRunnable run = new MyRunnable();
		Thread t1 = new Thread(run);
		service.submit(t1);
		service.shutdown();
	}
}
