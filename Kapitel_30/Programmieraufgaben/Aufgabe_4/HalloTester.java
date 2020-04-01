import java.util.*;

class HalloObjekt
{
	
	String mitteilung;
	
	HalloObjekt(String mitteilung)
	{
		this.mitteilung = mitteilung;
	}
	
	HalloObjekt(HalloObjekt einHalloObjekt)
	{
		String str = new String(einHalloObjekt.mitteilung);
	}
	
	void sprich()
	{
		System.out.println(mitteilung);
	}
	
}

class HalloTester
{
  public static void main(String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String message;
	  
	  System.out.println("Geben Sie die Mitteilung ein: ");
	  message = scan.nextLine();
	  
	  System.out.println();
	  
	  HalloObjekt objekt = new HalloObjekt(message);
	  HalloObjekt objektStr = new HalloObjekt(objekt.mitteilung);
	  
	  objekt.sprich();
	  objektStr.sprich();
	  
  }
}