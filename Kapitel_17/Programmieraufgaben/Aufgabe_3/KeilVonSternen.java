import java.util.Scanner;

class KeilVonSternen
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int stern, sternTemp, zaehler = 1;
	  
	  System.out.println("Anfangszahl der Sterne: ");
	  stern = scan.nextInt();
	  sternTemp = stern;
	  
	  System.out.println();
	  
	  while(zaehler <= stern)
	  {
		  while(zaehler <= sternTemp)
		  {
			  System.out.print("*");
			  sternTemp = sternTemp - 1;
		  }
		
		  System.out.println();
		  stern = stern - 1;
		  sternTemp = stern;
		  
	  }
	  
  }
}