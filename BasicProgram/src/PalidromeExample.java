import java.util.Scanner;

public class PalidromeExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String original = in.nextLine();
        String reverse = new StringBuilder(original).reverse().toString();
        if (original.equals(reverse)) {
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string isn't a palindrome.");
        }
    }
}

