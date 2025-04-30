package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        String nome;
        String cognome;
        String colore;
        // Date dataNascita = Date.valueOf("1993-05-15");
        int birthDay;
        int birthMonth;
        int birthYear;

        // Recupero i dati dall'utente
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome: ");
        nome = input.nextLine();
        
        System.out.println("Inserisci il tuo cognome: ");
        cognome = input.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito: ");
        colore = input.nextLine();
                      
        System.out.println("Inserisci il numero del giorno della tua data di nascita: ");
        birthDay = input.nextInt();

        System.out.println("Inserisci il numero del mese della tua data di nascita: ");
        birthMonth = input.nextInt();

        System.out.println("Inserisci l'anno della tua data di nascita: ");
        birthYear = input.nextInt();

        int dataNascita = birthYear + birthMonth + birthDay;

        
        String password = nome + "-" + cognome + "-" + colore.toLowerCase() + "-" + dataNascita;

        
        System.out.println("La tua password generata e': " + password);

        // System.out.println("Inserisci la tua data di nascita (yyyy-mm-dd): ");
        // Date dataNascita = Date.valueOf(input.nextLine());
        
        // String password = nome + "-" + cognome + "-" + colore.toLowerCase() + "-" + dataNascita.toString().substring(0, 4);


    }
}