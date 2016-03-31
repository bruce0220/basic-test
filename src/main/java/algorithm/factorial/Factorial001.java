/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package algorithm.factorial;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê3ÔÂ7ÈÕ
 * @version 1.0.0
 * aaa
 */
public class Factorial001 {


	public static void main(String[] args) {
		Factorial001 self = new Factorial001();
		System.out.println(self.calculate(6));
	}
	
	public int calculate(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n*calculate(n-1);
		}
	}
}
