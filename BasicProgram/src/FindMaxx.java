public class FindMaxx {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50};
        int max = findMax(arr);
        System.out.println("Maximum value in the array: " + max);
    }

    static int findMax(int arr[]) {
        int max = arr[0]; // Initialize max with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
