class ObjektPrinter
{
  public void ausgeben(String st)
  {
    System.out.println("Wert des Parameters: " + st);
  }
}

class OPTester
{
  public static void main(String[] args)
  {
    String mitteilung = "Nur ein Objekt";

    ObjektPrinter op = new ObjektPrinter();

    System.out.println("Erster  Wert von mitteilung: " + mitteilung);
    op.ausgeben(mitteilung);
    System.out.println("Zweiter Wert von mitteilung: " + mitteilung);
  }
}