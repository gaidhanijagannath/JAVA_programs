public class MagicNumber {
    public static void main(String[] args) {
        int num = 163;
        int sumOfDigits = 0;


        while(num > 0 || sumOfDigits > 9){

            if (num == 0){

                num = sumOfDigits;
                sumOfDigits = 0;

            }

            sumOfDigits += num % 10;
            num /= 10;

        }

        System.out.println(sumOfDigits == 1 ? "Magic Number" :"Not an Magic number");


    }
}
