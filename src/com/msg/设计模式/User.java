package com.msg.设计模式;
/**
 * 双重锁
 * @author My
 *
 */
public class User {
	private static User user = null;

	private User() {
		super();
	}

	public  static  User  getInstance() {
		if (user == null) {
			//synchronized (User.class) {
				//if(user==null) {
					user = new User();
			//}
				
			//}
		}
		return user;
	}

}