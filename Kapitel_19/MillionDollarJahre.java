class MillionDollarJahre
{
  public static void main(String[] args)
  {
    double dollars = 1000.0;
    int jahre = 0;

    while (dollars < 1000000.0)
    {
      // Zinsen f�r ein weiteres Jahr addieren
      dollars = dollars + dollars*0.05;

      // f�gen Sie die j�hrliche Einzahlung hinzu
      dollars = dollars + 1000;

      jahre = jahre + 1;
    }

    System.out.println("Es braucht " + jahre + " Jahre, um das Ziel zu erreichen.");
  }

}