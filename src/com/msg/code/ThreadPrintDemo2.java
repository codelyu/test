package com.msg.code;

class ThreadPrintDemo2 {
	//private static Object obj = new Object();

	public static void main(String[] args) {
		final ThreadPrintDemo2 demo2 = new ThreadPrintDemo2();
		//Thread t1 = new Thread(demo2::print1);// 方法引用,构造器引用
		//Thread t2 = new Thread(demo2::print2);
		int i=1;
		assert i==0:"sdf";
		System.out.println(i);
		//t1.start(); 
		//t2.start();
		/*
		 * Thread t1 = new Thread(new Jishu());
		 * Thread t2 = new Thread(new Oushu());
		 * 
		 */
	}

	/**
	 * 打印奇数
	 */
	public synchronized void print2() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			this.notify();
			try {
				this.wait();
				Thread.sleep(100);// 防止打印速度过快导致混乱
			} catch (InterruptedException e) {
				// NO
			}
		}
	}

	/**
	 * 打印偶数
	 */
	public synchronized void print1() {
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
			this.notify();
			try {
				this.wait();
				Thread.sleep(100);// 防止打印速度过快导致混乱
			} catch (InterruptedException e) {
				// NO
			}
		}
	}
}