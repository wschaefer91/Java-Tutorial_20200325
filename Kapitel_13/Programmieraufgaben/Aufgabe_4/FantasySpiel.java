import java.util.*;

class FantasySpiel
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String name;
	  int staerkePunktzahl, gesundheitPunktzahl, glueckPunktzahl, gesamtPunktzahl;
	  
	  System.out.println("Willkommen zu Yertle's Schatzsuche");
	  
	  System.out.println("Geben Sie den Namen der Spielfigur ein: ");
	  name = scan.nextLine();
	  
	  System.out.println("Staerke eingeben (1-10): ");
	  staerkePunktzahl = scan.nextInt();
	  
	  System.out.println("Gesundheit eingeben (1-10): ");
	  gesundheitPunktzahl = scan.nextInt();
	  
	  System.out.println("Glueck eingeben (1-10): ");
	  glueckPunktzahl = scan.nextInt();
	  
	  System.out.println();
	  
	  gesamtPunktzahl = staerkePunktzahl + gesundheitPunktzahl + glueckPunktzahl;
	  
	  if(gesamtPunktzahl > 15)
	  {
		  staerkePunktzahl = 5;
		  gesundheitPunktzahl = 5;
		  glueckPunktzahl = 5;
		  System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
	  }
	  
	  System.out.println(name + ", Staerke: " + staerkePunktzahl
			  + ", Gesundheit: " + gesundheitPunktzahl
			  + ", Glueck: " + glueckPunktzahl);
	  
  }
}