import java.util.Scanner;

class OhmscheGesetz
{
  public static void main (String[] args)
  {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int spannungU, widerstandR;
	  double stromstaerkeI;
	  
	  System.out.println("Bitte geben Sie die Spannung an: ");
	  spannungU = scan.nextInt();
	  
	  System.out.println("Bitte geben Sie den Widerstand an: ");
	  widerstandR = scan.nextInt();
	  
	  stromstaerkeI = (spannungU + 0.0) / widerstandR;
	  
	  System.out.println("Die Stromstaerke betraegt: " + stromstaerkeI);	  
	  
  }
}