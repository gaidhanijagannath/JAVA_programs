package forkJoinDemo;

import java.util.concurrent.RecursiveTask;

/**
 * ComputTask implements RecursiveTask to calculate the sum of numbers using fork-join framework.
 * It divides the task into smaller subtasks when the array size exceeds the threshold.
 */
public class ComputTask extends RecursiveTask<Long> {

    private static final long serialVersionUID = 1L;

    // Threshold: if the number of elements is less than this, compute directly without forking
    private static final int THRESHOLD = 10;

    private int[] numbers;
    private int start;
    private int end;

    /**
     * Constructor to initialize the task with array and indices
     *
     * @param numbers The array of numbers to sum
     * @param start   The starting index (inclusive)
     * @param end     The ending index (exclusive)
     */
    public ComputTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    /**
     * Compute method that performs the fork-join logic
     * If the range is small enough, it computes the sum directly (base case)
     * Otherwise, it divides the task into two subtasks and merges the results
     *
     * @return The sum of numbers in the specified range
     */
    @Override
    protected Long compute() {

        // Base case: if the size is smaller than threshold, compute directly
        if ((end - start) <= THRESHOLD) {
            return computeDirectly();
        }

        // Divide: split the task into two subtasks
        int mid = (start + end) / 2;

        ComputTask leftTask = new ComputTask(numbers, start, mid);
        ComputTask rightTask = new ComputTask(numbers, mid, end);

        // Fork: execute subtasks asynchronously
        leftTask.fork();
        rightTask.fork();

        // Join: wait for results and combine them
        Long leftSum = leftTask.join();
        Long rightSum = rightTask.join();

        return leftSum + rightSum;
    }

    /**
     * Helper method to compute sum directly for small ranges
     * This is the base case of the recursion
     *
     * @return The sum of numbers in the range [start, end)
     */
    private Long computeDirectly() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

