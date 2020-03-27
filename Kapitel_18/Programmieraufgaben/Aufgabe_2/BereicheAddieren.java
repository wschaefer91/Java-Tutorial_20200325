import java.util.Scanner;

class BereicheAddieren
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int untergrenze, obergrenze, zahl, summeInnerhalb = 0, summeAusserhalb = 0;
	  boolean status = true;
	  
	  System.out.println("Bereiche addieren");
	  
	  System.out.println("Untergrenze des Bereichs: ");
	  untergrenze = scan.nextInt();
	  
	  System.out.println("Obergrenze des Bereichs: ");
	  obergrenze = scan.nextInt();
	  
	  
	  
	  while(status == true)
	  {
		  System.out.println("Daten eingeben: ");
		  zahl = scan.nextInt();
		  
		  if(zahl == 0)
		  {
			  status = false;
		  }
		  else
		  {
			  if(zahl >= untergrenze && zahl <= obergrenze)
			  {
				  summeInnerhalb = summeInnerhalb + zahl;
			  }
			  else
			  {
				  summeAusserhalb = summeAusserhalb + zahl;
			  }
		  }
	  }
	  
	  System.out.println("Summe der Werte innerhalb des Bereichs: " + summeInnerhalb);
	  System.out.println("Summe der Werte ausserhalb des Bereichs: " + summeAusserhalb);
	  
  }
}