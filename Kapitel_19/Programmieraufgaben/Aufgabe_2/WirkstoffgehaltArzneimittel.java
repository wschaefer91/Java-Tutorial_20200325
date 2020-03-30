import java.util.Scanner;

class WirkstoffgehaltArzneimittel
{
  public static void main(String[] args)
  {
	  
	  int monat = 0;
	  double wirkstoffgehalt = 100.0;
	  
	  System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " + wirkstoffgehalt);
	  
	  while(wirkstoffgehalt >= 50.0)
	  {
		  monat = monat + 1;
		  wirkstoffgehalt = wirkstoffgehalt * 0.96;
		  
		  if(wirkstoffgehalt >= 50.0)
		  {
			  System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " 
					  + wirkstoffgehalt);
		  }
		  else
		  {
			  System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " 
					  + wirkstoffgehalt + " ABGELAUFEN");
		  }
	  }	  
	  
  }
}