package sclient;

import java.io.*;
import java.net.*;

public class Ser {

    public static void main(String[] args) throws Throwable {
        try{
        ServerSocket ss = new ServerSocket(9699);
                 System.out.println("server is running =)");
        Socket s = ss.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));

        Writer output = new OutputStreamWriter(s.getOutputStream());

        ChatUI theUI = new ChatUI("Server End", output);

        String line;

        while ((line = input.readLine()) != null) {
            theUI.appendText(line);

        }
    } catch (Exception e) {
            System.out.println("port used");
        }
    }
}
