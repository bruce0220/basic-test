/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package algorithm.fullsort;


/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê3ÔÂ7ÈÕ
 * @version 1.0.0
 */
public class StupidSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StupidSort self = new StupidSort();
		self.m1();
//		System.out.println(self.power(10, 3));;
	}
	
	public void m1() {
		int[] arr = new int[3];
		for (int num = 123; num <= 321; num++ ) {
			int[] tmps = new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				tmps[j] = (num/power(10, arr.length - j -1)) % 10;
			}
			
			if(!checkNums(tmps)) {
				continue;
			}
			
			printArr(tmps);
		
			System.out.println();
		}
	}

	private boolean checkNums(int[] tmps) {
		for (int tmp : tmps) {
			if (tmp < 1 || tmp > 3) {
				return false;
			}
		}
		return true;
	}

	private void printArr(int[] tmps) {
		for (int tmp : tmps) {
			System.out.print(tmp);
			System.out.print(" ");
		}
	}

	private int power(int a, int b) {
		int ret = 1;
		for (int i = 1; i <= b; i++) {
			ret = ret * a;
		}
		return ret;
	}

}
