public class Reverse {

    public static void main(String[] args) {

        String reverseStr = "jagannath";
        System.out.println(reverse(reverseStr));


        //System.out.println(new StringBuilder().append(reverseStr).reverse());



    }

    public static String reverse(String str){

        if (str == null)
            throw new IllegalArgumentException("Not an valid input.");


        StringBuilder out = new StringBuilder(); // String reverseStr = "";

        char[] chars = str.toCharArray();

        for (int i = chars.length -1 ; i >= 0 ; i--) {

            out.append(chars[i]); // reverseStr += str.charAt(i);

        }

        //return out.toString();

        return new StringBuilder().append(str).reverse().toString();

    }
}
