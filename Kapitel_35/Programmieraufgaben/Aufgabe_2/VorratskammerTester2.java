import java.util.*;

class Vorratskammer
{
	
	private Marmelade glas1;
	private Marmelade glas2;
	private Marmelade glas3;
	private Marmelade glasAusgewaehlt;
	
	public Vorratskammer(Marmelade glas1)
	{
		System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
		this.glas1 = glas1;
		this.glas2 = null;
		this.glas3 = null;
		glasAusgewaehlt = null;
	}
	
	public Vorratskammer(Marmelade glas1, Marmelade glas2)
	{
		System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = null;
		glasAusgewaehlt = null;
	}
	
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
		
		if(glas1 != null)
		{
			System.out.print("1: "); 
			glas1.ausgeben();
		}
		if(glas2 != null)
		{
			System.out.print("2: "); 
			glas2.ausgeben();
		}
		if(glas3 != null)
		{
			System.out.print("3: "); 
			glas3.ausgeben();
		}
	}
	
	public boolean auswaehlen(int glasNummer) 
	{
		if (glasNummer == 1) 
		{
			if (glas1 != null) 
			{
				glasAusgewaehlt = glas1;
				return true;
			} 
		} 

		if (glasNummer == 2) 
		{
			if (glas2 != null) 
			{
				glasAusgewaehlt = glas2;
				return true;
			} 
		} 
		
		if(glasNummer == 3)
		{
			if (glas3 != null) 
			{
				glasAusgewaehlt = glas3;
				return true;
			} 
		}
		return false;
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

class VorratskammerTester2
{
  public static void main(String[] args)
  {
	  
	  Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
	  Marmelade erdbeer = new Marmelade("Erdbeer", "31.09.10", 8);
	  
	  Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer);
	  vorrat.ausgeben();
	  
	  if(vorrat.auswaehlen(1))
		  vorrat.auftragen(2);
	  else
		  System.out.println("Auswahl nicht verfuegbar");
	  vorrat.ausgeben();
	  
	  if(vorrat.auswaehlen(3))
		  vorrat.auftragen(2);
	  else
		  System.out.println("Auswahl nicht verfuegbar");
	  vorrat.ausgeben();
	  
  }
}