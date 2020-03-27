import java.util.Scanner;

class PotenzEinerZahl
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  double x, summe = 0.0;
	  int n, zaehler = 1;
	  
	  System.out.println("Geben Sie x ein: ");
	  x = scan.nextDouble();
	  summe = x;
	  
	  System.out.println("Geben Sie n ein: ");
	  n = scan.nextInt();
	  
	  System.out.println();
	  
	  if(n > 0)
	  {
		  while(zaehler < n)
		  {
			  summe = summe * x;
			  zaehler = zaehler + 1;
		  }
		  
		  System.out.println(x + " hoch " + n + " ergibt: " + summe);
	  }
	  else
	  {
		  System.out.println("n muss ein positiver Integer sein.");
	  }
	  
  }
}