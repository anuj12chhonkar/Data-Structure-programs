package basicMaths;

public class GCDorHCF {

    public static void main(String[] args) {
        int n1 =52, n2 = 10;

        while (n1>0 && n2 >0){
            if (n1>n2)
                n1= n1%n2;
            else
                n2 = n2%n1;

        }
        if (n1==0)
            System.out.println("GCD of the given numbers is: " +n2);
        else
            System.out.println("GCD of the given numbers is: " +n1);
    }
}
