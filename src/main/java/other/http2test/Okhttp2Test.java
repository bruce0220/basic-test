/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.http2test;

import java.io.IOException;

import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ25ÈÕ
 * @version 1.0.0
 */
public class Okhttp2Test {

	/**
	 * 
	 */
	public Okhttp2Test() {
	}

	public static void main(String[] args) {
		Okhttp2Test self = new Okhttp2Test();
		try {
			self.test1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test1() throws IOException{
		OkHttpClient client = new OkHttpClient();
		ConnectionPool connectionPool = new ConnectionPool(1, 2000);
		client.setConnectionPool(connectionPool);
		
				
		 Request.Builder builder = new Request.Builder();
//		 Request request = builder.url("http://www.baidu.com").build();
//		 Request request = builder.url("https://www.baidu.com").build();
//		 Request request = builder.url("http://http1.xxshe.com/").build();
		 Request request = builder.url("https://http1.xxshe.com/").build();
		 
		 Response rsp = client.newCall(request).execute();
		 System.out.println(rsp.code());
		 
		 rsp = client.newCall(request).execute();
		 System.out.println(rsp.code());
	}
}
