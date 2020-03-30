import java.awt.*;

class EqualsDemo
{
  public static void main(String arg[])
  {
    Point pointA = new Point(7, 99);      // erstes Point-Objekt
    Point pointB = new Point(7, 99);      // zweites Point-Objekt
                                          // mit �quivalenten Daten

    if (pointA.equals(pointB))
      System.out.println("Die zwei Objekte enthalten die gleichen Daten: " 
    		  + pointA);
    else
      System.out.println("Die zwei Objekte sind nicht �quivalent: " + pointA +
       " unterscheidet sich von" + pointB);
  }
}