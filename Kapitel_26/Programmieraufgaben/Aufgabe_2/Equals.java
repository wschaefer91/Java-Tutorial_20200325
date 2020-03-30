import java.util.*;

class Equals
{
  public static void main(String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String antwort, eingabe;
	  antwort = "ja";
	  
	  boolean antwortJaNein = true;
	  
	  int zahl, summe = 0, zaehler = 1;
	  
	  System.out.println("Eingabeaufforderung <ja> oder <nein>?");
	  eingabe = scan.nextLine();
	  
	  if(eingabe.equals(antwort))
	  {
		  antwortJaNein = true;
	  }
	  
	  if(!eingabe.equals(antwort))
	  {
		  antwortJaNein = false;
	  }
	  
	  while(zaehler <= 5)
	  {
		  
		  if(antwortJaNein == true)
		  {
			  System.out.println("Geben Sie die " + zaehler + ". Zahl ein: ");
			  zahl = scan.nextInt();
			  
			  summe = summe + zahl;
		  }
		  else
		  {
			  zahl = scan.nextInt();
			  
			  summe = summe + zahl;
		  }
		  
		  zaehler = zaehler + 1;
	  }
	  
	  System.out.println("Gesamtsumme: " + summe);

  }
}