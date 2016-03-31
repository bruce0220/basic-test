/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package basicTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê1ÔÂ14ÈÕ
 * @version 1.0.0
 */
public class BasicTest2 {

	public BasicTest2() {
		
	}

	
	public static void main(String[] args) {
		BasicTest2 self = new BasicTest2();
		self.test1();
	}
	
	private void test1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		Integer e = list.get(0);
		e++;
		System.out.println(e);
		System.out.println(list.get(0));
	}
}
