/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author gabriele tosti
 */
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nome;
    private Estrazione estrazione;
    private Random random = new Random();

    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * @param nome riferimento dell'oggetto Estrazione
    */
    
    public Giocatore(int idGiocatore, String nome, Estrazione estrazione) {
        this.idGiocatore = idGiocatore;
        this.nome = nome;
        this.estrazione = estrazione;
       // scelta del numero da giocare
       // verifica del risultato
       // stampa fine verifica
    }

    /**
     *
     * Metodo per eseguire il thread
     */
    public void run() {
        // presentazione
        System.out.println("id: "+ this.idGiocatore + "INIZIO");
        // scelta del numero da giocare
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli numero");
        int numeroScelto = scanner.nextInt();
        // conto alla rovescia
        for (int i=3; i>0; i--){
                    System.out.println(i);
                    try {
                        this.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("Errore nella fase di sleeping");
                    }
                }
        // verifica del risultato
        estrazione.verifica(numeroScelto, idGiocatore);
        // stampa fine verifica
        System.out.println("id: "+this.idGiocatore +", nome: "+this.nome+", FINE");
    }
}


