import java.util.*;

class NonFettKalkulator
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double preisPackungA, preisPackungB;
	  
	  double preisMageresFleischA, preisMageresFleischB;
	  
	  int prozentMageresFleischA, prozentMageresFleischB;
	  
	  System.out.println("Preis pro Pfund Packung A: ");
	  preisPackungA = scan.nextDouble();
	  
	  System.out.println("Prozent mageres Fleisch Packung A: ");
	  prozentMageresFleischA = scan.nextInt();
	  
	  System.out.println("Preis pro Pfund Packung B: ");
	  preisPackungB = scan.nextDouble();
	  
	  System.out.println("Prozent mageres Fleisch Packung B: ");
	  prozentMageresFleischB = scan.nextInt();
	  
	  preisMageresFleischA = preisPackungA / prozentMageresFleischA * 100;
	  preisMageresFleischB = preisPackungB / prozentMageresFleischB * 100;
	  
	  System.out.println("Packung A kostet pro Pfund mageres Fleisch: " 
			  + preisMageresFleischA);
	  System.out.println("Packung B kostet pro Pfund mageres Fleisch: "
			  + preisMageresFleischB);
	  
	  System.out.println();
	  
	  if(preisMageresFleischA <= preisMageresFleischB)
	  {
		  System.out.println("Packung A ist preiswerter");
	  }
	  else
	  {
		  System.out.println("Packung B ist preiswerter");
	  }
	  
  }
}