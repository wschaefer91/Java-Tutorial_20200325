import java.util.Random;
import java.util.Scanner;

public class Wuerfeln
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    while(true)
    {
      System.out.print("Ihr Wurf ist eine " + (rand.nextInt(6)+1));
      String zeile = scan.nextLine();
    }
  }
}