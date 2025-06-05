package Uppgift_1;

import java.util.Scanner;

public class UppgiftMain {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     UppgiftLogic text = new UppgiftLogic();

     System.out.println("Hej!");
     System.out.println("Skriv hur mycket du vill och få uträknat hur många rader, tecken och ord du skrivit. Du får också veta vilket ord som var längst. :)");
     System.out.println("För att avsluta, skriv 'stopp'");

     String allInput = "";


     while (true) {
         String newInput = scan.nextLine();

         if (newInput.equals("stopp")) {
             break;
         }

            text.addText(newInput);
            allInput = allInput + newInput + " ";
     }

     System.out.println("Du har skrivit " + text.getRows() + " rader, " + text.getChars() + " tecken & " + text.getWords() + " ord.");
     System.out.println("Ditt längsta ord var " + text.getLongestWord() + ".");

    }
}