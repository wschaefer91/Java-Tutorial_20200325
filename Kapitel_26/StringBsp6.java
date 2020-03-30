class StringBsp6
{
  public static void main(String[] args)
  {
    String strA;  // Referenz auf das erste Objekt
    String strB;  // Referenz auf das zweite Objekt

    strA = new String("Der Gingham Hund");     // das erste Objekt erzeugen
                                               // seine Referenz speichern
    System.out.println(strA);

    strB = new String("Der Gingham Hund");     // das zweite Objekt erzeugen
                                               // seine Referenz speichern
    System.out.println(strB);

    if (strA == strB)
      System.out.println("Dies wird nicht ausgegeben werden.");
  }

}