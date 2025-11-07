package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Hashing of large numbers like 10^9 or higher
public class IntHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Precompute

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq=0;
            if(mp.containsKey(key))
                freq = mp.get(key);  // fetching from the map
            freq++;
            mp.put(key, freq); //inserting into the map
        }

        // iterate over the map
        for(Map.Entry<Integer, Integer> it : mp.entrySet())
            System.out.println(it.getKey()+ "->" +it.getValue());

        int q = sc.nextInt();
        while(q-- >0){
            int number = sc.nextInt();

            //fetch
            if(mp.containsKey(number))
                System.out.println(mp.get(number));
            else
                System.out.println(0);

        }

    }

}
