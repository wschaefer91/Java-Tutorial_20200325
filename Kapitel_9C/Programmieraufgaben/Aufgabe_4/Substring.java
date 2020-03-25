class Substring
{
  public static void main (String[] args)
  {
	  
	  int startIndex, endIndex;
	  startIndex = 0;
	  endIndex = 27;
	  
	  String str = new String("Golf is a good walk spoiled."); 
	  
	  String sub = str.substring(endIndex, startIndex);

	  System.out.println(sub);

  }
}