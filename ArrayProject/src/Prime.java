import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
           
            // Print the number if it's prime
            if (isPrime) {
            	
                System.out.println( "prime number is"+array[i] );
            }
        }
    }
}
