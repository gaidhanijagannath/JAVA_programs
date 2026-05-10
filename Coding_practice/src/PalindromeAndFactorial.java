public class PalindromeAndFactorial {

    public static void main(String[] args) {
        String palindrome = "abcdedcba";

        System.out.println(checkIfPalindromeString(palindrome));


        System.out.println(factorial(5));


    }

    public static boolean checkIfPalindromeString(String pPalindrome){

        int size = pPalindrome.length();
        for (int i = 0; i < size/2 ; i++) {

            if(pPalindrome.charAt(i)!= pPalindrome.charAt(size-1-i)){
                return false;
            }

        }
        return true;
    }

    public static long factorial(long n) {
        if (n == 0 )
            return 1;
        else
            return (n * factorial(n - 1));
    }

}
