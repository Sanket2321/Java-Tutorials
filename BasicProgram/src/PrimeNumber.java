
public class PrimeNumber {
 public static void main(String args[])
 {
	 System.out.println("Enter the upper limit:");
	  java.util.Scanner scr=new java.util.Scanner(System.in);
	  int n=scr.nextInt();
	  System.out.println("ennter  the range between 1 "+ n +":");
	  for(int i=2;i<=n;i++)
	  {
		  if(isPrime(i))
		  {
			  System.out.println(i+" ");
		  }
	  }
 }
 static boolean isPrime(int n)
 {
	 if(n<2)
	 {
		 return false;
	 }
	 for(int i=2;i<=Math.sqrt(n);i++)
	 { 
		 if(n%i==0)
		 {
			 return false;
		 }
	 }
	 return true;
 }
}
