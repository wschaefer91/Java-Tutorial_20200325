import java.util.*;

class Summe
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int n, zaehler = 1;
	  double summe = 0.0;
	  
	  System.out.println("Geben Sie n ein: ");
	  n = scan.nextInt();
	  
	  System.out.println();
	  
	  while(zaehler <= n)
	  {
		  summe = summe + 1.0/zaehler;
		  zaehler = zaehler + 1;
	  }
	  
	  System.out.println("Die Summe ist: " + summe);
	  
  }
}