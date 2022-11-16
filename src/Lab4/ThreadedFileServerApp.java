package Lab4;

/**
 * Server listens for any clients
 * Calls the worker thread when client connects
 *
 * @author Dennis Sutov
 * @version 25/10/2022
 */

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
