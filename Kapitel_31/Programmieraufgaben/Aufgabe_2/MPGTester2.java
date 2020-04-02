import java.util.*;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(double startTacho)
  {
    startMeilen = startTacho;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen;
  }
  
  void auftanken(double aktTacho, double gallonen)
  {
	  endMeilen = aktTacho;
	  this.gallonen = gallonen;
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

class MPGTester2
{
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  
	  String exit = "n";
	  double aktTacho, gallonen;
	  
	  Auto auto = new Auto(0.0);
	  
	  while(exit.equals("n") || exit.equals("N"))
	  {
		  System.out.println();
		  System.out.println("+++ Besuch der Tankstelle +++");
		  System.out.println("alter Tachometerstand: " + auto.startMeilen);
		  
		  System.out.println("Aktuellen Tachometerstand eingeben: ");
		  aktTacho = scan.nextDouble();
		  
		  System.out.println("Anzahl Gallonen fuer die Tankfuellung: ");
		  gallonen = scan.nextDouble();
		  
		  auto.auftanken(aktTacho, gallonen);
		  
		  if(auto.sparauto())
		  {
			  System.out.println("Meilen pro Gallone: " + auto.berechneMPG() +
					  " Autotyp: Sparauto!");
		  }
		  
		  if(auto.benzinschwein())
		  {
			  System.out.println("Meilen pro Gallone: " + auto.berechneMPG() +
					  " Autotyp: Benzinschwein!");
		  }
		  
		  auto.startMeilen = auto.endMeilen;
		  
		  System.out.println("Programm beenden <j>a <n>ein? ");
		  exit = scan.next();
		  
	  }
    
  }
}