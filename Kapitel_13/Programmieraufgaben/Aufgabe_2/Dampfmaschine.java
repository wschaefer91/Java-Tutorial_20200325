import java.util.*;

class Dampfmaschine
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  double tLuft, tDampf;
	  double effizienz = 0.0;
	  
	  System.out.println("Geben Sie die Lufttemperatur ein: ");
	  tLuft = scan.nextDouble();
	  
	  System.out.println("Geben Sie die Dampftemperatur ein: ");
	  tDampf = scan.nextDouble();
	  
	  if(tDampf < 373)
	  {
		  effizienz = 0;
	  }
	  if(tDampf >= 373)
	  {
		  effizienz = 1 - tLuft /tDampf;
	  }
	  
	  System.out.println("Die Effizienz betraegt: " + effizienz);
	  
  }
}