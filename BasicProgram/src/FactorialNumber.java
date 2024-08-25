
public class FactorialNumber {
  public static void main(String args[])
  {
	  int n=5;
	  int factorial=fact(n);
	  System.out.println("factorial of given number is:"+factorial);
  }
  public static int fact(int n)
  {
	  if(n>=1)
	  {
		  return n* fact(n-1);
	  }
	  else
	  {
		  return 1;
	  }
  }
}
