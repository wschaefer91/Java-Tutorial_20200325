import java.util.Scanner;

class Ratenzahlung
{
  public static void main(String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  double n, saldo, gesamtbetrag = 0, zins;
	  int monat = 0;
	  
	  System.out.println("Geben Sie den Anfangssaldo ein: ");
	  saldo = scan.nextDouble();
	  
	  System.out.println("Geben Sie den monatlichen Zinssatz (in Prozent) ein: ");
	  zins = scan.nextDouble();
	  zins = zins / 100.0;
	  
	  System.out.print("Geben Sie den monatlichen Betrag ein: ");
	  n = scan.nextDouble();
	  
	  while(saldo > 0)
	  {
		  if(saldo > n)
		  {
			  saldo = saldo - n + (saldo * zins);
			  gesamtbetrag = gesamtbetrag + n;
			  monat = monat + 1;
		  }
		  if(saldo <= n)
		  {
			  saldo = 0.00;
			  gesamtbetrag = gesamtbetrag + n;
			  monat = monat + 1;
			  System.out.println("Monat: " + monat + "\tSaldo: " + saldo 
					  + "\tGesamtbetrag: " + gesamtbetrag);
		  }
	  }
	  
  }
}