import java.util.Scanner;

class Sternchen
{
  public static void main (String[] args)
  {
    int anzahlZeilen;    // die Anzahl der Zeilen
    int anzahlSterne;    // die Anzahl der Sterne pro Zeile
    int zeile;           // aktuelle Zeilennummer
    int stern;           // die Anzahl der Sterne in dieser Zeile soweit

    Scanner scan = new Scanner(System.in);

    // Input vom Anwender sammeln
    System.out.println("Wie viele Zeilen? ");
    anzahlZeilen = scan.nextInt();

    System.out.println("Wie viele Sterne pro Zeile? ");
    anzahlSterne = scan.nextInt();

    zeile = 1;
    while (zeile <= anzahlZeilen)
    {
      stern = 1;
      while (stern <= anzahlSterne)
      {
        System.out.print("*");
        stern = stern + 1;
      }

      System.out.println();         // notwendig, um jede Zeile zu beenden
      zeile = zeile + 1;
    }
  }
}