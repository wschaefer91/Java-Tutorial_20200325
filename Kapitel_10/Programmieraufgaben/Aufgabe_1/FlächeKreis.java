import java.util.Scanner;

class FlächeKreis
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int radius;
	  double flaecheKreis;
	  
	  System.out.println("Geben Sie den Radius ein: ");
	  radius = scan.nextInt();
	  
	  flaecheKreis = radius * radius * Math.PI;
	  
	  System.out.println("Der Radius ist: " + radius);
	  System.out.println("Die Flaeche betraegt: " + flaecheKreis);
  }
}