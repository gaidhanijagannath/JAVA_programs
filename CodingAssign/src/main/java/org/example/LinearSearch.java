package org.example;

public class LinearSearch {

    public static String LinearSearchAlgo(int[] numbers, int keyToSearch){

        for (int element: numbers) {
            if(element == keyToSearch){
                return "YES";
            }

        }

        return "NO";

    }

    public static void main(String[] args) {

        int[] numbers = {7,3,8,9,11}; // sorting required be careful.
        int keyToSearch = 8;

        System.out.println("Did you find the number ? - "+LinearSearchAlgo(numbers,keyToSearch));

    }
}
