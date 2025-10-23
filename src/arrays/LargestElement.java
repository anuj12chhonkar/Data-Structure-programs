package arrays;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = {0,3,10,2,9,45,16,19};
        int largest = arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("The largest element of the Array is: " +largest);

    }
}
