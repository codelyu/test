package com.msg.code;

class Party {
	/*
	 * class Ball {// 内部类，气球 public void puff() { System.out.println("气球膨胀了"); } }
	 */

	// 外部类，聚会
	public void puffBall() {// 吹气球方法
		class Ball {// 内部类，气球
			public void puff() {
				System.out.println("气球膨胀了");
			}
		}
		// 创建内部类对象，调用 puff 方法
		new Ball().puff();
	}

	public static void main(String[] args) {
		// new Party().new Ball().puff(); //成员内部类
		new Party().puffBall();

		new User() {
			public void run() {
				System.out.println("匿名内部类");
			};
		}.start();
	}

}
