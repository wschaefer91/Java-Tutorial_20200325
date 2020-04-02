import java.util.*;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(double startTacho, double endTacho, double galls)
  {
    startMeilen = startTacho;
    endMeilen = endTacho;
    gallonen = galls;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen;
  }
  
  boolean benzinschwein()
  {
	  if(berechneMPG() < 15.0)
		  return true;
	  else
		  return false;
  }
  
  boolean sparauto()
  {
	  if(berechneMPG() > 30.0)
		  return true;
	  else
		  return false;
  }

}

class MPGTester1
{
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  double anfangsmeilenstand, endmeilenstand, gallonen;
	  
	  System.out.println("Geben Sie den Anfangsmeilenstand ein: ");
	  anfangsmeilenstand = scan.nextDouble();
	  
	  System.out.println("Geben Sie den Endmeilenstand ein: ");
	  endmeilenstand = scan.nextDouble();
	  
	  System.out.println("Geben Sie die Gallonen ein: ");
	  gallonen = scan.nextDouble();	  
	  
	  System.out.println();
	  
	  Auto auto = new Auto(anfangsmeilenstand, endmeilenstand, gallonen);
	  System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());
	  
	  if(auto.benzinschwein())
		  System.out.println("Benzinschwein!");
	  
	  if(auto.sparauto())
		  System.out.println("Sparauto!");
    
  }
}