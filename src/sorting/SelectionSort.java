package sorting;

public class SelectionSort {

    static void selectionSort(int[] arr, int n){

        for(int i=0; i<=n-2;i++){
            int mini=i;
            for(int j=i+1; j<=n-1;j++){
                if(arr[j] < arr[mini])
                    mini=j;
            }

            // Swap(arr[mini], arr[i])
            int temp= arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After the selection sort the array will become: ");
        for(int y: arr)
            System.out.print(y+ " ");

    }

    public static void main(String[] args) {
        int[ ] a = {13,46,24,52,20,9};
        int n = a.length;

        System.out.println("The given array is: ");

        for(int x: a){
            System.out.print(x+ " ");
        }
        System.out.println();
        selectionSort(a,n);

    }

}
