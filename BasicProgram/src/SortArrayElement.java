import java.util.*;
public class SortArrayElement {
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the array element:");
		for(int i=0;i<arr.length;i++)
				{ 
			     arr[i]=scr.nextInt();
			
				}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Element in ascending order:");
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		
				
	}

}
