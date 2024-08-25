import java.util.*;
public class Repeat {
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number of value:");
		int n=scr.nextInt();
		System.out.println("Enter the String");
		String str=scr.next();
		String str1="";
		
		for(int i=0;i<n;i++)
		{
		  str1=str1+str;	
		}
		str1 = str1.replace("c", "");
	    System.out.println("the new string is\n:"+str1);
	}

}
