package recursion;

public class Fibonacci {

    public static int fib(int n){
        if(n<=1)
            return n;

        int last = fib(n-1);
        int sLast = fib(n-2);
int i= last + sLast;
       return i;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(+fib(n));
    }

}
