import java.util.*;

class EchoNamen
{
  public static void main(String args[])
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String name, vorname, nachname;
	  
	  int index = 0, length;
	  
	  System.out.println("Geben Sie Ihren Namen ein: ");
	  name = scan.nextLine().trim();
	  
	  System.out.println();
	  
	  index = name.indexOf(" ");
	  length = name.length();
	  
	  vorname = name.substring(0, index).trim();
	  nachname = name.substring(index, length).trim().toUpperCase();
	  
	  System.out.println(vorname + " " + nachname);
	  
  }
}