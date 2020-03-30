import java.util.*;

class LiteralTester
{
  public static void main(String[] args)
  {
	  
	  String str1, str2, str3, str4;
	  int counter = 0;
	  
	  str1 = "Bo, die Katze";
	  str2 = "Bo, die Katze";
	  
	  str3 = new String("Fred, der Hund");
	  str4 = new String("Fred, der Hund");
	  
	  if(str1 == str2)
		  counter = counter + 1;
	  else
		  counter = counter + 2;
	  
	  if(str3 == str4)
		  counter = counter + 1;
	  else
		  counter = counter + 2;
	  
	  System.out.print("Es wurden " + counter + " Objekte erzeugt.");

  }
}