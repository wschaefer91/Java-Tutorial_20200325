class NullDemo1
{
  public static void main(String[] arg)
  {
	  
    String a = "Zufaellige Notizen"; // 1.  Ein Objekt wird erzeugt;
                                     //     die Variable a verweist darauf.
    String b = null;                 // 2.  Die Variable b verweist
                                     //    auf kein Objekt.
    String c = "";                   // 3.  Ein Objekt wird erzeugt
                                     //     (es enth�lt keine Zeichen);
                                     //     die Variable c verweist darauf.

    if (a != null)                   // 4.  ( a != null ) ist true, also
       System.out.println(a);        // 5.  wird println( a ) ausgef�hrt.

    if (b != null)                   // 6.  ( b != null ) ist false, also
       System.out.println(b);        // 7.  wird println( b ) ausgelassen.

    if (c != null)                   // 8.  ( c != null ) ist true, also
       System.out.println(c);        // 9.  wird println( c ) ausgef�hrt.
                                     // (Aber es gibt keine Zeichen zum Ausgeben.)
  }
}