package arrays;

/* BRUTE FORCE APPROACH
public class Left_Rotate {

    public static void leftRotate(int[] arr, int n, int k) {

        k=k%n;

        // putting the elements in the temporary array which we have to rotate
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shifting the remaining elements
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        //put back temp array into the original one
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        leftRotate(arr, n, k);
        System.out.println("After rotating the array elements to the left");

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}

 END OF BRUTE FORCE */

// OPTIMAL APPROACH

public class Left_Rotate {

    public static void reverse(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] a, int n, int k) {

        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        int k = 3;

        leftRotate(a, n, k);

        System.out.println("After rotating the array elements to the left");

        for (int j : a) {
            System.out.print(j + " ");

        }

    }
}