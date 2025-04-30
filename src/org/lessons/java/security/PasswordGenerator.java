package org.lessons.java.security;

import java.sql.Date;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = input.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito: ");
        String colore = input.nextLine();
        
        System.out.println("Inserisci la tua data di nascita (yyyy-mm-dd): ");
        Date dataNascita = Date.valueOf(input.nextLine());
        
        String password = nome + "-" + cognome + "-" + colore.toLowerCase() + "-" + dataNascita.toString().substring(0, 4);
        
        System.out.println("La tua password generata " + '\u00E9' + ": " + password);

    }
}