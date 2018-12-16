package com.msg.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestArray {
	
	public static void main(String[] args) {
		Test test = new Test();
		Map<String, Object> list= new HashMap<String, Object>();
		list.put("type", 0);
		list.put("msg", "");
		test.setList(list);
		test.setStatus(0);
		
		
		Test test1 = new Test();
		Map<String, Object> list1= new HashMap<String, Object>();
		list1.put("type", 1);
		list1.put("msg", "");
		test1.setList(list);
		test1.setStatus(1);
		
		Test [] objArr = {test,test1};
		System.out.println(objArr.toString());
		for (Test obj : objArr) {
			Map<String, Object> list2 = obj.getList();
			if(obj.getStatus()==1) {
				list2.forEach((k,v)->{
					if(Integer.valueOf(String.valueOf(list2.get("type")))==1) {
						System.out.println("A");
					}
				});
			}else {
				System.out.println("B");
			}
			
		}
		
		
		
	}

}
