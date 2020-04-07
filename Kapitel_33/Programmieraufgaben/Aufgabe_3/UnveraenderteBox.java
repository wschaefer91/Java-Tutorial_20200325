class Box
{
	
	private double breite;
	private double laenge;
	private double hoehe;
	
	public Box(double breite, double hoehe, double laenge)
	{
		this.breite = breite;
		this.laenge = laenge;
		this.hoehe = hoehe;
	}
	
	public Box(double seite)
	{
		breite = seite;
		laenge = seite;
		hoehe = seite;
	}
	
	public Box(Box alteBox)
	{
		
	}
	
	public double berechneVolumen()
	{
		return breite * laenge * hoehe;
	}
	
	public double berechneOberflaeche()
	{
		return 2 * berechneOberflaecheVorn()
				+ 2 * berechneOberflaecheOben() 
				+ 2 * berechneOberflaecheSeitlich();
	}
	
	private double berechneOberflaecheVorn()
	{
		return breite * hoehe;
	}
	
	private double berechneOberflaecheOben()
	{
		return breite * laenge;
	}
	
	private double berechneOberflaecheSeitlich()
	{
		return hoehe * laenge;
	}
	
	public void anzeigenFlaecheVolumen()
	{
		System.out.println("Flaeche: " + berechneOberflaeche() 
				+ " Volumen: " + berechneVolumen());
	}
	
	public void anzeigenLBH()
	{
		System.out.println("Laenge: " + laenge 
			  	+ " Hoehe: " + hoehe + " Breite: " + breite);	
	}
	
	public double getLaenge()
	{
		return laenge;
	}
	
	public double getHoehe()
	{
		return hoehe;
	}
	
	public double getBreite()
	{
		return breite;
	}
	
}

class UnveraenderteBox
{
  public static void main(String[] args)
  {
	  
	  Box box = new Box(2.5, 5.0, 6.0);
	  
	  box.anzeigenFlaecheVolumen();
	  System.out.println("Laenge: " + box.getLaenge() 
			  + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());
 
  }
}