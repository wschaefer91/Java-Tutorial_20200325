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
	
	public Box groessereBox()
	{
		return new Box(1.25 * this.breite, 1.25 * this.hoehe, 1.25 * this.laenge);
	}
	
	public Box kleinereBox()
	{
		return new Box(0.75 * this.breite, 0.75 * this.hoehe, 0.75 * this.laenge);
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
	
	public boolean passtIn(Box aeussereBox)
	{
		if(this.breite < aeussereBox.breite 
				&& this.hoehe < aeussereBox.hoehe 
				&& this.laenge < aeussereBox.laenge)
			return true;
		else
			return false;
		
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
	  
//	  System.out.println();
//	  box = box.groessereBox();
//	  box.anzeigenFlaecheVolumen();
//	  System.out.println("Laenge: " + box.getLaenge() 
//			  + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());
//	  
//	  System.out.println();
//	  box = box.kleinereBox();
//	  box.anzeigenFlaecheVolumen();
//	  System.out.println("Laenge: " + box.getLaenge() 
//			  + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());
//	  
//	  System.out.println();
//	  box = box.kleinereBox();
//	  box.anzeigenFlaecheVolumen();
//	  System.out.println("Laenge: " + box.getLaenge() 
//			  + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());

	  Box boxTest = new Box(3.0, 6.0, 7.0);
	  
	  if(box.passtIn(boxTest))
		  System.out.println("Diese Box passt in die aeussere Box!");
	  else
		  System.out.println("Diese Box passt nicht in die aeussere Box!");
		  
		  
  }
}