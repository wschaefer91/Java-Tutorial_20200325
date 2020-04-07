class EinfacheKlasse
{
  public void ausgeben(int x)
  {
	  System.out.println("Erster Wert des Parameters: " + x);
	  x = 100;       // lokale Änderung des formalen Parameters
	  System.out.println("Zweiter Wert des Parameters: " + x);
  }
}

class EinfachTester
{
  public static void main(String[] args)
  {
	  
    int zahl = 7;
    EinfacheKlasse einfach = new EinfacheKlasse();

    System.out.println("Erster Wert der lokalen Variablen zahl : " + zahl);
    einfach.ausgeben(zahl);
    System.out.println("Zweiter Wert der lokalen Variablen zahl : " + zahl);
    
  }
}