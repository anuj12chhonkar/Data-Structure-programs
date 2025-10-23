package arrays;

public class Left_Rotate {

    public static void leftRotate(int[] arr, int n, int k){

        int[] temp = new int[k];
        for (int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=k;i<n;i++){
            arr[i-k] =arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }

    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n= arr.length;

        leftRotate(arr,n,k);
        System.out.println("After rotating the array elements to the left");

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}