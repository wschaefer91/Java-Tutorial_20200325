import java.util.Scanner;

class Weihnachtsbaum
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int hoehe, hoeheTemp, zaehlerZeile = 0, zaehlerStern = 0, anzahlStern = 1;
	  int hoeheStamm = 0, anzahlStamm = 0;
	  
	  System.out.println("Geben Sie eine Hoehe ein: ");
	  hoehe = scan.nextInt();
	  hoeheTemp = hoehe;
	  
	  System.out.println();
	  
	  if(hoeheTemp >= 5)
	  {
		  while(hoeheTemp > 0)
		  {
			  while(zaehlerZeile < hoeheTemp - 1)
			  {
				  System.out.print(" ");
				  zaehlerZeile = zaehlerZeile + 1;
			  }
			  
			  while(zaehlerStern < anzahlStern)
			  {
				  System.out.print("*");
				  zaehlerStern = zaehlerStern + 1;
			  }
			  
			  System.out.println();
			  zaehlerZeile = 0;
			  zaehlerStern = 0;
			  anzahlStern = anzahlStern + 2;
			  hoeheTemp = hoeheTemp - 1;
			  
		  }
		  
		  while(hoeheStamm < 3)
		  {
			  while(zaehlerZeile < (hoehe - 2))
			  {
				  System.out.print(" ");
				  zaehlerZeile = zaehlerZeile + 1;
			  }
			  
			  while(anzahlStamm < 3)
			  {
				  System.out.print("*");
				  anzahlStamm = anzahlStamm + 1;
			  }
			  
			  System.out.println();
			  zaehlerZeile = 0;
			  anzahlStamm = 0;
			  hoeheStamm = hoeheStamm + 1;
			  
		  }
	  }
	  else
	  {
		  System.out.println("Hoehe muss mindestens 5 sein!");
	  }
	  
  }
}