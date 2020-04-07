class EinfacheKlasseZwei
{
  public int verdoppeln(int x)
  {
    return 2*x;
  }
}

class EinfachTesterZwei
{
  public static void main(String[] args)
  {
    int zahl = 7;
    int ergebnis = 0;

    EinfacheKlasseZwei einfach = new EinfacheKlasseZwei();

    System.out.println("Erster Wert von ergebnis: " + ergebnis);
    ergebnis = einfach.verdoppeln( zahl );
    System.out.println("Zweiter Wert von ergebnis: " + ergebnis);
  }
}