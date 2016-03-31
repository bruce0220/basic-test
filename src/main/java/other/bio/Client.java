package other.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
//			Socket socket = new Socket("192.168.8.102", 11111);
			Socket socket = new Socket();
			socket.setSoTimeout(10000);
			socket.connect(new InetSocketAddress("192.168.8.102", 11111),30000);
			InputStream is = socket.getInputStream();
//			int n;
//			while ((n = is.read())!=-1) {
//				System.out.println(n);
//			}
			try {
				is.read();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				is.read();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			 
			
			System.out.println("read finished");
			 socket.getOutputStream();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
