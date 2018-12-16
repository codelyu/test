package com.msg.动态代理;

/**
 * 目标对象
 * 
 * @author My
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public String eat(String food) {
		return "目标对象" + food;
	}

}
