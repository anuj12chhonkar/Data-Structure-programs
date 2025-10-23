package arrays;

import static java.lang.Integer.MIN_VALUE;

public class Second_Largest_Smallest {
    static int secondLargest(int a[], int n){
        int largest = a[0];
        int slargest= MIN_VALUE;

        for(int i=0; i<n; i++){
            if(a[i]> largest){
                slargest = largest;
                largest=a[i];
            }
            else if (a[i] < largest && a[i] >slargest)
                    slargest=a[i];

        }
        return slargest;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,7,7,7,5};
        int n = arr.length;
        int sL=secondLargest(arr, n);

        System.out.println("Second largest element of the array is: " +sL);

    }

}
