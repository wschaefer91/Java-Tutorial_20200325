import java.util.*;

class InternetDelikatessen
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  String artikel;
	  double preis, expressversand, versandkosten = 0, gesamtkosten;
	  
	  System.out.println("Geben Sie den Artikel ein: ");
	  artikel = scan.nextLine();
	  
	  System.out.println("Geben Sie den Preis ein: ");
	  preis = scan.nextInt();
	  
	  System.out.println("Expressversand (0==nein, 1==ja): ");
	  expressversand = scan.nextInt();
	  
	  System.out.println("Rechnung");
	  
	  if(preis < 10.0)
	  {
		  versandkosten = 2.00;
	  }
	  if(preis > 10.0)
	  {
		  versandkosten = 3.00;
	  }
	  if(expressversand == 1)
	  {
		  versandkosten = versandkosten + 5.0;
	  }
	  
	  gesamtkosten = preis + versandkosten;
	  
	  System.out.println("  " + artikel + ": \t" + preis);
	  System.out.println("  Versand: \t" + versandkosten);
	  System.out.println("  Gesamt: \t" + gesamtkosten);
	  
  }
}