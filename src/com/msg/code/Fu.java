package com.msg.code;

public class Fu {
	int a = 4;

	public void set() {
		System.out.println("父类");
	}

	public long work() {
		System.out.println("父类");
		return 0;
	}

	public Fu(int a) {
		super();
		this.a = a;
	}

	public Fu() {
		super();
	}

	public  void method() throws NullPointerException{ // 无法声明 throws Exception
		int[] arr = null;
		if (arr == null) {
			// 只能捕获处理
			//try {
				throw new RuntimeException("哥们，你定义的数组 arr 是空的!");
			//} catch (Exception e) {
				//System.out.println("父方法中没有异常抛出，子类中不能抛出 Exception 异常");
				// 我们把异常对象 e，采用 RuntimeException 异常方式抛出
				//throw new RuntimeException(e);
			//}
		}
	}
	
	public  void a() {
		new Fu().method();
	}
	
	public static void main(String[] args) {
		
	}

}
