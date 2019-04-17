import java.util.Scanner;

// http://www.gailer-net.de/tutorials/java/Notes/chap10/progExercises10.html | Aufgabe 2 — Cent zu Dollar

public class Cent2Dollar {
  
  public static void main(String[] args) {
    
    // Eingabe
    System.out.println("Geben Sie die Cent ein:");
    
    Scanner centScanner = new Scanner(System.in);
    int cents = centScanner.nextInt();
    centScanner.close();
    
    // Vearbeitung und Ausgabe
    System.out.println("Das ergibt " + cents / 100 + " Dollar und " + cents % 100 + " Cent.");
    
    }
}
