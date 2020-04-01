import java.util.*;

class HalloObjekt
{
  String mitteilung;

  HalloObjekt(String message)
  {
    mitteilung = message;
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
	  int counter = 0;
	  
	  System.out.println("Eingabe: ");
	  message = scan.nextLine();
	  
	  System.out.println();
	  
	  HalloObjekt objekt = new HalloObjekt(message);
	  
	  while(counter < message.length())
	  {
		  objekt.sprich();
		  
		  counter = counter + 1;
	  }
	  
	  
  }
}