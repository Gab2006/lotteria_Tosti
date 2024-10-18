/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    private int numeri[][];
    private int numero; 
    private int vincitori[];
    private int numeroVincitori;
    private Random random = new Random();
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione(int riga, int colonna) {
        // popolamento matrice numeri estratti
        numeri = new int[riga][colonna];
        for (int i=0; i<riga; i++){
            for (int j=0; j<colonna; j++){
                numeri[i][j] = random.nextInt(0, 1000); 
            }
        }
        // inizializzazione array vincitori
        vincitori = new int[3];
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
           if (numero==this.numero){
               System.out.println("Giocatore: "+ idGiocatore + "ha scelto il numero: "+ numero +"e ha vinto!");
           }
           else{
               System.out.println("Hai perso.");
           }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        System.out.println("Estrazione in corso!");
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
        System.out.println("Fine estrazione");
    }
}


