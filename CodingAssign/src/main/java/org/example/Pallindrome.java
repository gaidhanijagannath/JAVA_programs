package org.example;

public class Pallindrome {
    public static void main(String[] args) {

        //Problme 1 -  string pallindrome

        String str = "abdba";
        StringBuilder strReverse = new StringBuilder();

        int size = str.length();

        for (int i = size -1; i >= 0 ; --i) {

            strReverse.append(str.charAt(i));
        }

        if(str.equalsIgnoreCase(strReverse.toString())){
            System.out.println("Pallindrome");
        }else{
            System.out.println("not pallindrome");
        }

    }
}