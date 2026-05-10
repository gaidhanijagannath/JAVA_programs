package org.example;

public class BubbleSort {

    public static void bubbleSortAlgo(int[] num, int size){

        int temp;
        for (int i = 0; i < (size -1); i++) {

            for (int j = 0; j < size - i -1 ; j++) {

                if(num[j] > num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {

        int[] numbersToSort = {7,3,8,9,11};
        bubbleSortAlgo(numbersToSort,numbersToSort.length);

        for (int num: numbersToSort
             ) {
            System.out.println(num);
        }

    }
}
