import java.util.Scanner;

class CentZuDollar
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int eingabe, cent, dollar;
	  
	  System.out.println("Geben Sie die Cent ein: ");
	  eingabe = scan.nextInt();
	  
	  cent = eingabe % 100;
	  dollar = eingabe / 100;
	  
	  System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
	  
  }
}