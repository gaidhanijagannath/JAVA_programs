import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 5, 6, 3, 7};
        int size = numbers.length+1;

        IntStream intStream = Arrays.stream(numbers);
        int sum1 = intStream.sum();

        int ArithmeticSum =  size*(size +1)/2;


        System.out.println("Number missing is " + (ArithmeticSum - sum1));
    }
}
