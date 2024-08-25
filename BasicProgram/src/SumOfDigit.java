import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scr.nextInt();

        int sum = 0;
        int originalNum = num; // Store the original number

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits in " + originalNum + " = " + sum);
    }
}
