import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotRunner {

    public static boolean isEven(Integer number){
        return number%2 == 0;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Predicate<Integer> evenNumberPredicate = number -> number%2 == 0;

        numbers.stream()
                .filter(evenNumberPredicate.negate()) // this will give odd numbers.
                .forEach(System.out::println);

        //but while using method referencing - negate() was not present so Predicate.not() introduced in Java 11
        numbers.stream()
                .filter(Predicate.not(PredicateNotRunner::isEven)) // will give odd numbers.
                .forEach(System.out::println);

    }
}
