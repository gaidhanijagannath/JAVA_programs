import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static void findSecondLargest(int [] pArr, int size){

        if(size < 2) {
            System.out.println("Array size is less than 2.");
            return;
        }

        for (int i = size-1; i >= 1 ; i--) {

            if (pArr[i-1] != pArr[i]){
                System.out.println("Second largest number is : "+pArr[i-1]);
                return;
            }
        }

        System.out.println("All numbers in array are identical..");

    }

    public static void main(String[] args) {


        int[] numbers = {43,5,6,78,32,89,100};
        Arrays.sort(numbers);
        findSecondLargest(numbers, numbers.length);


        List<Integer> list = Arrays.stream(numbers).boxed().toList();

        System.out.println(list.stream().sorted().distinct().skip(list.size() -2).findFirst().get());

    }
}
