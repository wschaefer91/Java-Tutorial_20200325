class ObjektPrinter2
{
  public void ausgeben(String st)
  {
    System.out.println("Erster Wert des Parameters: " + st);

    st = "Ha! Ein zweites Objekt!";

    System.out.println("Zweiter Wert des Parameter: " + st);

  }
}

class OPTester2
{
  public static void main(String[] args)
  {
    String mitteilung = "Originalobjekt";

    ObjektPrinter2 op = new ObjektPrinter2();

    System.out.println("Erster  Wert von mitteilung: " + mitteilung);

    op.ausgeben(mitteilung);

    System.out.println("Zweiter Wert von mitteilung: " + mitteilung);
  }
}