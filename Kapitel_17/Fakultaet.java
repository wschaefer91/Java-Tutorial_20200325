import java.util.Scanner;

// Der Anwender gibt Integer N ein.
// Das Programm berechnet N Fakultät.

class Fakultaet
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    long n, fakultaet = 1;

    System.out.println("Geben Sie N ein: ");
    n = scan.nextLong();

    if(n >= 0 && n <= 20)
    {
      while(n > 1)
      {
        fakultaet = fakultaet * n;
        n = n - 1;
      }
      System.out.println("Fakultaet ist " + fakultaet);
    }
    else
    {
      System.out.println("N muss zwischen 0 und 20 sein");
      System.out.println("Fakultaet fur N kleiner 0 ist nicht definiert.");
      System.out.println("Fakultaet fur N groesser 20 verursacht Overflow.");
    }
  }
}