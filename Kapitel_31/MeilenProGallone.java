import java.util.Scanner;

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

}

class MeilenProGallone
{
  public static void main(String[] args)
  {
	  
    Auto auto = new Auto(32456, 32810, 10.6);
    System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());
    
  }
}