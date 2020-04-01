import java.util.*;

class CharAt
{
  public static void main(String args[])
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String eingabe;
	  int laenge, zaehler = 0;
	  
	  System.out.println("Geben Sie einen String ein: ");
	  eingabe = scan.nextLine();
	  
	  System.out.println();
	  
	  laenge = eingabe.length();
	  
	  while(zaehler < laenge)
	  {
		  System.out.println(eingabe.charAt(zaehler));
		  zaehler = zaehler + 1;
	  }
	  
  }
}