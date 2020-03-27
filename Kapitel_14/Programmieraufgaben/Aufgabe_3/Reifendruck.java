import java.util.*;

class Reifendruck
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int vorderreifenRechts, vorderreifenLinks;
	  int hinterreifenRechts, hinterreifenLinks;
	  
	  System.out.println("Reifendruck: rechter Vorderreifen");
	  vorderreifenRechts = scan.nextInt();
	  
	  System.out.println("Reifendruck: linker Vorderreifen");
	  vorderreifenLinks = scan.nextInt();
	  
	  System.out.println("Reifendruck: rechter Hinterreifen");
	  hinterreifenRechts = scan.nextInt();
	  
	  System.out.println("Reifendruck: linker Hinterreifen");
	  hinterreifenLinks = scan.nextInt();
	  
	  if(vorderreifenLinks ==  vorderreifenRechts && hinterreifenLinks == hinterreifenRechts)
	  {
		  System.out.println("Reifendruck ist OK");
	  }
	  else
	  {
		  System.out.println("Reifendruck bitte anpassen!");
	  }
	  
  }
}