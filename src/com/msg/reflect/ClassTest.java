package com.msg.reflect;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 方法1
		Class<?> forName = Class.forName("com.msg.reflect.User");
		Object newInstance2 = forName.newInstance();
		System.out.println(forName);
		// 方法2
		User user = new User();
		Class<? extends User> class1 = user.getClass();
		User newInstance = class1.newInstance();
		System.out.println(class1);
		// 方法3
		Class<? extends User> class2 = User.class;
		System.out.println(class2);
	}
}
