import java.util.*;

class Tanken
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int tankkapazitaet, benzinanzeige, meilenProGallone;
	  int meilen;
	  
	  System.out.println("Tankkapazitaet: ");
	  tankkapazitaet = scan.nextInt();
	  
	  System.out.println("Benzinanzeige: ");
	  benzinanzeige = scan.nextInt();
	  
	  System.out.println("Meilen pro Gallone: ");
	  meilenProGallone = scan.nextInt();
	  
	  meilen = tankkapazitaet * benzinanzeige / 100 * meilenProGallone;
	  
	  if(meilen >= 200)
	  {
		  System.out.println("Weiterfahren...");
	  }
	  else
	  {
		  System.out.println("Tanken!");
	  }
	  
  }
}