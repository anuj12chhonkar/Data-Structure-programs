package recursion;

public class Palindrome {

    public static boolean palindrome(int i, String s){

        int n = s.length();
        if(i>=n/2)
            return true;

        if(s.charAt(i) != s.charAt(n-i-1))
            return false;

        return palindrome(i+1,s);

    }

    public static void main(String[] args) {
        String s = "MADSM";

        System.out.println("The given string is Palindrome: " +palindrome(0,s));
    }

}
