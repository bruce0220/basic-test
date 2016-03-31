/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.interrupttest;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ11ÈÕ
 * @version 1.0.0
 */
public class InterruptedTest {

	/**
	 * 
	 */
	public InterruptedTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedTest self = new InterruptedTest();
		self.test1();
	}
	
	private void test1() {
		AThread athread = new AThread();
		athread.start();
		athread.interrupt();
		System.out.println();
	}
	
	class  AThread extends Thread {
		@Override
		public void run() {
			 try {
				 pseudoMethond();
				 int i = 0;
				 while (true) {
					 i++;
					 System.out.println(i);
				 }
			 } catch (InterruptedException e) {
				 System.out.println("catched, yell.");
			 }
		}
		
		private void pseudoMethond() throws InterruptedException {
		}
	}

}
