class MillionDollarJahre
{
  public static void main(String[] args)
  {
    double dollars = 1000.0;
    int jahre = 0;

    while (dollars < 1000000.0)
    {
      // Zinsen für ein weiteres Jahr addieren
      dollars = dollars + dollars*0.05;

      // fügen Sie die jährliche Einzahlung hinzu
      dollars = dollars + 1000;

      jahre = jahre + 1;
    }

    System.out.println("Es braucht " + jahre + " Jahre, um das Ziel zu erreichen.");
  }

}