import java.util.Scanner;

// Alle Integer addieren, die der Anwender eingibt.
// Nach dem letzten Integer der addiert wird, gibt der Anwender eine 0 ein.
//
class AddUpNumbers
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String suffix;
    int value;             // Daten, die der Anwender eingibt
    int count = 0;         // Wie viele Integer bis jetzt addiert wurden
    int sum = 0;           // Initialisieren von sum

    // den ersten Wert holen
    System.out.println("Enter first integer (enter 0 to quit): ");
    value = scan.nextInt();

    while(value != 0)
    {
      // addiere value zu sum
      sum = sum + value;       // gegenw�rtigen Wert zur Summe addieren
      count = count + 1;       // ein Integer mehr wurde addiert

      // Eingabeaufforderung f�r den n�chsten Wert
      if(count + 1  == 2)
        suffix = "nd";
      else
        if(count + 1 == 3)
          suffix = "rd";
        else
          suffix = "th";
      
      System.out.println("Enter the " + (count + 1) + suffix +
                          " integer (enter 0 to quit): ");

      // den n�chsten Wert vom Anwender holen
      value = scan.nextInt();

    }

    System.out.println("Sum of the integers: " + sum);
  }
}