import java.util.*;
public class Anagram {
  public static void main(String args[])
  {
	  Scanner scr=new Scanner(System.in);
	  System.out.println("Enter the String:");
	  String str1=scr.nextLine();
	  System.out.println("Enter the String2:");
	  String str2=scr.nextLine();
	  if(str1.length()==str2.length())
	  {
		  System.out.println("anagram ");
	  }
	  else
	  {
		  char arr1[]=str1.toCharArray();
          char arr2[]=str2.toCharArray();
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          if(Arrays.equals(arr1, arr2)) 
          {
        	  System.out.println("Anagram");
          }
          else
          {
        	  System.out.println("not");
          }
          
	  }
	  
	 
	  
	  
  }
}
