import java.util.Scanner;

public class PrimeUsingDoWhileLoop {
    public static void main(String[] args) {
        int n;
        int count = 0;
        System.out.println("Enter the number:");
        Scanner scr = new Scanner(System.in);
        n = scr.nextInt();

        // Initialize the loop
        int i = 1;
        do {
            if (n % i == 0) {
                count++;
            }
            i++;
        } while (i <= n);

        // Check if the number is prime
        if (count == 2) {
            System.out.println("Prime number");
            
        } else {
            System.out.println("Not prime");
        }
    }
}
