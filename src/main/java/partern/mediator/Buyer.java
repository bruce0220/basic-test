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
public class Buyer  extends Colleague {

	public Buyer() {
	}

	
	public void buyIt(int n) {
		super.mediator.receiveMsg("buyIt", n);
	}
	
	public void notifySeller2Reject() {
		
	}
	

	public void notifySeller2Seller() {
		
	}


	@Override
	void receiveMsg(String str) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
