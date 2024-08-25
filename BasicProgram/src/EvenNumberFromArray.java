 
public class EvenNumberFromArray {
  public static void main(String args[])
  {
	  int arr[]= {12,34,56,11,13,15,24,20,61,1};
	  System.out.println("element of an array\n");
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println(arr[i]);
	  }
	  System.out.println("even number is  index:");
	  for(int i=0;i<arr.length;i++)
	  {
	  if(i%2==0)
	  {
		  System.out.println(arr[i]);
	  }
	  }
	  
  }
}
