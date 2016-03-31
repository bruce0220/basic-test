/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.interrupttest;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ14ÈÕ
 * @version 1.0.0
 */
public class BioInteruptTest {

	/**
	 * 
	 */
	public BioInteruptTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BioInteruptTest self = new BioInteruptTest();
		self.test1();
	}

	public void test1() {
		BioThread1 t1 = new BioThread1();
		t1.start();
		t1.interrupt();
		t1.close();
	}
	
	class BioThread1 extends Thread {
		
		volatile Socket socket;
		
		@Override
		public void run() {
			 try {
				  socket = new Socket("192.168.8.102",6380);
				 InputStream is =  socket.getInputStream();
				 is.read();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void close() {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
