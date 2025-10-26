package arrays;

public class LinerSearch {

    static int linearSearch(int[] a, int find){

        int n =a.length;
        for(int i=0; i<n; i++){
            if(a[i] == find){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a= {6,7,8,4,1};
        int find =0;

        int n= linearSearch(a,find);
        System.out.println("Index of the number is : " +n);
    }
}
