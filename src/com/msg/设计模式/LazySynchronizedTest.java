package com.msg.设计模式;


public class LazySynchronizedTest {
	public static void main(String[] args) {
		User user1 =User.getInstance();
		User user2 = User.getInstance();
		System.out.println(user1);
		System.out.println(user2);
		new Thread() {
			public void run() {
				User user = User.getInstance();
				System.out.println(user);
			};
		}.start();
		new Thread() {
			public void run() {
				User user =User.getInstance();
				System.out.println(user);
			};
		}.start();
	}
}
