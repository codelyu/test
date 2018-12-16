package com.msg.code;

import java.math.BigDecimal;

public class Zi extends Fu {
	int a = 5;

	public void set() {
		System.out.println("子类");
	}

	@Override
	public long  work() {
		return super.work();
	}
}
