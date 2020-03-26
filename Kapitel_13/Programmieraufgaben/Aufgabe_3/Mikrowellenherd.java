import java.util.*;

class Mikrowellenherd
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int anzahlPosten;
	  double erhitzungszeit, empfohleneErhitzungszeit;
	  
	  System.out.println("Anzahl Posten: ");
	  anzahlPosten = scan.nextInt();
	  
	  System.out.println("Erhitzungszeit (in Minuten): ");
	  erhitzungszeit = scan.nextInt();
	  
	  if(anzahlPosten == 1)
	  {
		  System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit);
	  }
	  if(anzahlPosten == 2)
	  {
		  empfohleneErhitzungszeit = erhitzungszeit * 1.5;
		  System.out.println("Empfohlene Erhitzungszeit: " + empfohleneErhitzungszeit);
	  }
	  if(anzahlPosten == 3)
	  {
		  empfohleneErhitzungszeit = erhitzungszeit * 2;
		  System.out.println("Empfohlene Erhitzungszeit: " + empfohleneErhitzungszeit);
	  }
	  if(anzahlPosten > 3)
	  {
		  System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfohlen!");
	  }
	  
  }
}