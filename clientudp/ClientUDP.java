/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client2udp;

import clientudp.*;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        KeyboardInput keyInput= new KeyboardInput(IP_address, UDP_port);

        // Richiedo utente di inserire messaggio da inviare chat
        Thread inputUtente;
        inputUtente = new Thread(keyInput);
        inputUtente.start();
                
        client = new UDPClientSocket();

        // Aspetto che l'utente esca prima di chiudere il socket
        try {
            inputUtente.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientUDP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        client.close_socket();

    }
}
