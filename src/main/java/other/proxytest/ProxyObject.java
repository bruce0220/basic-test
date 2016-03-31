/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015年9月14日
 * @version 1.0.0
 */
public class ProxyObject  implements InvocationHandler{

	TargetInterface target;
	
	/**
	 * 
	 */
	public ProxyObject( TargetInterface target ) {
		super();
		this.target = target;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		 System.out.println("before aop.");
//		 return method.invoke(proxy, args);//这样写会导致死循环
		 return method.invoke(target, args); 
//		 Object result = method.invoke(target, args);  
//		 return result;
	}
	
	
	public Object getProxy() {
//		 return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		 return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
	}

}
