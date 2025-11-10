package sorting;

public class InsertionSort {

    static void insertionSort(int a[], int n){

        for(int i=0; i<=n-1; i++){
            int j=i;
            while(j>0 && a[j-1] > a[j]){

                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }

        System.out.println("Array after the insertion sort : ");

        for(int y:a){
            System.out.print(y+ " ");
        }

    }

    public static void main(String[] args) {

        int a[] = {6,5,4,3,2,1};
        int n= a.length;

        System.out.println("The given array is: ");
        for(int x: a){
            System.out.print(x+ " ");
        }

        System.out.println();
        insertionSort(a,n);
    }


}
