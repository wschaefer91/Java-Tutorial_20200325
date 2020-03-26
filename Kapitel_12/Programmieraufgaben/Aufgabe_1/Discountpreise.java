import java.util.*;

class Discountpreise
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  double gesamtbetrag, discountpreis;
	  final double rabatt = 0.10;
	  
	  System.out.println("Geben Sie den Gesamtbetrag ein: ");
	  gesamtbetrag = scan.nextDouble();
	  
	  if(gesamtbetrag > 10.00) 
	  {
		  discountpreis = gesamtbetrag - (gesamtbetrag * rabatt);
	  
		  System.out.println("Discountpreis: " + discountpreis);
	  }
	  else
	  {
		  System.out.println("Kein Rabatt moeglich.");
	  }
  }
}