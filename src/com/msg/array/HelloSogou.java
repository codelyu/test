package com.msg.array;

public class HelloSogou {
	public static synchronized void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				Sogou();
			}
		};
		t.run();
		System.out.println("Hello");
	}

	static synchronized void Sogou() {
		System.out.println("Sogou");
	}
}
