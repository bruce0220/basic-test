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
public class NewBuyerProxy extends Colleague implements INewBuyer {

	INewBuyer origin ;
	
	public NewBuyerProxy() {
	}

	@Override
	void receiveMsg(String str) {
		origin.newBuyerBuy2();
	}


	public void setOrigin(INewBuyer origin) {
		this.origin = origin;
	}

	public void newBuyerBuy() {
		origin.newBuyerBuy();
		super.mediator.receiveMsg("test", 5);
	}

	public void newBuyerBuy2() {
		origin.newBuyerBuy2();
	}
	

}
