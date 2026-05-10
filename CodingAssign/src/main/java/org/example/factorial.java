package org.example;

public class factorial {
    public static void main(String[] args) {

        // Problem 2 : factorial in java using recursion
        int number = 5;

        long factorialOfNumber = findFactorial(number);
        System.out.println("factorial of number : "+factorialOfNumber);


    }

    public static long findFactorial(int num){

        if(num >= 1){
            return num * findFactorial(num-1);
        }
        else{
            return 1;
        }
    }
}
