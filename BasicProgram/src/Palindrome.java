public class Palindrome {
    public static void main(String[] args) {
        int originalNumber = 13232;
        int number = originalNumber;
        int rev = 0;

        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        if (originalNumber == rev) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
