import java.util.Scanner;

class Steuerklasse
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int einkommen;

    // Einkommen holen
    System.out.println("Wie hoch ist Ihr Einkommen?");
    einkommen = scan.nextInt();

    // �berpr�fen, ob das Einkommen im Bereich der 28% Steuerklasse ist
    if (einkommen >= 24000 && einkommen <= 58150)
      System.out.println("Innerhalb der 28% Steuerklasse.");
    else
      System.out.println("Zeit fuer eine Buchpruefung!");
  }
}