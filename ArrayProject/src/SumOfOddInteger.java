
public class SumOfOddInteger {
   public static void main(String args[])
   {
	   int arr[]= {1 ,4,5,6};
	   int n=arr.length;   
	  int sum1= SumOfOddInteger1(arr,n);
	  System.out.println("sum of odd integer:"+sum1);
   }

private static int SumOfOddInteger1(int[] arr, int n) {
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2!=0)
		{
			sum=sum+arr[i];
		}
	}
	return sum;
}
  
}
