package com.msg.static_proxy;

public class Test {
	public static void main(String[] args) {
		A  a=new  A();
		B b = new B(a);
		b.work("苹果");
	}
}
