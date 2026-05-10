package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static void BinarySearchAlgo(int[] numbers, int start, int end, int key){

        int middle = (start+end)/2;

        while (start<=end){

            if(numbers[middle] < key){

                start = middle+1;

            }else if(numbers[middle] == key){

                System.out.println("Found the key as requested at index - " + middle);
                break;

            }else{
                end = middle -1 ;
            }

            middle = (start+end)/2;
        }

        if (start > end){
            System.out.println("Couldn't find key requested :/");
        }

    }
    public static void main(String[] args) {

        int[] numbers = {7,3,8,9,11}; // sorting required be careful.
        Arrays.sort(numbers);

        int keyToSearch = 8;
        BinarySearchAlgo(numbers,0,numbers.length-1,keyToSearch);
    }
}
