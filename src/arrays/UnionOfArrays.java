package arrays;

import java.util.ArrayList;
import java.util.HashSet;
/* BRUTE SOLUTION
public class UnionOfArrays {

    public static ArrayList<Integer> unionOfArrays(int[] a1, int[] a2, int n, int m) {

        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st.add(a1[i]);
        }

        for (int i = 0; i < m; i++) {
            st.add(a2[i]);
        }


        for (int x : st) {
            union.add(x);
        }

        // above for loop can be replaced in below two ways
        // ArrayList<Integer> union = new ArrayList<>(st);
        // union.addAll(st);

        return union;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 1, 2, 2, 3, 4, 5};
        int[] a2 = {2, 3, 4, 4, 5, 6};

        int n = a1.length;
        int m = a2.length;

        ArrayList<Integer> union = unionOfArrays(a1, a2, n, m);

        System.out.println("The union of the given two arrays is: ");

        for(int y: union)
            System.out.print(y+ " ");

    }
}
*/

// TWO POINTERS APPROACH (optimal solution)

public class UnionOfArrays {


    public static ArrayList <Integer> unionOfArrays (int[] a1, int[] a2, int n, int m){

        int i=0, j= 0; // pointers

        ArrayList<Integer> union = new ArrayList<>();

        while (i<n && j<m){
            if (a1[i] <= a2[j]){
                if (union.size() == 0 || union.get(union.size() -1) !=a1[i])
                    union.add(a1[i]);
                i++;
            }
            else{
                if (union.size() == 0 || union.get(union.size() -1) !=a2[j])
                    union.add(a2[j]);
                j++;
            }

        }

        while (i < n) // IF any element left in a1
        {
            if (union.get(union.size()-1) != a1[i])
                union.add(a1[i]);
            i++;
        }
        while (j < m) // If any elements left in a2
        {
            if (union.get(union.size()-1) != a2[j])
                union.add(a2[j]);
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 1, 2, 2, 3, 4, 5,6,7,8,9,10};
        int[] a2 = {2, 3, 4, 4, 5, 6};

        int n = a1.length;
        int m = a2.length;

        ArrayList<Integer> union = unionOfArrays(a1, a2, n, m);

        System.out.println("The union of the given two arrays is: ");

        for(int y: union)
            System.out.print(y+ " ");

    }
}
