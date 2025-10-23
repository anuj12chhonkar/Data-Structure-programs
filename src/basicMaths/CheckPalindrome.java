package BasicMaths;

public class CheckPalindrome {

    static boolean palindromeCheck(int num) {

        int rev = 0;
        int dupl = num;

        while (num > 0) {
            int lastDigit = num % 10;

            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        if (dupl == rev) {

            return true;
        } else {

            return false;
        }
    }
        public static void main (String[]args){
            int n=1221;

            System.out.println("Checking pallindrome");

            if (palindromeCheck(n)) {
                System.out.println(n + " is a palindrome.");
            } else {
                System.out.println(n + " is not a palindrome.");
            }

        }


}