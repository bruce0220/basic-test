/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package algorithm.fullsort;



/**
 * ��ʹ������copy
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016��3��7��
 * @version 1.0.0
 * 
 * ��1��2��2��3��4��5���������֣���javaдһ�����򣬴�ӡ�����в�ͬ�����У��磺512234��412345�ȣ�Ҫ��"4"�����ڵ���λ��"3"��"5"����������

 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Recursion self = new Recursion();
//		int[] arr = {1,2,3,4};
		int[] arr = {1,2,3};
		self.fullSort(arr, 0, arr.length - 1);
	}
	
	public void fullSort(int[] arr, int start,final int end) {
		System.out.println("start: " + start);
		if (start == end) {
			printResult(arr);
		} else {
			fullSort(arr, start + 1, end);
			
			for (int i = start + 1; i <= end; i++) {
				
				System.out.println("start: " + start + ", i: " + i);
				
				exchange(arr, start, i);
				
				fullSort(arr, start + 1, end);
				
				exchange(arr, i, start);
				
				System.out.print("");
			}
		}
	}

	private void exchange(int[] arr, int start, int i) {
		int tmp = arr[i];
		arr[i] = arr[start]; 
		arr[start] = tmp;
	}
	
	private void printResult(int[] sorted) {
		for (Integer e : sorted) {
			System.out.print(" ");
			System.out.print(e);
		}
		System.out.println();
	}

}
