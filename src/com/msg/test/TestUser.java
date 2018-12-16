package com.msg.test;
               //8.	Synchronized
public class   TestUser {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
	}
}
