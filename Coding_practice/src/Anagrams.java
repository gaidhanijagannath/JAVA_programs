import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {


        String str1 = "Heart";
        String str2 = "Earth";

        char[] str1sort = str1.toLowerCase().toCharArray();
        Arrays.sort(str1sort);

        char[] str2sort = str2.toLowerCase().toCharArray();
        Arrays.sort(str2sort);


        if(Arrays.equals(str1sort, str2sort)) System.out.println("Anagrams.");
        else System.out.println("Not Anagrams.");


    }
}
