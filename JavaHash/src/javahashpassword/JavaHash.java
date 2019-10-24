/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashpassword;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author matteo
 */
public class JavaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username, passwd = ""; //lo user name e password inserite da tastiera
        Scanner tastiera = new Scanner(System.in);
        HashMap<String, String> utenti = new HashMap<String, String>();
        
        do {
          do {
            System.out.print("inserisci lo User Name >");
            username = tastiera.nextLine();
            if(username.equalsIgnoreCase("quit")) { 
                return; 
            }

            //If a string was returned, say so.
            if (username.length() > 0) {
                System.out.print("inserisci la password >");                
                passwd = tastiera.nextLine();
                passwd = "" + passwd.hashCode();
            }    

            System.out.println("user name:\"" + username + "\"");
        } while(username.length() == 0);
        System.out.println("Successfully Updated: " + passwd.hashCode());
        if(utenti.get(username) == null) {
            System.out.println("Nuovo utente registrato");                
            utenti.put(username, "" + passwd);
        } else if (utenti.get(username).equals(passwd)) {
            System.out.println("Welcome " + username);
        } else { 
            System.out.println("Errore: password non riconosciuta!");
        }
        } while (true);
    }
    
    
}
