import java.util.*;

class Anrede
{
  public static void main(String args[])
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String name;
	  
	  System.out.println("Geben Sie einen Namen ein: ");
	  name = scan.nextLine().trim();
	  
	  while(name.trim().length() != 0)
	  {
		  if(name.toLowerCase().startsWith("amy") 
				  || name.toLowerCase().startsWith("buffy")
				  || name.toLowerCase().startsWith("cathy"))
		  {
			  System.out.println("Ms. " + name);		  
		  }
		  else if(name.toLowerCase().startsWith("elroy")
				  || name.toLowerCase().startsWith("fred")
				  || name.toLowerCase().startsWith("graham"))
		  {
			  System.out.println("Mr. " + name);
		  }
		  else
		  {
			  System.out.println(name);
		  }
		  
		  System.out.println();
		  
		  System.out.println("Geben Sie einen Namen ein: ");
		  name = scan.nextLine();
		  
	  }
	  
  }
}