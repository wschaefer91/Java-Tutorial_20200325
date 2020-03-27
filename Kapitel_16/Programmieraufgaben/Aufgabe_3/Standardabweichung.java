import java.util.*;

class Standardabweichung
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int n, zaehler = 1;
	  double zahl, summe = 0.0, durchschnitt = 0.0; 
	  double durchschnitt2 = 0.0, durchschnittQ = 0.0, standardabweichung = 0.0;
	  
	  System.out.println("Wie viele Zahlen werden folgen?: ");
	  n = scan.nextInt();
	  
	  System.out.println();
	  
	  while(zaehler <= n)
	  {
		  System.out.println(zaehler + ". Zahl eingeben: ");
		  zahl = scan.nextDouble();
		  summe = summe + zahl;
		  durchschnittQ = durchschnittQ + (zahl * zahl);
		  zaehler = zaehler + 1;
	  }
	  
	  durchschnitt = summe / n;
	  durchschnitt2 = durchschnitt * durchschnitt;
	  durchschnittQ = durchschnittQ / n;
	  
	  standardabweichung = Math.sqrt(durchschnittQ - durchschnitt2);
	  
	  System.out.println();
	  
	  System.out.println("Standardabweichung: " + standardabweichung);
	  
  }
}