import java.util.Scanner;

class Autokauf
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int bargeld, kredit;

    // Bargeld holen
    System.out.print("Wie viel Bargeld haben Sie? ");
    bargeld = scan.nextInt();

    // Kreditrahmen holen
    System.out.print("Wie viel Kredit haben Sie? ");
    kredit = scan.nextInt();

    // �berpr�fen, dass mindestens eine Bedingung erf�llt ist
    if (bargeld >= 25000  ||  kredit >=  25000)
      System.out.println("Genug, um dieses Auto zu kaufen!");
    else
      System.out.println("Wie waere es mit einem Mofa?");

  }
}