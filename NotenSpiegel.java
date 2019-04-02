import java.util.Scanner;

public class NotenSpiegel
{
  
  public static void main (String[] args) {
    
    int[] AnzahlJeNotenstufe = {0, 0, 0, 0, 0, 0};
    int Anzahl = 0;
    double Schnitt = 0;
    
    // Erzeugung eines neuen Objektes
    Scanner sc = new Scanner(System.in);
    
    for (int i = 1; i < 7; i++) {
      
      System.out.println("Wie viele haben eine " + i + "? (Eingabe mit Enter bestätigen.)");
      
      // Einlesen der Eingabe in den String "eingabe"
      String eingabe = sc.nextLine();
      
      // Typprüfung und Umwandlung
      int AnzahlJeNote = Integer.parseInt(eingabe);
      Anzahl = Anzahl + AnzahlJeNote;
  
      AnzahlJeNotenstufe[i-1] = AnzahlJeNote;      
    }
    
    // Schließen des Scanners (nicht nötig, aber empfohlen)
    sc.close();
    
    // Schnitt berechnen
    int Punkte = 0;
    
    for (int i = 0; i < 6; i++) {
      
      Punkte = Punkte + ((i + 1) * AnzahlJeNotenstufe[i]);
      // System.out.println(Punkte);
    
    }
    Schnitt = Punkte * 10.0 / Anzahl / 10;
    
    // Ausgabe der Eingabe
    System.out.println("Ihre Eingabe war:");
    for (int i = 0; i < 6; i++) {
       System.out.println("Note " + (i + 1) + ": " + AnzahlJeNotenstufe[i]);
      }
    System.out.println("Mitgeschrieben haben " + Anzahl + " Schülerinnen und Schüler.");
    System.out.println("Der Schnitt der Arbeit ist: " + Schnitt);
        
  }
  
}
