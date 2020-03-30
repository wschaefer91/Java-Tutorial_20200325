class Plaetzchen
{
  // Instanzvariablen
  String sorte;
  
  // weitere Instanzvariablen hier
  String groesse;
  String form;

  // Instanzmethode
  public void ausgeben()
  {
      // gibt Informationen über die Plätzchen aus z.B.
      // Sorte Kokos, Groesse mittel, Form rund

	  System.out.println("Sorte " + sorte + ", Groesse " + groesse
			  + ", Form " + form);
  }

  // Test der Klasse Plaetzchen
  public static void main(String[] args)
  {
    /*
       (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
           Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird von Java zur Verfügung gestellt.
       (2) Weisen Sie über die Punktnotation referenzvariable.instanzvariable
           den Instanzvariablen des Objekts Werte zu.
       (3) Lassen Sie dann das Plaetzchen-Objekt seine Methode ausgeben() aufrufen.
       (4) Testen Sie Ihr Programm.
       (5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und verfahren Sie wie oben.
   */
	  
	  Plaetzchen plaetzchen_1 = new Plaetzchen();
	  plaetzchen_1.sorte = "Kokos";
	  plaetzchen_1.groesse = "mittel";
	  plaetzchen_1.form = "rund";
	  
	  Plaetzchen plaetzchen_2 = new Plaetzchen();
	  plaetzchen_2.sorte = "Affennuss";
	  plaetzchen_2.groesse = "klein";
	  plaetzchen_2.form = "rund";
	  
	  Plaetzchen plaetzchen_3 = new Plaetzchen();
	  plaetzchen_3.sorte = "Honigkuchen";
	  plaetzchen_3.groesse = "gross";
	  plaetzchen_3.form = "rechteckig";
	  
	  Plaetzchen plaetzchen_4 = new Plaetzchen();
	  plaetzchen_4.sorte = "Zitronenkuchen";
	  plaetzchen_4.groesse = "mittel";
	  plaetzchen_4.form = "rechteckig";
	  
	  Plaetzchen plaetzchen_5 = new Plaetzchen();
	  plaetzchen_5.sorte = "Mohn";
	  plaetzchen_5.groesse = "klein";
	  plaetzchen_5.form = "rund";
	  
	  System.out.println("+++ Plaetzchenliste +++");
	  System.out.println();
	  
	  plaetzchen_1.ausgeben();
	  plaetzchen_2.ausgeben();
	  plaetzchen_2.ausgeben();
	  plaetzchen_4.ausgeben();
	  plaetzchen_5.ausgeben();
	  
  }
}