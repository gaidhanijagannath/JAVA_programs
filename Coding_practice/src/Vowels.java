public class Vowels {
    public static void main(String[] args) {

        System.out.println(ifStringHasVowels("Jagannath"));
        System.out.println(ifStringHasVowels("TV"));

    }

    public static boolean ifStringHasVowels(String input){

        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
