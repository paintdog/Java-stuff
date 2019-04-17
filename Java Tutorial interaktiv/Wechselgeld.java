import java.util.Scanner;

// http://www.gailer-net.de/tutorials/java/Notes/chap10/progExercises10.html | Aufgabe 3 — Wechselgeld
// Eigabe (in Cent):  163  

public class Wechselgeld{
  
  public static void main(String... args) {
    
    System.out.println("Geben Sie das Wechselgeld ein:");
    
    // Eingabe
    Scanner eingabe = new Scanner(System.in);
    int centInput = eingabe.nextInt();
    eingabe.close();
    
    // Verarbeitung
    int restCent = centInput;
    
    int dollar = restCent / 100;
    restCent -= dollar * 100;
    
    int quarter =  restCent / 25;
    restCent -= quarter * 25;
    
    int dime = restCent / 10;
    restCent -= dime * 10;
    
    int nickel = restCent / 5;
    restCent -= nickel * 5;    
    
    // Ausgabe
    System.out.println("Das Wechselgeld ist "+ dollar +" Dollar, "+ quarter +" Quarter, "+ dime +" Dime, "+ nickel +" Nickel und "+ restCent +" Cent.");      
  } 
}
