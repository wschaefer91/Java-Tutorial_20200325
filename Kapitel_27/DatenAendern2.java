import java.awt.*;

class DatenAendern2
{
  public static void main(String arg[])
  {
    Point pt = new Point(12, 45);         // ein Point-Objekt konstruieren
    System.out.println("Anfangswerte: " + pt);

    pt = new Point(-13, 49);              // ein weiteres Point-Objekt konstruieren
    System.out.println("Endwerte: " + pt);
  }
}