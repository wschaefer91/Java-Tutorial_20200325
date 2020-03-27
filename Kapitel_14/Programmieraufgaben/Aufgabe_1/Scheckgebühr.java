import java.util.Scanner;

class Scheckgebühr
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double girokonto, sparkonto, gebuehr = 0.15;
	  
	  System.out.println("Bitte geben Sie das Guthaben Ihres Girokontos an: ");
	  girokonto = scan.nextDouble();
	  
	  System.out.println("Bitte geben Sie das Guthaben Ihres Sparkontos an: ");
	  sparkonto = scan.nextDouble();
	  
	  if(girokonto > 1000 || sparkonto > 1500)
	  {
		  System.out.println("Es wird keine Scheckgebuehr erhoben!");
	  }
	  else
	  {
		  System.out.println("Es wird eine Scheckgebuehr in Hoehe von "
				  + gebuehr + "$ erhoben!");
	  }
	  
  }
}