import java.util.*;

class Turm
{
  public static void main (String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double z, e;
	  double G = 9.81;
	  
	  System.out.println("Geben Sie die Anzahl der Sekunden ein: ");
	  z = scan.nextDouble();
	  
	  e = (1.0/2.0) * G * z * z;
	  
	  System.out.println("Die Entfernung e betraegt: " + e + " Meter");
	  
  }
}