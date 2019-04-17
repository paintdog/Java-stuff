import java.util.Scanner;

// http://www.gailer-net.de/tutorials/java/Notes/chap10/progExercises10.html | Nr. 4

public class OhmschesGesetz{
  
  public static void main(String[] args) {
    
    Scanner eingabe = new Scanner(System.in);
    System.out.println("Geben Sie die Spannung (in Volt) ein:");
    double spannung = eingabe.nextDouble();
    
    System.out.println("Geben Sie den Widerstand (in Ohm) ein:");
    double widerstand = eingabe.nextDouble();
    
    System.out.println("Die Stromstärke beträgt "+ (spannung / widerstand) +" Ampere.");
    
    }
}
