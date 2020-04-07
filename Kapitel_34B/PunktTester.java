class MeinPunkt
{
  public int x=3, y=5;

  public void ausgeben()
  {
    System.out.println("x = " + x +
        "; y = " + y);
  }
}

class PunktDoppler
{
  public void zweimal(MeinPunkt punkt)
  {
    System.out.println("Beginn PunktDoppler");
    punkt.ausgeben();
    punkt.x = punkt.x * 2;
    punkt.y = punkt.y * 2;
    punkt.ausgeben();
    System.out.println("Ende PunktDoppler");
  }
}

class PunktTester
{
  public static void main(String[] args)
  {
    MeinPunkt pt = new MeinPunkt();

    PunktDoppler pd = new PunktDoppler();

    pt.ausgeben();

    pd.zweimal(pt);

    pt.ausgeben();
  }
}