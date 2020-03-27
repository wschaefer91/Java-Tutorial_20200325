import java.util.*;

class IntegerAddieren
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int eingabe, integer, zaehler = 0, ergebnis = 0;
	  
	  System.out.println("Wie viele Integer sollen addiert werden: ");
	  eingabe = scan.nextInt();
	  
	  while(zaehler < eingabe)
	  {
		  System.out.println("Geben Sie einen Integer ein: ");
		  integer = scan.nextInt();
		  ergebnis = ergebnis + integer;
		  zaehler = zaehler + 1;
	  }
	  
	  System.out.println();
	  
	  System.out.println("Die Summe ist " + ergebnis);
	  
  }
}