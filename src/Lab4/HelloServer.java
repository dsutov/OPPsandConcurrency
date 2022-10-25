package Lab4;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloServer
{

	public static void main(String[] args) throws Exception {
		
		Socket socket;
		ServerSocket serverSocket = new ServerSocket(1562);
		
		while(true){
			
			System.out.println("Server: Waiting for a connection");
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			Scanner scanner = new Scanner(in);
			OutputStream out = socket.getOutputStream();
			PrintWriter p = new PrintWriter(out);
			
			String inputLine = scanner.nextLine();
			
			//Send string back to client
			p.println("Hello " + inputLine + " from Hello Server");
			p.close();
		}

	}

}
