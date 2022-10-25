package Lab4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedFileServerApp
{

    public static void main(String[] args) throws IOException {
        System.out.println("Server Ready");

        ServerSocket ss = new ServerSocket(2001);

        while(true) {
            Socket s = ss.accept();
            Thread t = new WorkerThread(s);
            t.start();
        }

    }
}
