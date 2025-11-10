package sorting;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n){

        for(int i=n-1; i>=0; i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap =1;
                }
            }
            if(didSwap ==0){
                break;
            }
        }
        System.out.println("Array after the Bubble sort: ");

        for(int y: arr){
            System.out.print(y+ " ");
        }

    }
    public static void main(String[] args) {
        int a[] = {13,46,24,52,20,9};
        int n= a.length;

        System.out.println("The given array is: ");
        for(int x: a){
            System.out.print(x+ " ");
        }
        System.out.println();
        bubbleSort(a,n);

    }

}
