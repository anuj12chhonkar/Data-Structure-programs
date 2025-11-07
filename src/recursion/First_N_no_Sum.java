package recursion;

public class First_N_no_Sum {
    public static int sum(int n){
        if(n==0)
            return 0;

        return n+sum(n-1);
            }
    public static void main(String[] args) {
        System.out.println("The sum of the numbers is: " +sum(3));
    }

}
