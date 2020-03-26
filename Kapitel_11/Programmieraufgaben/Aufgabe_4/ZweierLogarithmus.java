import java.util.*;

class ZweierLogarithmus
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  double zahl;
	  double zweierlogarithmus;
	  
	  System.out.println("Geben Sie ein double ein: ");
	  zahl = scan.nextDouble();
	  
	  zweierlogarithmus = Math.log(zahl) / Math.log(2.0);
	  
	  System.out.println("Der Zweierlogarithmus von " + zahl + " ist "
			  + zweierlogarithmus);
	  
  }
}