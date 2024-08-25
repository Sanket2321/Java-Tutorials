import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 8, 34, 6};

        // Sort the array in descending order
       Arrays.sort(arr);

        // The second largest element is at index arr.length - 2
        int secondLarge = arr[arr.length - 2];

        System.out.println("Second largest element: " + secondLarge);
    }
}
