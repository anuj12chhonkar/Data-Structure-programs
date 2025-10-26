package arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {

   static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B, int n, int m){

       ArrayList<Integer> ans = new ArrayList<>();
       int i=0, j=0;
       while (i<n && j<m ){
           if(A[i] < B[j])
               i++;
           else if (B[j] <A[i])
               j++;
           else {
               ans.add(A[i]);
               i++;
               j++;
           }
       }

       return ans;
   }

    public static void main(String args[])
    {
        // Array Initialisation.
        int A[]= {1,2,3,3,4,5,6,7};
        int B[]= {3,3,4,4,5,8};

        int n= A.length;;
        int m = B.length;

        ArrayList<Integer> ans= intersectionOfArrays(A,B,n,m);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
}
