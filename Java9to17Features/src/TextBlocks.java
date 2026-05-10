public class TextBlocks {
    public static void main(String[] args) {

        System.out.println("\"First Line\"\n\"Second line\"\n\"Third line\""); //not readable and complex

        //Text Blocks - JDK 14-15
        System.out.println("""
                    "jagannath"
                        "Dnyaneshwar"
                  "Gaidhani"
                """);

        String TexBlock = """
                Line 1:%s
                Line 2:%s
                Line 3
                Line 4
                """.formatted("some values","Some other Value");

        System.out.println(TexBlock);
    }
}
