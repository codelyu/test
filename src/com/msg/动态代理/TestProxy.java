package com.msg.动态代理;

import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		ProxyFactory factory = new ProxyFactory(dao);
		UserDao obj = (UserDao) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), dao.getClass().getInterfaces(),
				factory);
		String eat = obj.eat("苹果");
		System.out.println(eat);
	}
}
