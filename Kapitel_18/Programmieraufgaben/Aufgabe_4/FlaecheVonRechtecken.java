import java.util.Scanner;

class FlaecheVonRechtecken
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int ersteX, ersteY, zweiteX, zweiteY;
	  int breite = 0, hoehe = 0, flaeche = 0;
	  boolean status = true;
	  
	  System.out.println("CAD Programm");
	  
	  while(status == true)
	  {
		  System.out.println("Erster Eckpunkt X-Koordinate: ");
		  ersteX = scan.nextInt();
		  
		  System.out.println("Erster Eckpunkt Y-Koordinate: ");
		  ersteY = scan.nextInt();
		  
		  System.out.println("Zweiter Eckpunkt X-Koordinate: ");
		  zweiteX = scan.nextInt();
		  
		  System.out.println("Zweiter Eckpunkt Y-Koordinate: ");
		  zweiteY = scan.nextInt();
		  
		  breite = zweiteX - ersteX;
		  hoehe = zweiteY - ersteY;
		  flaeche = breite * hoehe;
		  
		  if(breite == 0 || hoehe == 0 || (breite == 0 && hoehe == 0))
		  {
			  status = false;
			  
			  System.out.println("Breite: " + breite + "\tHoehe: " + hoehe
					  + "\tFlaeche: " + flaeche);
			  System.out.println();
			  System.out.println("Fertig!");
		  }
		  else
		  {
			  if(breite < 0)
			  {
				  breite = breite * (-1);
			  }
			  if(hoehe < 0)
			  {
				  hoehe = hoehe * (-1);
			  }
			  
			  flaeche = breite * hoehe;
			  
			  System.out.println("Breite: " + breite + "\tHoehe: " + hoehe
					  + "\tFlaeche: " + flaeche);
			  System.out.println();
		  }

	  }
	  
  }
}