package com.msg.static_proxy;
//B是代理
public class B implements C {
	private A a;
	//相当于把业务类注入声明进来

	
	@Override
	public void work(String food) {
		System.out.println("BBBBBBBBBBB中前置");
		a.work(food);
		System.out.println("BBBBBBBBBBB中后置");
	}
	public B(A a) {
		this.a = a;
	}

}
