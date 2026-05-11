package forkJoinDemo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * ForkJoinPoolDemo demonstrates how to use ForkJoinPool to calculate
 * the sum of 100 numbers using a divide-and-conquer approach.
 */
public class ForkJoinPoolDemo {

    public static void main(String[] args) {

        // Initialize the array with 100 numbers (1 to 100)
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("=========== Fork-Join Pool Demo ===========");
        System.out.println("Calculating sum of numbers from 1 to 100 using ForkJoinPool");
        System.out.println();

        // Method 1: Using ForkJoinPool.commonPool()
        System.out.println("--- Method 1: Using Common Pool ---");
        calculateSumUsingCommonPool(numbers);

        System.out.println();

        // Method 2: Using Custom ForkJoinPool with specified parallelism
        System.out.println("--- Method 2: Using Custom ForkJoinPool ---");
        calculateSumUsingCustomPool(numbers);

        System.out.println();

        // Method 3: Verify the result
        System.out.println("--- Verification ---");
        verifyResult(numbers);
    }

    /**
     * Calculates the sum using ForkJoinPool.commonPool()
     * The common pool is shared across the application
     */
    private static void calculateSumUsingCommonPool(int[] numbers) {
        long startTime = System.currentTimeMillis();

        ForkJoinTask<Long> task = ForkJoinPool.commonPool()
                .submit(new ComputTask(numbers, 0, numbers.length));

        Long result = task.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Sum (using common pool): " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }

    /**
     * Calculates the sum using a custom ForkJoinPool with parallelism level = 4
     */
    private static void calculateSumUsingCustomPool(int[] numbers) {
        // Create a custom ForkJoinPool with parallelism level of 4
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        long startTime = System.currentTimeMillis();

        try {
            ForkJoinTask<Long> task = forkJoinPool.submit(new ComputTask(numbers, 0, numbers.length));
            Long result = task.join();

            long endTime = System.currentTimeMillis();

            System.out.println("Sum (using custom pool with parallelism=4): " + result);
            System.out.println("Time taken: " + (endTime - startTime) + " ms");
            System.out.println("Pool active threads: " + forkJoinPool.getActiveThreadCount());
            System.out.println("Pool size: " + forkJoinPool.getPoolSize());

        } finally {
            // Gracefully shutdown the pool
            forkJoinPool.shutdown();
        }
    }

    /**
     * Verifies the result by calculating sum sequentially
     */
    private static void verifyResult(int[] numbers) {
        long sequentialSum = 0;
        for (int num : numbers) {
            sequentialSum += num;
        }
        System.out.println("Sum (calculated sequentially): " + sequentialSum);
        System.out.println("Expected Sum: " + (100 * 101 / 2)); // Formula: n*(n+1)/2
    }
}

