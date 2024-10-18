/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author gabriele tosti
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scelta del numero dei numeri da estrarre
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci il numero delle colonne");
        int colonna = scanner.nextInt();
        
        System.out.println("Inserisci il numero delle righe");
        int riga = scanner.nextInt();
        
        scanner.close();
        // Istanza ed avvio del thread Estrazione
       Estrazione e = new Estrazione(riga,colonna);
       e.start();
        // Istanza di alcuni thread Giocatore
       Giocatore g1 = new Giocatore(1, "mario", e);
       Giocatore g2 = new Giocatore(2, "fabio", e);
       Giocatore g3 = new Giocatore(3, "enzo", e);
        // Avvio dei thread Giocatori
       g1.start();
       g2.start();
       g3.start();
       
        try {
            g1.join();
            g2.join();
            g3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore join");
        }
        // Comunicazione fine gioco
        System.out.println("FINE GIOCO.");
    }
}
   