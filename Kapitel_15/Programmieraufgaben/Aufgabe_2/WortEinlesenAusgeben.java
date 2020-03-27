import java.util.*;

class WortEinlesenAusgeben
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String inputString;
	  int laenge, zaehler = 1;
	  
	  System.out.println("Geben Sie ein Wort ein: ");
	  inputString = scan.nextLine();
	  
	  laenge = inputString.length();
	  
	  System.out.println();
	  
	  while(zaehler <= laenge)
	  {
		  System.out.println(inputString);
		  zaehler = zaehler + 1;
	  }
	  
  }
}