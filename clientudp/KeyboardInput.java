/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client2udp;

import java.util.Scanner;

/**
 *
 * @author matteo.palitto
 */
class KeyboardInput implements Runnable {

    public KeyboardInput(String IPaddr, int UDPport) {
        
        Scanner tastiera = new Scanner(System.in);

        String frase;

        do {
            System.out.print("client 1: ");
            frase = tastiera.nextLine();
                
            } while (frase.compareTo("quit") != 0);
    }

    @Override
    public void run() {

    }
    
}
