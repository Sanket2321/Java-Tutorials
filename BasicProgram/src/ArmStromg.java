
public class ArmStromg {
  public static void main(String args[])
  {
	  int n=153;
	  int length=0;
	  int t1=n;
	  while(t1!=0)
	  {
		  t1=t1/10;
		  length=length+1;
		 
		  
	  }
	  int t2=n;
	 
	  int arm=0;
	  
	  while(t2!=0)
	  {
		  int rem;
		  int mult=1;
		  
		  rem=t2%10;
		  for(int i=1;i<=length;i++)
		  {
			  mult=mult*rem;
			  
		  }
		  arm=arm+mult;
		  t2=t2/10;
		  
	  }
	  if(arm==n)
	  {
		  System.out.println(n+"is armstrong");
	  }
	  else {
		  System.out.println(n+"not arnstrong");
	  }
  }
}
