
public class NewSortedArray {
	public static void main(String args[])
	{
		int array[]= {1,2,3,4,5,6,7};
		int a1[]= {3,4,6,7,8,9};
		int firstArray=0;
		int secondArray=0;
		int newArray= [];
		while(firstArray<array.length && secondArray<a1.length)
		{
			
			if(array[firstArray]<a1[secondArray])
			{
				newArray.push(array[firstArray]);
				firstArray++;
			}
			else
			{
				newArray.push(a1[secondArray]);
				secondArray++;
			}
		}
		
		
		}
	

}
