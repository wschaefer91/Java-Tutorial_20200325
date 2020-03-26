import java.util.*;
class CosinusBerechnung
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double grad;

    // Grad einlesen
    System.out.print("Geben Sie Grad ein: ");
    grad = scan.nextDouble();

    // Cosinus berechnen
    double ergebnis = Math.cos(Math.toRadians(grad));
    
    // Ergebnis ausgeben
    System.out.println("Cosinus: " + ergebnis);
  }
}