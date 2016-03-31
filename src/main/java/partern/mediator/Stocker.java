/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package partern.mediator;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016Äê1ÔÂ25ÈÕ
 * @version 1.0.0
 */
public class Stocker  extends Colleague {

	private int count = 10;
	
	
	public Stocker() {
	}

	public int getStatus() {
		return count;
	}
	
	
	public void decrease(int n) {
		count = count - n;
	}
	
	public void increase(int n) {
		count = count + n;
	}
	
	public void notifyBuyerSeller() {
		
	}

	@Override
	void receiveMsg(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
