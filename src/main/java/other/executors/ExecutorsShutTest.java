/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.executors;

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
public class ExecutorsShutTest {

	ExecutorService exe = new ThreadPoolExecutor(2, 4,
            60L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>(2));
	
	public ExecutorsShutTest() {
		
	}

	public static void main(String[] args) {
		ExecutorsShutTest atest = new ExecutorsShutTest();
		atest.test1();
	}
	
	public void test1() {
		exe.submit(new ATask(1));
		
		exe.shutdown();
		System.out.println();
		exe.shutdownNow();
		System.out.println();
	}
	
	class ATask implements Runnable {
		int n;
		public ATask(int n) {
			this.n = n;
		}
		public void run() {
			int i = 0;
			
//			while (true) {
////			while (!Thread.currentThread().isInterrupted()) {
//				System.out.println(i);
//			}
			
//			try {
				for (i=0; i<1000000;i++) {
					System.out.println(i);
//					Thread.sleep(1);
				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
}
