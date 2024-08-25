import java.util.*;

public class ReverseString {
  public static void main(String args[])
  {
	 /* String input="my name is sanket";
	  StringBuilder b=new StringBuilder();
	  b.append(input);
	  b.reverse();
	  System.out.println(b);*/
	  String str="hello sanket";
	    String words[]=str.split("");
	    StringBuilder b=new StringBuilder();
	    for(int i =words.length-1;i>=0;i--)
	    {
	    	b.append(words[i]);
	    	
	    }
	    System.out.println(b.toString());
  }
}
