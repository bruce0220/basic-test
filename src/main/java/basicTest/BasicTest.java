/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package basicTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ16ÈÕ
 * @version 1.0.0
 */
public class BasicTest {

	boolean ab;
	/**
	 * 
	 */
	public BasicTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		Integer e = list.get(0);
		e++;
		System.out.println(e);
		System.out.println(list.get(0));
		
		// TODO Auto-generated method stub
		BasicTest self = new BasicTest();
//		self.test1();
//		self.test2();
//		System.out.println(self.ab);
//		System.out.println("after invoke");
		
//		List<String> alist = new ArrayList<String>();
//		Collection<String> alist = new ArrayList<String>();
//		ArrayList<String> alist = new ArrayList<String>();
		
//		self.testDt(alist);
//		self.testDt(alist);
		
//		test4();
		
//		System.out.println(String.valueOf(null));
		
//		test5();
		
//		test6();
//		test7();
//		test8();
//		test9();
		test10();
	}

	private static void test10() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		Integer e = list.get(0);
		e++;
		System.out.println(e);
		System.out.println(list.get(0));
	}
	private static void test6() {
//		String org = "A$B$C";
		String org = "$A$B$C$";
//		StringTokenizer stz = new StringTokenizer(org, "$", false);
		StringTokenizer stz = new StringTokenizer(org, "$", true);
		while (stz.hasMoreElements()) {
			String str = (String) stz.nextElement();
			System.out.println(str);
		}
	}
	
	private static void test7() {
//		String org = "A$B$C";
		String org = "$a$P{0}$P{0}$C$";
//		StringTokenizer stz = new StringTokenizer(org, "$", false);
		StringTokenizer stz = new StringTokenizer(org, "$P", false);
		while (stz.hasMoreElements()) {
			String str = (String) stz.nextElement();
			System.out.println(str);
		}
	}
	
	private static void test8() {
//		String org = "$a$P{0}$P{0}$C$";
		String org = "$a$P{0}$P{0}$C$";
//		String[] orgs = org.split("\\$"); 
//		String[] orgs = org.split("$"); 
		String[] orgs = org.split("\\$P"); 
		for (String st : orgs) {
			System.out.println(st);
		}
	}
	
	private static void test9() {
		String org = "boo:and:foo";
//		String[] orgs = org.split(":",-2); // boo	and	foo	
//		String[] orgs = org.split(":",-1); // boo	and	foo	
//		String[] orgs = org.split(":",0); // boo	and	foo	
//		String[] orgs = org.split(":",1); //boo:and:foo
//		String[] orgs = org.split(":",2); // boo	and:foo	
//		String[] orgs = org.split(":",3); // boo	and:foo	
		String[] orgs = org.split(":",4); // boo	and:foo	
		for (String st : orgs) {
			System.out.print("ret:"+st+"\t");
		}
	}

	private static void test5() {
		String str = "0123";
		System.out.println(str.substring(0, 4));
	}

	private static void test4() {
		Object a = null;
		System.out.println("aaa"+a);
	}
	
	
	public void test2() {
		ATheard at = new ATheard();
		at.start();
		while (true ) {
			System.out.println("main");
		}
	}
	public void test1() {
//		String str="adfadf";
//		System.out.println(str.toCharArray());
		
		try {
			System.out.println("try");
			if ( 1 == 1) {
				throw new RuntimeException();
			}
		}  finally {
			System.out.println("finally");
		}
		System.out.println("return");
		return;
	}
	
	public void testDt(List<String> cs) {
		System.out.println("List");
	}
	
	public void testDt(Collection<String> cs) {
		System.out.println("Collection");
	}
	
	
	
	public class ATheard extends Thread {
		@Override
		public void run() {
			 assert false : "ERROR";
		}
	}

}
