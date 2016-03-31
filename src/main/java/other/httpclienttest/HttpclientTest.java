/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.httpclienttest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;


/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015年9月25日
 * @version 1.0.0
 */
public class HttpclientTest {

	/**
	 * 
	 */
	public HttpclientTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HttpclientTest self = new HttpclientTest();
		try {
//			self.test1();
//			self.test2();
			self.test3();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test1() throws ClientProtocolException, IOException {
		HttpUriRequest req = new HttpGet("http://www.baidu.com");
//		HttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(20);
		HttpClientBuilder hb1 = HttpClientBuilder.create().setConnectionManager(connManager);
		CloseableHttpClient client1 = hb1.build();
		CloseableHttpResponse resp1 = client1.execute(req);
		 resp1 = client1.execute(req);
		 resp1.close();
		 System.out.println();
//		 client1.close();//关闭后不可以连接
		System.out.println();
		 resp1 = client1.execute(req);
		 System.out.println();
	}
	
	public void test2() throws ClientProtocolException, IOException {
		HttpUriRequest req = new HttpGet("http://www.baidu.com");
//		HttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(1);
		HttpClientBuilder hb1 = HttpClientBuilder.create().setConnectionManager(connManager);
		CloseableHttpClient client1 = hb1.build();
		CloseableHttpResponse resp1 = client1.execute(req);
		System.out.println();
		
		connManager.setMaxTotal(2);
		resp1 = client1.execute(req);
		System.out.println();
		 client1.close();//关闭后不可以连接
	}
	
	public void test3() throws ClientProtocolException, IOException {
		HttpUriRequest req = new HttpGet("http://www.baidu.com");
//		HttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(1);
		HttpClientBuilder hb1 = HttpClientBuilder.create().setConnectionManager(connManager);
		CloseableHttpClient client1 = hb1.build();
		CloseableHttpResponse resp1 = client1.execute(req);
		System.out.println();
		CloseableHttpClient client2 = hb1.build();
		CloseableHttpResponse resp2 = client2.execute(req);
		
		
	}

}
