import java.util.Scanner;

public class MinAndMaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            
        
        System.out.println("Enter the element to be srarch:");
        int x=scanner.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
        if(x==arr[i]) {
        	System.out.println(x+"is found at index "+i);
        	flag=true;
        	break;
        }
        }
        if(flag==false)
        {
        	System.out.println("not found");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
