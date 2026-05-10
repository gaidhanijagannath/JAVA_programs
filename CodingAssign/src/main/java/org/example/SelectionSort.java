package org.example;

public class SelectionSort {

    public static void selectionSortAlgo(int[] numbers, int size){

        for (int i = 0; i < size -1 ; i++) {

            int temp= i;
            for (int j = i+1; j < size; j++) {

                if(numbers[j] < numbers[temp]){
                    temp=j;
                }

            }

            int small = numbers[temp];
            numbers[temp]=numbers[i];
            numbers[i]=small;
        }

    }
    public static void main(String[] args) {

        int[] numbersToSort = {7,3,8,9,11,1,2};

        selectionSortAlgo(numbersToSort,numbersToSort.length);

        for (int num: numbersToSort
        ) {
            System.out.println(num);
        }


    }
}
