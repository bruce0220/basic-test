/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.listtest;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê10ÔÂ13ÈÕ
 * @version 1.0.0
 */
public class ListTest {

	/**
	 * 
	 */
	public ListTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] ints = {1,2,3,3};
		Integer[] ints = {1,2,3,3,3};
		List<Integer> list = Arrays.asList(ints);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(0).getClass());
		
		Integer[] ars = list.toArray(ints);
		System.out.println(ars[0]);
		System.out.println(ars[1]);
		System.out.println(ars[2]);
		
		Set<Integer> set = new TreeSet<Integer>(list);
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
		
	}

}
