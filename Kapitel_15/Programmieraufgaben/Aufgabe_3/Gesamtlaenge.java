import java.util.*;

class Gesamtlaenge
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String erstesWort, zweitesWort;
	  int lengthWort, lengthGesamt = 30;
	  
	  System.out.println("Geben Sie das erste Wort ein: ");
	  erstesWort = scan.nextLine();
	  
	  System.out.println("Geben Sie das zweite Wort ein: ");
	  zweitesWort = scan.nextLine();
	  
	  lengthWort = erstesWort.length() + zweitesWort.length();
	  
	  System.out.println();
	  
	  System.out.print(erstesWort);
	  
	  while(lengthWort < lengthGesamt)
	  {
		  System.out.print(".");
		  lengthWort = lengthWort + 1;
	  }
	  
	  System.out.println(zweitesWort);
	  
  }
}