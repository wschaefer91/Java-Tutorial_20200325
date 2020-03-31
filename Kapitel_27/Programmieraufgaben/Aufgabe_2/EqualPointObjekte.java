import java.awt.*;
import java.util.Scanner;

class EqualPointObjekte
{
  public static void main(String arg[])
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int x1, y1, x2, y2;
	  String str1, str2;
	  
	  System.out.println("Wert x1: ");
	  x1 = scan.nextInt();
	  
	  System.out.println("Wert x2: ");
	  x2 = scan.nextInt();
	  
	  System.out.println("Wert y1: ");
	  y1 = scan.nextInt();
	  
	  System.out.println("Wert y2: ");
	  y2 = scan.nextInt();
	  
	  Point p1 = new Point(x1, y1);
	  Point p2 = new Point(x2, y2);
	  
	  str1 = p1.toString();
	  str2 = p2.toString();
	  
	  if(p1.equals(p2))
	  {
		  System.out.println("Die Koordinaten der beiden Punkte sind gleich: ");
		  System.out.println(str1 + " und " + str2);
	  }
	  
  }
}