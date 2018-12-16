package com.msg.array;

public class BubbleSort {
	public static void main(String[] args) {
		int[]arr=new int[500000];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr.length-i;
		}
		long start=System.currentTimeMillis();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
//		for (int i : arr) {
//			System.out.println(i);
//		}
	}

}
