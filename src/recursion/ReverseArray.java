package recursion;

public class ReverseArray {

    public  static void reverse(int start, int a[], int n){
        if(start>=n/2)
            return;

        int temp;
        temp = a[start];
        a[start]=a[n-start-1];
        a[n-start-1]=temp;

        reverse(start+1,a,n);

        }
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,7,7,8,9};
        int n =a.length;

        reverse(0, a, n);

        System.out.println("The reverse array of the given one is: ");

        for (int x:a) {
            System.out.print(+x+ ", ");
        }

    }

}
