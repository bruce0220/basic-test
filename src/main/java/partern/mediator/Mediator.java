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
public class Mediator {
	
	Colleague buyer; 
	Colleague seller; 
	Colleague stoker; 
	
	public void receiveMsg(String msg, int num) {
		if (msg.equals("buyIt")) {
			stoker.receiveMsg("buyIt"+num);
		}
		
	}
	
}
