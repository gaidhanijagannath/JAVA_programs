import java.util.List;

public class TypeInference {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10);

        List<List<Integer>> addedList = List.of(list1,list2);
        /* The return type is getting complex with each add on so JDK 10 improves it.Java compiler now infers the types
         of variable at compile time.
        */

        var numbers = List.of(list1,list2);

        /*
        * Var -
        *   cannot be null.
        *   NOT keyword.
        *   used in for loop.
        *
        *   */

        //System.out.println(numbers);
        numbers.stream().forEach(System.out::println);

    }
}
