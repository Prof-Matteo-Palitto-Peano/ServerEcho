/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientudp;

import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author pc15
 */
public class ClientUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
        // TODO code application logic here
        String IP_address;
        int UDP_port;
        String frase, answer;
        UDPClientSocket client;
        
        IP_address="127.0.0.1";
        UDP_port=1077;
        
        Scanner tastiera = new Scanner(System.in);
        client = new UDPClientSocket();

        
        do {
            System.out.print("client 2: ");
            frase = tastiera.nextLine();
                
            answer = client.sendAndRecive(frase, IP_address, UDP_port);
            System.out.println("echo da server: " + answer);
            //client.close_socket();
        
            } while (frase.compareTo("quit") != 0);
    }
    
}
