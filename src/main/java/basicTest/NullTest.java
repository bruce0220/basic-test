/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package basicTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ6ÈÕ
 * @version 1.0.0
 */
public class NullTest {

	/**
	 * 
	 */
	public NullTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add(null);
		
		HashMap<String, String> map = new  HashMap<String, String>();
		map.put(null, null);
		
//		Hashtable<String, String> tb = new Hashtable<String, String>();
//		tb.put(null, null);
		
		System.out.println(Integer.MAX_VALUE);
		
	}

}
