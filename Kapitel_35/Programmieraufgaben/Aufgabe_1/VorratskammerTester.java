import java.util.*;

class Vorratskammer
{
	
	private Marmelade glas1;
	private Marmelade glas2;
	private Marmelade glas3;
	private Marmelade glasAusgewaehlt;
	
	public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3)
	{
		System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = glas3;
		glasAusgewaehlt = null;
	}
	
	public void ausgeben()
	{
		System.out.println();
		System.out.println("Die Vorratskammer enthaelt: ");
		System.out.print("1: "); glas1.ausgeben();
		System.out.print("2: "); glas2.ausgeben();
		System.out.print("3: "); glas3.ausgeben();
	}
	
	public void auswaehlen(int glasNummer)
	{
		if(glasNummer == 1)
			glasAusgewaehlt = glas1;
		else if(glasNummer == 2)
			glasAusgewaehlt = glas2;
		else
			glasAusgewaehlt = glas3;
	}
	
	public void auftragen(int unzen)
	{
		glasAusgewaehlt.auftragen(unzen);
	}
	
}

class Marmelade
{
	
	private String inhalt;
	private String datum;
	private int menge;
	
	public Marmelade(String inhalt, String datum, int menge)
	{
		this.inhalt = inhalt;
		this.datum = datum;
		this.menge = menge;
	}
	
	public boolean istLeer()
	{
		return (menge == 0);
	}
	
	public void ausgeben()
	{
		System.out.println(inhalt + " " + datum + " " + menge + " Unzen");
	}
	
	public void auftragen(int unzen)
	{
		if(!istLeer())
		{
			if(unzen <= menge)
			{
				System.out.println("Auftragen von " + unzen + " Unzen von " + inhalt);
				
				menge = menge - unzen;
			}
			else
			{
				System.out.println("Auftragen von " + menge + " Unzen von " + inhalt);
				
				menge = 0;
			}
		}
		else
			System.out.println("Keine Marmelade im Glas!");
	}
	
}

class VorratskammerTester
{
  public static void main(String[] args)
  {
	  
	  Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
	  Marmelade erdbeer = new Marmelade("Erdbeer", "30.09.10", 8);
	  Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 16);
	  
	  Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer, aprikosen);
	  
	  int auswahl = 0, menge = 0;
	  
	  Scanner scan = new Scanner(System.in);
	  
	  while(auswahl != -1)
	  {
		  vorrat.ausgeben();
		  System.out.println("Treffen Sie Ihre Auswahl (1, 2, oder 3). Exit -1: ");
		  auswahl = scan.nextInt();
		  
		  if(auswahl != -1)
		  {
			  vorrat.auswaehlen(auswahl);
			  
			  System.out.println("Geben Sie die Menge ein, die aufgetragen werden soll: ");
			  menge = scan.nextInt();
			  vorrat.auftragen(menge);
		  }
		  else
			  System.out.println("Good-bye");
	  }
	  
  }
}