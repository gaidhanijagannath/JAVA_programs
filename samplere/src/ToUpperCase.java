import java.util.ArrayList;
import java.util.List;

public class ToUpperCase {

    public static void main(String[] args) {


        //using streams

        List<String> names = List.of("jagannath","akshay","rohan");

        List<String> namesUppercase = names.stream().map(String::toUpperCase).toList();
        namesUppercase.forEach(System.out::println);


        //normal way
        List<String> namesUppercase1 = new ArrayList<>();
        for (String str: names){
            namesUppercase1.add(str.toUpperCase());

        }
        System.out.println(namesUppercase1);


        //

    }
}

