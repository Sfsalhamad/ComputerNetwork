package sclient;

import java.io.*;
import java.net.*;
public class SClient {

    public static void main(String[] args) throws IOException {
        try{
        Socket s = new Socket("127.0.0.1",9699);
                 System.out.println("connected =)");

        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        Writer output  = new OutputStreamWriter(s.getOutputStream());
        
        ChatUI theUI = new ChatUI("Client End", output);
        
       
        
        String line;

        while ((line = input.readLine()) != null) {
            theUI.appendText(line);

        }
        
    }
        catch (ConnectException e){
            System.out.println("Cannot reach Server");
        }
        catch (SocketException e){
            System.out.print("Server closed");
        }
                    }
}
