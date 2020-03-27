import java.util.Scanner;

// Anwender w�hlt den Endwert f�r die Zeit, t
// Das Programm berechnet und gibt die Entfernung aus,
// die der Ziegelstein in der Zeit t zur�ckgelegt hat
//
class FallenderZiegelstein
{
  public static void main (String[] args)
  {
    final double G = 9.80665;  // Konstante f�r Gravitationsbeschleunigung
    int t, zeit;               // Zeit in Sekunden und Endwert der Zeit
    double entfernung;         // die Entfernung, die der Ziegelstein
                               // zur�ckgelegt hat
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Zeit in Sekunden: ");
    zeit = scan.nextInt();

    // �bschrift ausgeben
    System.out.println("Sekunden\tEntfernung");
    System.out.println("-------\t\t--------");

    t = 0;
    while(t <= zeit)
    {
      entfernung = (G * t * t) / 2;
      System.out.println(t + "\t\t" + entfernung);

      t = t + 1;
    }
  }
}