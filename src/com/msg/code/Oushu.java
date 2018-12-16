package com.msg.code;

public class Oushu implements Runnable {
	@Override
	public void run() {
		Object obj=new  Object();

		synchronized (obj) {
			for (int i = 0; i <= 100; i += 2) {
				System.out.println(i);
				obj.notify();
				try {
					obj.wait();
					Thread.sleep(1000);// 防止打印速度过快导致混乱
				} catch (InterruptedException e) {
					// NO
				}
			}
		}
			
	}

}
