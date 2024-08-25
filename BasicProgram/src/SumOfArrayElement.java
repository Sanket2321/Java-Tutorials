import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum=0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scr.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("array element is:");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("sum of element:"+sum);
        System.out.println("the avg of number is:"+sum/arr.length);
      
       
      
        }
       // System.out.println("sum of element:"+sum);
       // System.out.println("the avg of number is:"+sum/arr.length);
        
        
    }

