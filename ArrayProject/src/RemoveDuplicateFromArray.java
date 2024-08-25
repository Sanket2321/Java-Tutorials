public class RemoveDuplicateFromArray {
    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 4, 5, 6};
        int n=removeDuplicate(arr);
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }

       
    }

    public static int removeDuplicate(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++; //count=1
            }
        }

        

        return count;
    }
}

