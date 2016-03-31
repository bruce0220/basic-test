package other.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {  
	    // 服务器监听端口号8081  
	    ServerSocket serverSocket = new ServerSocket(8081);  
	  
	    // 等待接收请求，这是一个阻塞的方法，当请求到来的时候才会继续向下执行  
	    serverSocket.setSoTimeout(10000);
	    Socket socket = serverSocket.accept();  
	    serverSocket.getReuseAddress();
	   socket.getOOBInline();
	    // 获取请求内容  
	    InputStream is = socket.getInputStream();  
	    InputStreamReader reader = new InputStreamReader(is);  
	  
	    // 输出请求内容  
	    while (true) {  
	        System.out.print((char)reader.read());  
	    }  
	}  

}
