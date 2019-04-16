import java.util.Scanner; 

public class KreisFlaeche {
       
  public static void main( String[] args ) {
    
    // Eigabe
    System.out.println("Geben Sie den Radius ein:");
    
    Scanner sc = new Scanner(System.in);
    String eingabe = sc.nextLine();
    sc.close();
    
    // Verarbeitung
    double radius = Double.parseDouble(eingabe.replace(",","."));
    
    double flaeche = Math.PI * radius * radius;
    
    // Ausgabe
    System.out.println("Der Radius ist: " + radius + " Die Fläche beträgt: " + flaeche);
    
  }     
  
}
