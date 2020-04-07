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
	
	public double berechneVolumen()
	{
		return breite * laenge * hoehe;
	}
	
	public double berechneOberflaeche()
	{
		return 2 * (breite * hoehe + breite * laenge + hoehe * laenge);
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
	
}

class UnveraenderteBox
{
  public static void main(String[] args)
  {
	  
	  Box box = new Box(2.5, 5.0, 6.0);
	  
	  box.anzeigenFlaecheVolumen();
	  box.anzeigenLBH();
 
  }
}