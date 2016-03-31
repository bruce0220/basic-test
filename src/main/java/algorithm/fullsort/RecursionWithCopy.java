/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package algorithm.fullsort;

import java.util.Arrays;


/**
 * ʹ������copy
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016��3��7��
 * @version 1.0.0
 * 
 * ��1��2��2��3��4��5���������֣���javaдһ�����򣬴�ӡ�����в�ͬ�����У��磺512234��412345�ȣ�Ҫ��"4"�����ڵ���λ��"3"��"5"����������

 */
public class RecursionWithCopy {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RecursionWithCopy self = new RecursionWithCopy();
//		int[] arr = {1,2,3,4};
		int[] arr = {1,2,3};
		self.fullSort(arr, 0, arr.length - 1);
	}
	
	public void fullSort(int[] arr2, int start,final int end) {
		int [] arr = Arrays.copyOf(arr2, arr2.length);
		if (start == end) {
			printResult(arr);
		} else {
			fullSort(arr, start + 1, end);
			
			for (int i = start + 1; i <= end; i++) {
				int tmp = arr[i];
				arr[i] = arr[start]; 
				arr[start] = tmp;
				fullSort(arr, start + 1, end);
				
			}
		}
	}
	
	private void printResult(int[] sorted) {
		for (Integer e : sorted) {
			System.out.print(" ");
			System.out.print(e);
		}
		System.out.println();
	}

}
