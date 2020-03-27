import java.util.*;

class StartEnde
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int startwert, endwert;
	  
	  System.out.println("Startwert: ");
	  startwert = scan.nextInt();
	  
	  System.out.println("Endwert: ");
	  endwert = scan.nextInt();
	  
	  System.out.println();
	  
	  while(startwert <= endwert)
	  {
		  System.out.println(startwert);
		  startwert = startwert + 1;
	  }
	  
  }
}