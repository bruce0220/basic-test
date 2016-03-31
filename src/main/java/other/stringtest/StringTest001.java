/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.stringtest;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê10ÔÂ21ÈÕ
 * @version 1.0.0
 */
public class StringTest001 {

	
	/**
	 * 
	 */
	public StringTest001() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTest001 self = new StringTest001();
//		self.method1();
//		self.method2();
		self.method3();
	}
	
	public void method1() { 
		//the same string; syned
		ThreadA ta = new ThreadA("a");
		ThreadA tb = new ThreadA("a");
		
		//the different string, not syned
//		ThreadA ta = new ThreadA("a");
//		ThreadA tb = new ThreadA("b");
		
		ta.start();
		tb.start();
	}
	
	public void method2() {
		//the different string, not syned
		String a = new String("a");
		String b = new String("a");
		
		//the different string, not syned
//		String a = new String("a");
//		String b = new String("b");
		
		ThreadA ta = new ThreadA(a);
		ThreadA tb = new ThreadA(b);
		ta.start();
		tb.start();
	}
	
	public void method3() {
		//the different string, not syned
//		String a = new String("a");
//		String b = new String("a");
		
		//the different string, not syned
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		
		
		ThreadB ta = new ThreadB(a);
		ThreadB tb = new ThreadB(b);
		ta.start();
		tb.start();
	}
	
	class ThreadA extends Thread {
		
		String lockStr ;
		
		public ThreadA( String lockStr) {
			this.lockStr = lockStr;
		}
		
		@Override
		public void run() {
//			synchronized (lockStr) {
			synchronized (lockStr.intern()) {
				System.out.println("syn entered");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class ThreadB extends Thread {
		
		Object lockStr ;
		
		public ThreadB( Object lockStr) {
			this.lockStr = lockStr;
		}
		
		@Override
		public void run() {
			synchronized (lockStr) {
				System.out.println("syn entered");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
