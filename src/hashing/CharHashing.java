package hashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // Precompute

        int[] hash = new int[256];
        for (int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }
// q is having the number of queries

        int q = sc.nextInt();
        while(q-- > 0){
            char c = sc.next().charAt(0);

            // Fetch
            System.out.println(hash[c]);
        }
    }
}
