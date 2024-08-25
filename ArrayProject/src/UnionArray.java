import java.util.*;

public class UnionArray



/*{
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {3, 4, 6, 7, 8, 9};

        Set<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of two arrays is: " + union);
    }

    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new TreeSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }
}*/
{
	
  public static void main(String args[])
  {
	  int arr1[]= {1,23,4,5,6,7};
	  int arr2[]= {2,5,6,7,8,9};
	  Set<Integer>union =findUnion(arr1,arr2);
	  System.out.println("union:"+union);
	  
  }
  public static  Set<Integer> findUnion(int arr1[],int arr2[])
  {
	  Set<Integer> union=new TreeSet<>();
	  for(int num:arr1)
	  {
		  union.add(num);
	  }
	  for(int num:arr2)
	  {
		  union.add(num);
	  }
	  return union;
  }

}
