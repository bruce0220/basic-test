package other.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {  
	    // �����������˿ں�8081  
	    ServerSocket serverSocket = new ServerSocket(8081);  
	  
	    // �ȴ�������������һ�������ķ���������������ʱ��Ż��������ִ��  
	    serverSocket.setSoTimeout(10000);
	    Socket socket = serverSocket.accept();  
	    serverSocket.getReuseAddress();
	   socket.getOOBInline();
	    // ��ȡ��������  
	    InputStream is = socket.getInputStream();  
	    InputStreamReader reader = new InputStreamReader(is);  
	  
	    // �����������  
	    while (true) {  
	        System.out.print((char)reader.read());  
	    }  
	}  

}
