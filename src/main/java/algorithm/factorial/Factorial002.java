/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package algorithm.factorial;

import java.util.Stack;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê3ÔÂ7ÈÕ
 * @version 1.0.0
 */
public class Factorial002 {

	public static void main(String[] args) {
		Factorial002 self = new Factorial002();
		self.cal(6);
	}
	
	public void cal(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= n; i++) {
			stack.push(i);
		}
		
		Integer ret = null;
		while (!stack.empty()) {
			if (ret == null) {
				ret = stack.pop();
			} else {
				Integer tmp = stack.pop();
				ret = Math.multiplyExact(ret, tmp);
			}
		}
		System.out.println(ret);
	}
}
