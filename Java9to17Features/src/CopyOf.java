import java.util.ArrayList;
import java.util.List;

public class CopyOf {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<String> names = new ArrayList<>();

        names.add("Jaggu");
        names.add("Onkar");
        names.add("Ravi");
        names.add("Sachin");

        List<String> copyOfNames = List.copyOf(names); // copyOf() it creates an immutable list of values - @Since Java 10

        //List.of("AB","CD","EF"); //static/unmodifiable names - @Since Java 9
        doNotChange(copyOfNames);


    }

    private static void doNotChange(List<String> copyOfNames){

        copyOfNames.add("ShouldNotBeAllowed");
        System.out.println(copyOfNames);
    }
}