package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};

        MergeSort sort = new MergeSort();

        sort.mergeSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " , ");
//        System.out.println();
    }
    void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);

            else
                temp.add(arr[right++]);
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }
    void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}
