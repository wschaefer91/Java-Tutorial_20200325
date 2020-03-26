import java.util.*;

class Stromkosten
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double preisKWH, jahreskosten;
	  int anzahlKWH;
	  
	  System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
	  preisKWH = scan.nextDouble();	  
	  
	  System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
	  anzahlKWH = scan.nextInt();
	  
	  jahreskosten = preisKWH * anzahlKWH / 100;
	  
	  System.out.println("Jahreskosten: " + jahreskosten);
	  
  }
}