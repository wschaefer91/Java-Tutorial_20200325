import java.util.Scanner;

class PolyBerechnen
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    double x;                     // ein Wert f�r das Polynom
    double ergebnis;              // Ergebnis der Berechnung des Polynoms f�r x
    String antwort = "j";         // "j" oder "n"

    while (antwort.equals( "j" ))
    {
       // Einen Wert f�r x holen.
       System.out.println("Geben Sie einen Wert fuer x ein: ");
       x = scan.nextDouble();

       // Polynom berechnen
       ergebnis = 7*x*x*x - 3*x*x + 4*x - 12;

       // Ergebnis ausgeben
       System.out.println("Der Wert des Polynoms von x = " +
           x + " ist: " + ergebnis + "\n");

       // Anwender fragen, ob das Programm fortfahren soll
       System.out.println("Fortfahren (j oder n)? ");

       antwort = scan.next();
    }

  }
}