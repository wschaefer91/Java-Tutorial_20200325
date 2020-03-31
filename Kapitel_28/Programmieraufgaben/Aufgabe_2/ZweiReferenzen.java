import java.awt.*;

class ZweiReferenzen
{
  public static void main(String[] args)
  {
	  
	  Point pt1 = new Point(10, 10);
	  Point ptAlias = pt1;

	  if(pt1 == ptAlias)
	  {
		  System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!");
	  }
	  
	  System.out.println();
	  System.out.println("Point pt1 vorher: \t" + pt1.toString());
	  System.out.println("Point ptAlias vorher: \t" + ptAlias.toString());
	  
	  System.out.println();
	  
	  System.out.println("Nur von ptAlias wurden die x- und y-Werte verdoppelt.");
	  
	  ptAlias.x = ptAlias.x * 2;
	  ptAlias.y = ptAlias.y * 2;
	  
	  System.out.println();
	  System.out.println("Point pt1 nachher: \t" + pt1.toString());
	  System.out.println("Point ptAlias nachher: \t" + ptAlias.toString());
	  
	  
	  
  }
}