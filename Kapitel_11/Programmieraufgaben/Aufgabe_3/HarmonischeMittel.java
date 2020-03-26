import java.util.*;

class HarmonischeMittel
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double x, y;
	  double arithmetischesMittel, harmonischesMittel;
	  
	  System.out.println("Geben Sie x ein: ");
	  x = scan.nextDouble();
	  
	  System.out.println("Geben Sie y ein: ");
	  y = scan.nextDouble();
	  
	  arithmetischesMittel = (x + y) / 2;
	  
	  harmonischesMittel = 2.0 / (1.0/x + 1.0/y);
	  
	  System.out.println("Arithmetisches Mittel \t: " + arithmetischesMittel);
	  System.out.println("Harmonisches Mittel \t: " + harmonischesMittel);	  
  }
}