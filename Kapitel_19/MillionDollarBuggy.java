class  MillionDollarBuggy
{

  public static void main(String[] args)
  {
    double anfangsbetrag = 1000.0;
    double dollars = 0.0;
    double zinssatz;
    int jahre;

    zinssatz = 0.0;   // Zinssatz mit 0 beginnen

    while (dollars < 1000000)
    {

       // Dollars nach 40 Jahren beim gegenwärtigen Zinssatz berechnen
       jahre = 1;
       dollars = anfangsbetrag;
       while (jahre <= 40)
       {
         dollars = dollars + dollars*zinssatz;   // Zinsen für ein weiteres
                                                 // Jahr addieren
         dollars = dollars + 1000;               // fügen Sie die jährliche
                                                 // Einzahlung hinzu
         jahre = jahre + 1;
       }

       // zum nächsten Zinssatz wechseln
       zinssatz = zinssatz + 0.001;

    }

    System.out.println("Nach 40 Jahren bei " + zinssatz*100
      + "Prozent Zinsen werden Sie" + dollars + " Dollar haben.");
  }

}