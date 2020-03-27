import java.util.*;

class ReifendruckZumZweiten
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int vorderreifenRechts, vorderreifenLinks;
	  int hinterreifenRechts, hinterreifenLinks;
	  int untergrenzeDruck = 35, obergrenzeDruck = 45;
	  boolean druckOK = true;
	  
	  System.out.println("Reifendruck: rechter Vorderreifen");
	  vorderreifenRechts = scan.nextInt();
	  if(vorderreifenRechts < untergrenzeDruck || vorderreifenRechts > obergrenzeDruck)
	  {
		  System.out.println("Warnung: Der Reifendruck ist ausserhalb des erlaubten Bereichs!");
		  System.out.println();
		  druckOK = false;
	  }
	  
	  System.out.println("Reifendruck: linker Vorderreifen");
	  vorderreifenLinks = scan.nextInt();
	  if(vorderreifenLinks < untergrenzeDruck || vorderreifenLinks > obergrenzeDruck)
	  {
		  System.out.println("Warnung: Der Reifendruck ist ausserhalb des erlaubten Bereichs!");
		  System.out.println();
		  druckOK = false;
	  }
	  
	  System.out.println("Reifendruck: rechter Hinterreifen");
	  hinterreifenRechts = scan.nextInt();
	  if(hinterreifenRechts < untergrenzeDruck || hinterreifenRechts > obergrenzeDruck)
	  {
		  System.out.println("Warnung: Der Reifendruck ist ausserhalb des erlaubten Bereichs!");
		  System.out.println();
		  druckOK = false;
	  }
	  
	  System.out.println("Reifendruck: linker Hinterreifen");
	  hinterreifenLinks = scan.nextInt();
	  if(hinterreifenLinks < untergrenzeDruck || hinterreifenLinks > obergrenzeDruck)
	  {
		  System.out.println("Warnung: Der Reifendruck ist ausserhalb des erlaubten Bereichs!");
		  System.out.println();
		  druckOK = false;
	  }
	  
	  System.out.println();
	  
	  if(druckOK != true || (vorderreifenLinks != vorderreifenRechts && hinterreifenLinks != hinterreifenRechts))
	  {
		  System.out.println("Reifendruck bitte anpassen!");
	  }
	  else
	  {
		  System.out.println("Reifendruck ist OK");
	  }
	  
  }
}