import java.util.*;

class HalloObjekt
{
	
	void sprichMorgen()
	{
		System.out.println("Guten Morgen Welt!");
	}
	
	void sprichAbend()
	{
		System.out.println("Guten Abend Welt!");
	}
	
}

class HalloTester
{
  public static void main(String[] args)
  {
	  
	  HalloObjekt objekt = new HalloObjekt();
	  
	  objekt.sprichMorgen();
	  objekt.sprichAbend();
	  
  }
}