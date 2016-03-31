/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.http2test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê9ÔÂ25ÈÕ
 * @version 1.0.0
 */
public class Http2okhttp3Test {

	/**
	 * 
	 */
	public Http2okhttp3Test() {
	}

	public static void main(String[] args) {
		Http2okhttp3Test self = new Http2okhttp3Test();
		try {
			self.test1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test1() throws IOException{
		OkHttpClient client = new OkHttpClient();
		List<Protocol> protocols = new ArrayList<Protocol>();
		protocols.add(Protocol.HTTP_1_1);
		protocols.add(Protocol.HTTP_2);
		OkHttpClient newClient = client.newBuilder().protocols(protocols).build();

		
				
		 Request.Builder builder = new Request.Builder();
//		 Request request = builder.url("http://www.baidu.com").build();
//		 Request request = builder.url("https://www.baidu.com").build();
//		 Request request = builder.url("http://http1.xxshe.com/").build();
		 Request request = builder.url("https://http1.xxshe.com/").build();
		 
//		 Response rsp = client.newCall(request).execute();
		 Response rsp = newClient.newCall(request).execute();
		 System.out.println(rsp.code());
		 
		 rsp = client.newCall(request).execute();
		 System.out.println(rsp.code());
	}
}
