import java.util.*;

class Torten
{
  public static void main (String[] args)
  {
	
	  Scanner scan = new Scanner(System.in);
	  
	  int gewicht;
	  
	  System.out.println("Bitte geben Sie Ihr Gewicht an: ");
	  gewicht = scan.nextInt();
	  
	  if(gewicht >= 235 && gewicht <= 265)
	  {
		  System.out.println("Sie sind zum Wettbewerb zugelassen!");
	  }
	  else
	  {
		  System.out.println("Sie sind zum Wettbewerb nicht zugelassen!");
	  }
	  
  }
}