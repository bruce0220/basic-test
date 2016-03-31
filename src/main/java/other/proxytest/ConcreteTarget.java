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
public class ConcreteTarget implements TargetInterface {

	/**
	 * 
	 */
	public ConcreteTarget() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see proxytest.TargetInterface#dosomething()
	 */
	public void dosomething(String str) {
		System.out.println("do some thing:"+str);
	}

}
