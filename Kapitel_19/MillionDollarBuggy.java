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

       // Dollars nach 40 Jahren beim gegenw�rtigen Zinssatz berechnen
       jahre = 1;
       dollars = anfangsbetrag;
       while (jahre <= 40)
       {
         dollars = dollars + dollars*zinssatz;   // Zinsen f�r ein weiteres
                                                 // Jahr addieren
         dollars = dollars + 1000;               // f�gen Sie die j�hrliche
                                                 // Einzahlung hinzu
         jahre = jahre + 1;
       }

       // zum n�chsten Zinssatz wechseln
       zinssatz = zinssatz + 0.001;

    }

    System.out.println("Nach 40 Jahren bei " + zinssatz*100
      + "Prozent Zinsen werden Sie" + dollars + " Dollar haben.");
  }

}