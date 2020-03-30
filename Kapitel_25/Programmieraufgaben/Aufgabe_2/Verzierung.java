class Verzierung
{
  // Instanzvariablen
  String sorte;
  
  // weitere Instanzvariablen hier
  String groesse;
  String form;
  boolean verzierungJaNein;
  String verzierung;

  // Instanzmethode
  public void ausgeben()
  {
      // gibt Informationen über die Plätzchen aus z.B.
      // Sorte Kokos, Groesse mittel, Form rund

	  if(verzierungJaNein == true)
		  verzierung = "ja";
	  else
		  verzierung = "nein";
	  
	  System.out.println("Sorte " + sorte + ", Groesse " + groesse
			  + ", Form " + form + ", Verzierung " + verzierung);
  }

  // Test der Klasse Plaetzchen
  public static void main(String[] args)
  {
	  
	  /*  	(1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
	    	Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird von Java zur Verfügung gestellt.
	   */
	  Verzierung plaetzchen_1 = new Verzierung();
	  Verzierung plaetzchen_2 = new Verzierung();
	  Verzierung plaetzchen_3 = new Verzierung();
	  Verzierung plaetzchen_4 = new Verzierung();
	  Verzierung plaetzchen_5 = new Verzierung();
	  
	  /* 	(2) Weisen Sie über die Punktnotation referenzvariable.instanzvariable
           	den Instanzvariablen des Objekts Werte zu.
	   */	  
	  plaetzchen_1.sorte = "Kokos";
	  plaetzchen_1.groesse = "mittel";
	  plaetzchen_1.form = "rund";
	  plaetzchen_1.verzierungJaNein = false;
	  
	  plaetzchen_2.sorte = "Affennuss";
	  plaetzchen_2.groesse = "klein";
	  plaetzchen_2.form = "rund";
	  plaetzchen_2.verzierungJaNein = false;
	  
	  plaetzchen_3.sorte = "Honigkuchen";
	  plaetzchen_3.groesse = "gross";
	  plaetzchen_3.form = "rechteckig";
	  plaetzchen_3.verzierungJaNein = false;
	  
	  plaetzchen_4.sorte = "Zitronenkuchen";
	  plaetzchen_4.groesse = "mittel";
	  plaetzchen_4.form = "rechteckig";
	  plaetzchen_4.verzierungJaNein = true;
	  
	  plaetzchen_5.sorte = "Mohn";
	  plaetzchen_5.groesse = "klein";
	  plaetzchen_5.form = "rund";
	  plaetzchen_5.verzierungJaNein = true;
	  
	  /*	(3) Lassen Sie dann das Plaetzchen-Objekt seine Methode ausgeben() aufrufen.
	   */	
	  System.out.println("+++ Plaetzchenliste +++");
	  System.out.println();
	  
	  plaetzchen_1.ausgeben();
	  plaetzchen_2.ausgeben();
	  plaetzchen_2.ausgeben();
	  plaetzchen_4.ausgeben();
	  plaetzchen_5.ausgeben();
	  
	  /*
      		(4) Testen Sie Ihr Programm.
      		(5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und verfahren Sie wie oben.
	   */
	  
  }
}