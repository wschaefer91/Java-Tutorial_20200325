import java.util.Scanner;

class AdditionQuadratKubik
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int n, quadratsumme = 0, kubiksumme = 0;
	  int zaehler = 1;
	  
	  System.out.println("Geben Sie n ein: ");
	  n = scan.nextInt();
	  
	  while(zaehler <= n)
	  {
		  quadratsumme = quadratsumme + (zaehler * zaehler);
		  kubiksumme = kubiksumme + (zaehler * zaehler * zaehler);
		  zaehler = zaehler + 1;
	  }
	  
	  System.out.println("Die Quadratsumme ist: " + quadratsumme);
	  System.out.println("Die Kubiksumme ist: " + kubiksumme);
	  
  }
}