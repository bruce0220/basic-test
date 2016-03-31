/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.nullcall;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015年10月12日
 * @version 1.0.0
 */
public class NullCall {

	/**
	 * 
	 */
	public NullCall() {
		
	}
	
	public static void main(String[] args) {
//		methoda(null);//不能这样调用
		String a = null;
		methoda(a);
		Integer b = null;
		methoda(b);
	}
	
	static void methoda(Integer b) {
		System.out.println("m2");
	}
	
	static void methoda(String a) {
		System.out.println("m1");
	}
	
	

}
