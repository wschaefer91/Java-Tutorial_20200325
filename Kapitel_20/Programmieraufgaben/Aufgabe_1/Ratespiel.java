import java.util.*;

class Ratespiel
{
  public static void main(String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  Random rand = new Random();
	  
	  int versuche = 1, raten, zufall;
	  
	  System.out.println("Ich denke an eine Zahl von 1 bis 10.");
	  System.out.println("Sie haben 3 Versuche diese zahl zu erraten.");
	  System.out.println("Raten Sie!");
	  
	  zufall = rand.nextInt(10)+1;
	  
	  while(versuche <= 3)
	  {
		  System.out.println("Versuch: " + versuche);
		  raten = scan.nextInt();
		  
		  if(raten == zufall)
		  {
			  System.out.println("RICHTIG!");
			  System.out.println("Sie haben das Spiel gewonnen.");
			  versuche = 4;
		  }
		  else
		  {
			  System.out.println("Falsch");
		  }
		  
		  if(versuche == 3)
		  {
			  System.out.println("Die richtige Zahl war " + zufall + ".");
			  System.out.println("Sie haben das Spiel verloren.");
		  }
		  
		  versuche = versuche + 1;
	  }
	  
  }
}