package com.msg.thread;

public class ThreadTest   extends  Thread{

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		ThreadTest f = new ThreadTest();
		t.start();
		System.out.println("one.");
		f.start();
		System.out.println("two.");
	}


	public  void run() {
		System.out.println("thread");
	}
}
