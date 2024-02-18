package Morse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv morsekod, ett engelskt ord med versaler eller ett nummer:");
        String input = scan.nextLine();

            //felmeddelande om det är tomt
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Skriv något!");
            }
            //felmeddelande om det förekommer ÅÄÖ
            if (input.contains("Å") || input.contains("Ä") || input.contains("Ö")){
                throw new IllegalArgumentException("Endast Engelska ord!");
            }

        //Använder convertmetoden från Morse
        Morse morse = new Morse();
        String output = morse.convert(input);

        //Utskrift
        System.out.println("Resultat: " + output);

        } catch (Exception e) {
            System.err.println("Felmeddelande: " + e.getMessage()); //Utskrift av felmeddelande
        }
    }
}