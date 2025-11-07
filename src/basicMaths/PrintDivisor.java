package basicMaths;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class PrintDivisor {
    public static ArrayList<Integer> getDivisor (int n){
        ArrayList<Integer> divs = new ArrayList<>();

        for(int i=1; i*i<=n; i++){
            if(n%i ==0){
                divs.add(i);
                if(i!=n/i){
                    divs.add(n/i);
                }
            }
        }
    return divs;

    }

    public static void main(String[] args) {
        int n= 39;
        ArrayList<Integer> result = getDivisor(n);
        Collections.sort(result);

        System.out.println("All the divisors of the given number are: ");


        for (int x: result ) {
            System.out.print(+x+ ", ");
        }
    }

}
