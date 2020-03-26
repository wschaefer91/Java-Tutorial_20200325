import java.util.*;

class Y2K
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int geburtsjahr, aktuellesJahr, alter;
	  
	  System.out.println("Geburtsjahr: ");
	  geburtsjahr = scan.nextInt();
	  
	  System.out.println("Aktuelles Jahr: ");
	  aktuellesJahr = scan.nextInt();
	  
	  geburtsjahr = geburtsjahr % 100;
	  aktuellesJahr = aktuellesJahr % 100;
	  
	  if(geburtsjahr <= aktuellesJahr)
	  {
		  alter = aktuellesJahr - geburtsjahr;
		  System.out.println("Ihr Alter ist: " + alter);
	  }
	  else
	  {
		  alter = aktuellesJahr + 100 - geburtsjahr;
		  System.out.println("Ihr Alter ist. " + alter);
	  }
	  
  }
}