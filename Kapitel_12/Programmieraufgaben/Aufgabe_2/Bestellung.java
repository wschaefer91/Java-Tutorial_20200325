import java.util.*;

class Bestellung
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int anzahlSchrauben, anzahlMuttern, anzahlUnterlegscheiben, gesamtbetrag;
	  
	  final int schraubenpreis = 5, mutternpreis = 3, scheibenpreis = 1;
	  
	  System.out.println("Anzahl der Schrauben: ");
	  anzahlSchrauben = scan.nextInt();
	  
	  System.out.println("Anzahl der Muttern: ");
	  anzahlMuttern = scan.nextInt();
	  
	  System.out.println("Anzahl der Unterlegscheiben: ");
	  anzahlUnterlegscheiben = scan.nextInt();
	  
	  System.out.println();
	  
	  if(anzahlSchrauben > anzahlMuttern)
	  {
		  System.out.println("Kontrollieren Sie Ihre Bestellung!");
	  }
	  else
	  {
		  gesamtbetrag = (anzahlSchrauben * schraubenpreis) 
				  + (anzahlMuttern * mutternpreis) 
				  + (anzahlUnterlegscheiben * scheibenpreis);
		  System.out.println("Gesamtbetrag: " + gesamtbetrag);
	  }
	  
  }
}