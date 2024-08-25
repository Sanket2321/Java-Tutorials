public class FindMax {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Call the findMax method and store the result
        int max = findMax(a, b, c);

        System.out.println("The max among :"+ max);
    }

    // Method to find the maximum value among three integers
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
