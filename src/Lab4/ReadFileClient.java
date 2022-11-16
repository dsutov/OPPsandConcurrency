package Lab4;

/**
 * Client calls the server with the file to be read
 *
 * @author Dennis Sutov
 * @version 25/10/2022
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ReadFileClient
{

    public static void main(String[] args) throws IOException {
        InetAddress inet = InetAddress.getByName("192.168.22.1"); // uses the ip address

        Socket s = new Socket(inet, 2001);
        InputStream in = s.getInputStream();
        Scanner r = new Scanner(in);
        OutputStream o = s.getOutputStream();
        PrintWriter p = new PrintWriter(o);

        p.println("src/Lab4/testing.txt");
        p.flush();

        String line;
        while (r.hasNextLine()){
            line = r.nextLine();
            System.out.println(line);
        }


    }
}
