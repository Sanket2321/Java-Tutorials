import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = new int[5];
        
        System.out.println("Enter the array elements:");
        Scanner scr = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scr.nextInt();
        }
        
        System.out.println("Reverse of the array is:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        
        scr.close(); // Closing the scanner to prevent resource leaks
    }
}
