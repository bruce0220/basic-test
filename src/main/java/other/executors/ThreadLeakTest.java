/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.executors;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ10ÈÕ
 * @version 1.0.0
 */
public class ThreadLeakTest {

	ExecutorService exe = new ThreadPoolExecutor(1, 1,
            60L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>());
	
	public ThreadLeakTest() {
		
	}

	public static void main(String[] args) {
		ThreadLeakTest atest = new ThreadLeakTest();
//		atest.test1();
//		atest.test2();
		atest.test3();
	}
	
	public void test1() {
		exe.submit(new ATask(1));
		exe.submit(new ATask(2));
		exe.submit(new ATask(3));
		exe.submit(new ATask(4));
		
		exe.shutdown();
		System.out.println();
		exe.shutdownNow();
		System.out.println();
	}
	
	public void test2() {
		Thread t = new Thread(new ATask(1));
		t.start();
	}
	
	public void test3() {
		Thread t = new Thread(new ATask(1));
		
		UncaughtExceptionHandler myHandler = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				t = new Thread(new ATask(1));
				t.setUncaughtExceptionHandler(this);
				t.start();
				
			}
		};
		
		t.setUncaughtExceptionHandler(myHandler);
		t.start();
	}
	
	class ATask implements Runnable {
		int n;
		public ATask(int n) {
			this.n = n;
		}
		public void run() {
			
			while (!Thread.currentThread().isInterrupted()) {
//				for (int i=0; i<1; i++) {
					System.out.println(n);
//				}
				
				//throw new RuntimeException("test exp");
				
//				int a = 1/0;
				
//				String str = null;
//				System.out.println(str.length());
			}
			
		}
	}
	
	
}
