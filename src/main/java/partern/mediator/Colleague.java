/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package partern.mediator;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2016��1��25��
 * @version 1.0.0
 */
public abstract class Colleague {

	Mediator mediator;
	
	abstract void receiveMsg(String str);
}
