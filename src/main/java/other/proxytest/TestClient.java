/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.proxytest;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ14ÈÕ
 * @version 1.0.0
 */
public class TestClient {

	/**
	 * 
	 */
	public TestClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClient self = new TestClient();
		self.test1();
	}
	
	public void test1() {
		TargetInterface target = new ConcreteTarget();
		ProxyObject proxy = new ProxyObject(target);
		((TargetInterface)proxy.getProxy()).dosomething("hhh"); 
		 
	}

}
