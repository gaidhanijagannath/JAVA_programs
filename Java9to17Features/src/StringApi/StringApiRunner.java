package StringApi;

public class StringApiRunner {
    public static void main(String[] args) {

        System.out.println(" ".isBlank());
        System.out.println(" JDG  ".strip().replace(" ","#"));
        System.out.println(" JDG ".stripLeading().replace(" ","#"));
        System.out.println(" JDG ".stripTrailing().replace(" ","#"));


        "line1\nline2\nline3\n".lines().forEach(System.out::println); //splitting into multiple lines.

        String transformString = "JAGANNATH".transform(s -> s.substring(4));
        System.out.println(transformString);
        System.out.println("I am %s and %d years old.".formatted("Jagannath",25));


        SampleClass sample = new SampleClass();

        // isBlank() gives more details of exception in J-14 as whether class is null or str is null
        System.out.println(sample.str.isBlank());

    }

    private static class SampleClass {
        String str = null;
    }
}
