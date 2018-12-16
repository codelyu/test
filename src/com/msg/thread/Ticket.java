package com.msg.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
	int ticket = 100;
	// Object obj = new Object(); synchronized
	Lock lock = new ReentrantLock();

	/**
	 * 同步代码块
	 */
	public void run1() {
		while (true) {
			// synchronized (obj) {
			lock.lock();
			if (ticket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("在卖第" + ticket-- + "张票");
			}
			lock.unlock();
			// }

		}

	}

	/**
	 * 同步方法
	 */
	@Override
	public void run() {
		while (true) {
			method1();
		}
	}

	private synchronized void method1() {
		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("在卖第" + ticket-- + "张票");
		}
	}
}
