import java.util.Scanner;

class MeilenProGallone
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int anfangsstand, endstand, gallonen;
	  double meilenProGallone = 0.0;
	  boolean standPositiv = true;
	  
	  System.out.println("Programm Meilen pro Gallone");
	  
	  while(standPositiv == true)
	  {
		  
		  System.out.println("Anfangsstand Meilen: ");
		  anfangsstand = scan.nextInt();
		  
		  if(anfangsstand > 0)
		  {
			  System.out.println("Endstand Meilen: ");
			  endstand = scan.nextInt();
			  
			  System.out.println("Gallonen: ");
			  gallonen = scan.nextInt();
			  
			  meilenProGallone = (endstand - anfangsstand) / gallonen;
			  
			  System.out.println("Meilen pro Gallone: " + meilenProGallone);
			  
			  System.out.println();
		  }
		  else
		  {
			  standPositiv = false;
			  System.out.println("bye");
		  }

	  }
	  
  }
}