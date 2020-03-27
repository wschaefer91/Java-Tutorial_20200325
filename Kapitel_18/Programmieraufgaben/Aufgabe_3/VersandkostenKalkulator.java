import java.util.Scanner;

class VersandkostenKalkulator
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int gewicht;
	  double versandkosten;
	  boolean status = true;
	  
	  while(status == true)
	  {
		  
		  System.out.println("Gewicht der Sendung: ");
		  gewicht = scan.nextInt();
		  
		  if(gewicht <= 0)
		  {
			  status = false;
			  System.out.println();
			  System.out.println("bye");
		  }
		  else
		  {
			  if(gewicht <= 10)
			  {
				  versandkosten = 3.0;
			  }
			  else
			  {
				  versandkosten = 3.0 + ((gewicht - 10) * 0.25);
			  }
			  
			  System.out.println("Versandkosten: $" + versandkosten);
			  System.out.println();
			  
		  }
		  
	  }
	  
  }
}